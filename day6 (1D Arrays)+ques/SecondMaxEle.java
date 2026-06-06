import java.util.Scanner;

public class SecondMaxEle {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n= in.nextInt();
        int[] arr= new int[n];
        System.out.print("Enter array elements: ");
        for(int i=0;i<n;i++)
            arr[i]=in.nextInt();
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]>max)
                max=arr[i];
        }
        int max2=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]>max2 && arr[i]!=max) 
                max2=arr[i];
        }
        if(max2==Integer.MIN_VALUE)
            System.out.println("Second maximum does not exist");
        else
            System.out.println("second maximum element: "+max2);
        in.close();
    }
}
