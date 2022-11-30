// n is the range in b/w which we are finding the even number
let i, n = 100, sum = 0;
console.log("the even numbers in range are:");
for (i = 1; i <= n; i++) {
    if (i % 2 == 0) {
        sum = sum + i;
        process.stdout.write(i + " ")
    }

}
console.log("\nthe sum of even number in range is: %d", sum);