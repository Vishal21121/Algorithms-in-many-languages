package main

import "fmt"

func main() {
	var n int;
	fmt.Printf("Enter the number:")
	fmt.Scanln(&n);
	var sum int = 0
	for i := 1; i < n; i++ {
		if n%i == 0 {
			sum = sum + i
		}
	}
	if sum == n {
		fmt.Printf("perfect number")
	} else {
		fmt.Printf("Not perfect number")
	}
}
