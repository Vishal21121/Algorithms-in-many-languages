let arr = [1, 2, 3, 4, 5];
let target = 2;

const binarySearch = (arr, target) => {
    let start = 0, end = arr.length - 1;
    while (start <= end) {
        let mid = Math.round((start + end) / 2);
        if (target == arr[mid]) {
            return mid;
        }
        else if (target > arr[mid]) {
            start = mid + 1;
            console.log("hello")
        }
        else {
            end = mid - 1;
        }
    }
    return -1;
}

console.log(binarySearch(arr, target))

