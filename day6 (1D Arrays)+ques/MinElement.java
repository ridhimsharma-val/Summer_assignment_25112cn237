import java.util.Scanner;

public class MinElement {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n= in.nextInt();
        int[] arr=new int[n];
        System.out.print("Enter array elements: ");
        for(int i=0;i<n;i++)
            arr[i]=in.nextInt();
        System.out.println("Minimum element in the array: "+ min(arr));

        in.close();
    }
        public static int min(int[] arr){
        int min = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min) min=arr[i];
        }
        return min;
    }
}
