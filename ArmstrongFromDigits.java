import java.util.Scanner;

public class ArmstrongFromDigits{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = in.nextInt();
        int sum = 0;
        while(n>0){
            int r = n%10;
            sum += r;
            n = n/10;
        }
        int temp = sum,val=0;
        while(sum>0){
            int r = sum % 10;
            val = val + (r*r*r);
            sum = sum /10;
        }
        if(temp==val){
            System.out.println("armstrong number");
        }else{
            System.out.println("not armstrong number");
        }

    }
}