let num = 13;
let temp = num,sum = 0;
while(num>0){
    let r = num%10;
    sum = (sum*10)+r;
    num = Math.round(num/10);
}
if(sum===temp){
    console.log("Palindrome number");
}else{
    console.log("not Palindrome number");
}