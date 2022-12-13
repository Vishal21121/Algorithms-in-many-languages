import java.util.Scanner;

// A number is said to be the Harshad number if it is divisible by the sum of its digit.

public class HarshadNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n,sum = 0;
        System.out.print("enter the number:");
        n = in.nextInt();
        int temp = n;
        while (n > 0) {
            int r = n % 10;
            sum = sum + r;
            n = n / 10;
        }
        if (temp % sum == 0) {
            System.out.print("harshad number");
        } else {
            System.out.print("not harshad number");
        }
    }
}