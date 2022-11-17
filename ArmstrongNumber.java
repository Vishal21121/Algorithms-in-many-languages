import java.util.*;
public class ArmstrongNumber{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        int temp=num;
        int count=0;

        while(temp!=0)
        {
            int rem = temp%10;
            count++;
            temp=temp/10;
        }

        int temp1=num;
        int sum=0;
        while(temp1!=0)
        {
            int rem = temp1%10;
            sum=sum+ (int)Math.pow(rem,count);
            temp1=temp1/10;
        }
        if(sum==num)
            System.out.println("Armstrong");
        else
            System.out.println("Not Armstrong");

        sc.close();

    }
    
}
