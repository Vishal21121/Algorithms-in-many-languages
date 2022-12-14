import math
n = int(input("Enter the num:"))
temp = n
sum = 0
while(n>0):
    r = math.floor(n%10)
    sum = sum + r
    n = n/10

if(temp%sum == 0):
    print("harshad number")
else:
    print("not harshad number")