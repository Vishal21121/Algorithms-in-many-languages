// A number is said to be the Harshad number if it is divisible by the sum of its digit.

#include<stdio.h>

void main(){
    int n,sum = 0;
    printf("enter the number:");
    scanf("%d",&n);
    int temp = n;
    while(n>0){
        int r = n%10;
        sum = sum +r;
        n = n/10;
    }
    if(temp%sum == 0){
        printf("harshad number");
    }else{
        printf("not harshad number");
    }
}