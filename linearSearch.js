let n = 5
let target = 2;
let arr = [1,2,3,4,5];
console.log("The element is found at:",Search(n,arr,target)=== -1 ? -1: Search(n,arr,target)+1);


function Search(n,arr,target){
    for(i=0;i<n;i++){
        if(arr[i]==target){
            return i;
        }
    }
    return -1;
}