import java.util.Scanner;

public class Even_Num_in_Range {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i, n, sum = 0;
        System.out.println("enter the range:");
        n = in.nextInt();
        System.out.print("the even numbers in range are:\n");
        for (i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                sum = sum + i;
                System.out.print(" " + i);

            }

        }
        System.out.println("\nthe sum of even number in range is: "+sum);
    }
}
