package main

import "fmt"

func main(){
    var num int;
    fmt.Printf("Enter the number:");
    fmt.Scanln(&num);
    var temp int = num
	var sum int = 0;
    for num > 0{
        var r int = num % 10;
        sum = (sum * 10) + r;
        num = num / 10;
    }
    if sum == temp{
        fmt.Printf("Palindrome number");
    }else{
        fmt.Printf("not Palindrome number");
    }
}