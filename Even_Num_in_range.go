package main

import "fmt"

func main(){
	var i int
	var n int = 100
	var sum int = 0
fmt.Printf("the even numbers in range are:");
for i = 1; i <= n; i++{
    if i % 2 == 0 {
        sum = sum + i;
        fmt.Print(i, " ")
    }
}
fmt.Print("\nthe sum of even number in range is: ", sum);
}