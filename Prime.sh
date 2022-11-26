echo -n "enter the number:"
read n
flag=0
if [ $n -le 1 ]
then
echo "$n is neither prime nor composite"
else
for((i=2;i<n;i++))
do
if [ `expr $n % $i` -eq 0 ]
then
flag=1
break
fi
done
if [ $flag -eq 1 ]
then
echo "$n  is not prime"
else
echo "$n is prime"
fi
fi