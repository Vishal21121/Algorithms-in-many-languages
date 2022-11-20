let n = 6
let sum = 0
for(i=1;i<n;i++){
    if(n%i==0){
        sum = sum + i
    }
}
if(sum==n){
    console.log("perfect number")
}
else{
    console.log("Not perfect number")
}