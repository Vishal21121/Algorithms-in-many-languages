package main

import "fmt"

func main() {
	var n int;
	fmt.Print("Enter the number:")
	fmt.Scanln(&n)
	var sum int = 0
	for n > 0 {
		var r int = (n % 10)
		sum += r
		n = n / 10
	}
	var temp int = sum
	var val int = 0
	for sum > 0 {
		var r int = sum % 10
		val = val + (r * r * r)
		sum = sum / 10
	}

	if temp == val {
		fmt.Print("armstrong number")
	} else {
		fmt.Print("not armstrong number")

	}
}
