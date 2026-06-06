import java.util.Scanner;
public class SecondMinEle {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n= in.nextInt();
        int[] arr= new int[n];
        System.out.print("Enter array elements: ");
        for(int i=0;i<n;i++)
            arr[i]=in.nextInt();
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]<min)
                min=arr[i];
        }
        int min2=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]<min2 && arr[i]!=min)
                min2=arr[i];
        }
        if(min2==Integer.MAX_VALUE)
            System.out.println("second minimum does not exist");
        else
            System.out.println("second minimum element: "+min2);

        in.close();
    }
}
