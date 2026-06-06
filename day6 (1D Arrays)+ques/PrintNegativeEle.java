import java.util.Scanner;

public class PrintNegativeEle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n= in.nextInt();
        int[] arr= new int[n];
        System.out.print("Enter array elements: ");
        for(int i=0;i<n;i++)
            arr[i]=in.nextInt();
        // printing only negative elements in the array
        for(int i=0;i<n;i++){
            if(arr[i]<0) System.out.print(arr[i]+" ");
        }
        in.close();
    }
}
