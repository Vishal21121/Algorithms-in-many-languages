a=0
b=1
sum=0
n = int(input("enter the number:"))

for i in range(1,n+1):
    sum= sum +a
    if a==0:
        print(a,end='')
    else:
        print(" +",a,end='')
    c=a+b
    a=b
    b=c

print("\nthe sum is : ",sum)