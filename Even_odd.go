package main

import "fmt"

func main(){
	var num int;
	fmt.Printf("Enter the number:")
	fmt.Scanln(&num);
	if (num % 2 == 0){
            fmt.Printf("Even number");
    }else
	{
		fmt.Printf("odd number");
    }
}