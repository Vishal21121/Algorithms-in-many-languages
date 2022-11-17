#include<stdio.h>
#include<math.h>

int main()
{
    int num;
    printf("Enter a number:");
    scanf("%d",&num);

    int temp=num;
    int count=0;
    while(temp!=0)
    {
        int rem = temp%10;
        count++;
        temp=temp/10;
    }
    int temp1=num;
    int sum=0;
    while(temp1!=0)
    {
        int rem = temp1%10;
        sum=sum+ (int)pow(rem,count);
        temp1=temp1/10;
    }
    if(sum==num)
        printf("Armstrong Number");
    else
        printf("Not Armstrong number");
}