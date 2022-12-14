package main

import "fmt"

func main() {
	var n int
	var sum int = 0
	fmt.Printf("enter the number:")
	fmt.Scanf("%d", &n)
	var temp int = n
	for n > 0 {
		var r int = n % 10
		sum = sum + r
		n = n / 10
	}
	if temp%sum == 0 {
		print("harshad number")
	} else {
		print("not harshad number")
	}
}
