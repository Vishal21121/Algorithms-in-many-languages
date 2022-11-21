#include<stdio.h>

int main()
{
    int num;
    printf("Enter a number to check Prime or not:\n");
    scanf("%d",&num);

    int count=0;
    if(num==0 || num==1)
    {
        printf("%d is not a prime number.",num);
    }
    for(int i=2;i<num/2;i++)
    {
        if(num%i==0)
        {
            count++;
            break;
        }
    }
    if(count>0)
    {
        printf("%d is not a prime number.",num);
    }
    else
    {
        printf("%d is a prime number.",num);
    }
}