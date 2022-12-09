import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num;
        System.out.println("enter the number:");
        num = in.nextInt();
        System.out.println("the factorial of " + num + " is " + factorial(num));
    }

    static int factorial(int num) {
        if (num == 0 || num == 1) {
            return 1;
        } else {
            return num * (factorial(num - 1));
        }
    }
}