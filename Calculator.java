import java.util.Scanner;

public class Calculator{
    public static void main(String[] args) {
        int a, b, c, d, e, f;
        int g;
        char choice;
        Scanner in = new Scanner(System.in);
        System.out.println("enter the first number:");
        a = in.nextInt();
        System.out.println("choose the operation:\n");
        System.out.println("1.addition\n2.substraction\n3.multiplication\n4.division\n");
        choice = in.next().charAt(0);
        System.out.println("enter the second number:");
        b = in.nextInt();

        c = a + b;
        d = a - b;
        e = a * b;

        switch (choice)
        {

        case '+':
                System.out.println("the solution is: "+ c);
                break;
        case '-':
                System.out.println("the solution is: "+ d);
                break;
        case '*':
                System.out.println("the solution is: "+ e);
                break;
        case '/':
                if (b != 0)
                {
                    f = a / b;
                System.out.println("The solution is: "+ f);
                }
                else
                {
                        System.out.println("the number cannot be divided");
                }
                break;

        default:
                System.out.println("\nthe operator is not found");
        }
    }
}