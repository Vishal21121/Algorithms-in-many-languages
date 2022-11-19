import math
num = int(input("Enter the number:"))
temp = num
sum = 0
while(num>0):
    r = num%10
    sum = (sum*10)+r
    num = math.floor(num/10)
if sum==temp:
    print("Palindrome number");
else:
   print("not Palindrome number");