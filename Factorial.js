function factorial(num){
    if(num==0 || num==1 )
    return 1;
    else
    return num*(factorial(num-1));
}
n = 4
console.log("the factorial of the number is: ",factorial(n))