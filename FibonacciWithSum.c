#include<stdio.h>
int main()
{

    int c,a=0,b=1,sum=0,i,n;
    printf("enter the number:");
    scanf("%d",&n);

    for(i=1;i<=n;i++)
    {
        sum= sum +a;
        if(a==0)
            printf("%d",a);
            else
            printf("+%d",a);
        c=a+b;
        a=b;
        b=c;




    }
printf("\nthe sum is : %d",sum);


}
