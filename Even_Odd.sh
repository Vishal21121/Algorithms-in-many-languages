echo -n "enter  the number:"
read n
if [ `expr $n % 2` == 0 ]
then
echo "the number is even"
else
echo "the number is odd"
fi