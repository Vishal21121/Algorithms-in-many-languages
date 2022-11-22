#include <stdio.h>

void main()
{
    int num;
    printf("Enter the number:");
    scanf("%d",&num);
    int flag = 0;

    if (num <= 1){
        printf("the number is neither prime nor composite");
    }
    else
    {
        for (int i = 2; i < num; i++)
        {
            if (num % i == 0)
            {
                flag = 1;
            }
        }
        if (flag == 1)
        {
            printf("the number is not prime");
        }
        else
        {
            printf("the number is prime");
        }
    }
}