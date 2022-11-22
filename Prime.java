import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        int num;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number:");
        num = in.nextInt();
        int flag = 0;
        if (num <= 1){
            System.out.println("the number is neither prime nor composite");
        }
        else
        {
            for (int i = 2; i < num; i++)
            {
                if (num % i == 0)
                {
                    flag = 1;
                }
            }
            if (flag == 1)
            {
                System.out.println("the number is not prime");
            }
            else
            {
                System.out.println("the number is prime");
            }
        }
    }
}