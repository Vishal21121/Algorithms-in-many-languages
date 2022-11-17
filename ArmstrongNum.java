import java.util.Scanner;
public class ArmstrongNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = in.nextInt();
        int temp = num,sum =0;
        while(num>0){
            int r = num%10;
            sum += r*r*r;
            num = num/10;
        }
        if(sum == temp){
            System.out.println("number is armstrong");
        }else{
            System.out.println("number is not armstrong");
        }
    }
}
