#include<stdio.h>
int main()
{ int i,n,sum=0;
   printf("enter the range:");
   scanf("%d",&n);
   printf("the even numbers in range are:\n");
   for(i=1;i<=n;i++)
    {
        if(i%2==0)
        {
        sum=sum+i;
        printf("%d ",i);

        }

    }
    printf("\nthe sum of even number in range is: %d",sum);
    return 0;
}
