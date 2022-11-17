#include <stdio.h>
int main(int argc, char const *argv[])
{
    int num ;
    printf("Enter the number:");
    scanf("%d",&num);
    int temp = num, sum = 0, r = 0;
    while (num > 0)
    {
        r = num % 10;
        sum = sum + (r * r * r);
        num = num / 10;
    }

    if (sum == temp)
    {
        printf("number is armstrong");
    }
    else
    {
        printf("number is not armstrong");
    }
}
