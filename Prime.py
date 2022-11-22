num  = int(input("Enter the number:"))
flag  = 0

if(num<=1):
    print("the number is neither prime nor composite")
else:
    for i in range(2,num):
        if(num%i==0):
            flag = 1
    if(flag==1):
        print("the number is not prime")
    else:
        print("the number is prime")