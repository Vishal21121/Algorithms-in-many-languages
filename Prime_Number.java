import java.util.Scanner;
public class Prime_Number {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check Prime or not: ");
        int num=sc.nextInt();
        int count=0;
        if(num==0 || num==1)
        {
            System.out.println(num+" is not a prime number.");
        }
        for(int i=2;i<num/2;i++)
        {
            if(num%i==0)
            {
                count++;
                break;
            }
        }
        if(count>0)
        {
            System.out.println(num+" is not a prime number.");
        }
        else
        {
            System.out.println(num+" is a prime number.");
        }
        sc.close();
    }
    
}
