num = int(input("Enter the number:"))
temp = num
sum =0
while(num>0):
    r = num % 10
    sum += r*r*r
    num = num//10
if(sum == temp):
    print("number is armstrong")
else:
    print("number is not armstrong")


