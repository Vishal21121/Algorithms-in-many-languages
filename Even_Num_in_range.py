# n is the range in b/w which we are finding the even number
n = int(input("enter the number:"))
sum = 0
print("the even numbers in range are:",end='')
for i in range(1,n+1):
    if (i % 2 == 0):
        sum = sum + i
        print(i , " ",end='')

print("\nthe sum of even number in range is: ", sum)