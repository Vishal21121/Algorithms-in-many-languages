package main

import "fmt"

func main(){
    var c int
	var a int = 0
	var b int  = 1
	var sum int = 0
	var n int
    fmt.Printf("enter the number:");
    fmt.Scanf("%d",&n);

    for i:=1;i<=n;i++{
        sum= sum +a;
        if(a==0){
            fmt.Printf("%d",a)
		}else{
            fmt.Printf("+%d",a);
		}
        c=a+b;
        a=b;
        b=c;

    }
fmt.Printf("\nthe sum is : %d",sum);
}