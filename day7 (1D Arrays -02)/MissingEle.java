import java.util.Scanner;

public class MissingEle {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n= in.nextInt();   
        int[] arr= new int[n-1];   // since 1 number missing rhega to size bhi ek reduce kiya
        System.out.print("Enter array elements: ");
        for(int i=0;i<n-1;i++)
            arr[i]=in.nextInt();
        int expectedsum=n*(n+1)/2;    // sum of n natural numbers (will do (n+2)*(n+1)/2 if we take n as array size)
        int actualsum=0;
        for(int i=0;i<n-1;i++){
            actualsum+=arr[i];
        }
        System.out.print("missing element: "+(expectedsum - actualsum));

        in.close();
    }
}
