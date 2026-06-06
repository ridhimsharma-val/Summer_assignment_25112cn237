import java.util.Scanner;

public class SumofElements {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter array length: ");
        int n= in.nextInt();
        int[] arr= new int[n];
        System.out.print("Enter array elements: ");
        for(int i=0;i<n;i++)
            arr[i]=in.nextInt();
        int sum=0;
        for(int i=0;i<n;i++)
            sum+=arr[i];
        System.out.println("Sum: "+ sum);

        in.close();
    }
}
