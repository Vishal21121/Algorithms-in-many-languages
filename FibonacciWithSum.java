import java.util.Scanner;

public class FibonacciWithSum {
    public static void main(String[] args) {
        int c, a = 0, b = 1, sum = 0, i, n;
        Scanner in = new Scanner(System.in);
        System.out.println("enter the number:");
        n = in.nextInt();

        for (i = 1; i <= n; i++) {
            sum = sum + a;
            if (a == 0)
                System.out.print(a);
            else
                System.out.print("+"+a);
            c = a + b;
            a = b;
            b = c;

        }
        System.out.println("\nthe sum is : " + sum);

    }
}