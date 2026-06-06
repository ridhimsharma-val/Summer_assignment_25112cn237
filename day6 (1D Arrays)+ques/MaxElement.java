import java.util.Scanner;

public class MaxElement {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n= in.nextInt();
        int arr[]=new int[n];
        System.out.print("Enter array elements: ");
        for(int i=0;i<n;i++)
            arr[i]=in.nextInt();
        int max=arr[0];   // can do int max = Integer.MIN_VALUE
        for(int i=1;i<n;i++){    // starting from second index
            if(arr[i]>max) max=arr[i];
        }
        System.out.println("maximum element in the array: "+max);
        in.close();
    }
}
