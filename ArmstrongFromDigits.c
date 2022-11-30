#include<stdio.h>

void main(){
    printf("Enter the number:");
    int n;
    scanf("%d",&n);
    int sum = 0;
    while(n>0){
        int r = n%10;
        sum += r;
        n = n/10;
    }
    int temp = sum,val=0;
    while(sum>0){
        int r = sum % 10;
        val = val + (r*r*r);
        sum = sum /10;
    }
    if(temp==val){
        printf("armstrong number");
    }else{
        printf("not armstrong number");
    }
}