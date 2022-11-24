echo -n "Enter the number:"
read n
temp=$n
sum=0
while [ $n -gt 0 ]
do
r=`expr $n % 10`
add=`expr $r \* $r \* $r`
sum=`expr $sum + $add`
n=`expr $n / 10`
done
if [ $temp -eq $sum ]
then
echo "armstrong number"
else
echo "not armstrong number"
fi

