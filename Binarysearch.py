import math
arr = [1, 2, 3, 4, 5]
target = 5

def binarySearch(arr, target):
    start = 0
    end = len(arr)-1
    while (start <= end):
        mid = math.floor((start + end) / 2)
        if (target == arr[mid]):
            return mid
        
        elif (target > arr[mid]):
            start = mid + 1
            
        else:
            end = mid - 1
        
    
    return -1

print("The element is found at:",binarySearch(arr, target)+1)