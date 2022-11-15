public class BinarySearch {
    public static void main(String[] args)
    {
        int[] arr={10,20,30,40,50,60};
        int n= arr.length;
        int element=40;
        search(arr,0,n-1,element);

    }

    static void search(int[] arr,int first,int last,int element)
    {
        if(first<=last)
        {
            int mid=(first+last)/2;

            if(arr[mid]==element)
            {
                System.out.println("Element found at position "+(mid+1));
            }
            else if(element<arr[mid] )
                search(arr,first,mid-1,element);
            else
                search(arr,mid+1,last,element);
        }
        else
            System.out.println("Element not found.");
            }

}
