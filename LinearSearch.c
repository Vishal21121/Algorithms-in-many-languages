#include<stdio.h>
int main()
{
    int size;
    printf("Enter the size of the array:\n");
    scanf("%d",&size);
    int arr[size];
    printf("Enter the array Elements:");
    for(int i=0;i<size;i++)
    {
        scanf("%d",&arr[i]);
    }
    printf("Enter the element to search:\n");
    int element;
    scanf("%d",&element);
    for(int i=0;i<size;i++)
    {
        if(arr[i]==element)
        {
            printf("%d is present at index %d",element,i);
            break;
        }
        if(i==size-1)
            printf("Element not found");
    }
}