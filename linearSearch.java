import java.util.Scanner;

public class linearSearch{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = in.nextInt();
        int target;
        int[] arr = new int[n];
        System.out.println("Enter the array elements:");
        for(int i=0;i<n;i++){
            arr[i] = in.nextInt();
        }
        System.out.println("Enter the element to search:");
        target = in.nextInt();
        System.out.println("the element is found at:"+(Search(n, arr, target)==-1?-1:(Search(n, arr, target)+1)));
        
    }
    static int Search(int n,int[] arr,int target){
        for(int i=0;i<n;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
}