#include<stdio.h>

int main()
{
    int num;
    printf("Enter a number:\n");
    scanf("%d",&num);
    int temp=num;
    int rev_num=0;
    while(temp!=0)
    {
        int r=temp%10;
        rev_num=rev_num*10+r;
        temp=temp/10;
    }
    if(rev_num==num)
        printf("%d is a palindrome Number.",num);
    else
        printf("%d is not a palindrome Number.",num);
}