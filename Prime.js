num = 6;
	
flag  = 0

if(num<=1){
    console.log("the number is neither prime nor composite")
}else{
    for (i=2;i<num;i++){
        if(num%i==0){
            flag = 1
        }
    }
    if(flag==1){
        console.log("the number is not prime")
    }else{
        console.log("the number is prime")
    }
}