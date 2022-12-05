#include<stdio.h>
int factorial(int num)
{ 
    if(num==0 || num==1 )
    return 1;
    else
    return num*(factorial(num-1));
}
int main()
{ int num;
    printf("enter the number:");
    scanf("%d",&num);
    printf("the factorial of %d is: %d",num,factorial(num));
    return 0;
}