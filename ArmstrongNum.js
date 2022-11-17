let num = 1;
let  temp = num,sum = 0, r = 0;
while(num>0){
    r = num % 10;
    sum = sum +(r*r*r);
    num = Math.floor(num/10);
}

if(sum == temp){
    console.log("number is armstrong");
}else{
    console.log("number is not armstrong");
}
