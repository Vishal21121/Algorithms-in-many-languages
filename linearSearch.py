def Search(n,arr,target):
    for i in range(n):
        if (arr[i]==target):
            return i
    return -1

if __name__ == "__main__":
    n = int(input("Enter the array size:"))
    arr = list(range(n))
    target = int(input("Enter the target element:"))
    for i in range(n):
        arr[i] = int(input(f"Enter the array element {i+1}:"))

    if(Search(n,arr,target)==-1):
        print("the element is not found")
    else:
        print("The element is found at:",Search(n,arr,target)+1)


