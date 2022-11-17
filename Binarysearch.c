#include<stdio.h>

int binarySearch(int arr[], int target, int size){
    int start = 0, end = size - 1;
    while (start <= end) {
        int mid = (start + end) / 2;
        if (target == arr[mid]) {
            return mid;
        }
        else if (target > arr[mid]) {
            start = mid + 1;
            
        }
        else {
            end = mid - 1;
        }
    }
    return -1;
}

void main(int argc, char const *argv[])
{
    int size,target;
    printf("Enter the target number:");
    scanf("%d",&target);
    printf("enter the array size:");
    scanf("%d",&size);
    int arr[size];
    printf("enter the array elements:");
    for (int i = 0; i < size; i++)
    {
        scanf("%d",&arr[i]);
    }
    printf("The element is found at: %d",binarySearch(arr,target,size)==-1?-1:binarySearch(arr,target,size)+1);
}


