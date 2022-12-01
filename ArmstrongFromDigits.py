import math
n = 1
sum = 0
while(n>0):
    r = math.floor(n%10)
    sum += r
    n = n/10

temp = sum
val=0
while(sum>0):
    r = math.floor(sum % 10)
    val = val + (r*r*r)
    sum = sum /10


if(temp==val):
    print("armstrong number")
else:
    print("not armstrong number")
