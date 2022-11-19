#include <stdio.h>
void main()
{
    int num;
    printf("Enter the number:");
    scanf("%d",&num);
    int temp = num, sum = 0;
    while (num > 0)
    {
        int r = num % 10;
        sum = (sum * 10) + r;
        num = num / 10;
    }
    if (sum == temp)
    {
        printf("Palindrome number");
    }
    else
    {
        printf("not Palindrome number");
    }
}
