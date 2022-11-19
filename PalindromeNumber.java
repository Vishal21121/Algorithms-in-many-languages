import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = in.nextInt();
        int temp = num,sum = 0;
        while(num>0){
            int r = num%10;
            sum = sum*10+r;
            num/=10;
        }
        if(sum==temp){
            System.out.println("Palindrome number");
        }else{
            System.out.println("not Palindrome number");
        }
    }
}

