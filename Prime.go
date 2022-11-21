package main

import "fmt"

func main(){
	var num int;
	fmt.Printf("Enter the number:")
	fmt.Scanln(&num)
	var flag int = 0

	if(num<=1){
		fmt.Print("the number is neither prime nor composite")
	}else{
		for i:=2;i<num;i++{
			if(num%i==0){
				flag = 1
			}
		}
		if(flag==1){
			fmt.Print("the number is not prime")
		}else{
			fmt.Print("the number is prime")
		}
	}
	
}