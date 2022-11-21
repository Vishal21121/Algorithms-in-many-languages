package main

import "fmt"

func main(){
	var num int;
    fmt.Printf("Enter the number:");
    fmt.Scanln(&num);
    var temp int = num
	var  sum int = 0
	var r int = 0;
    for  num > 0{
        r = num % 10;
        sum = sum + (r * r * r);
        num = num / 10;
    }
    if sum == temp{
        fmt.Printf("number is armstrong");
    }else{
        fmt.Printf("number is not armstrong");
    }
}