import java.util.Scanner;

public class CheckSort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n=in.nextInt();
        int[] arr= new int[n];
        System.out.print("Enter array elements: ");
        for(int i=0;i<n;i++)
            arr[i]=in.nextInt();
        boolean flag= check(arr);
        if(flag)
            System.out.print("Array is sorted");
        else
            System.out.print("Array is not sorted");

        in.close();
    }
    public static boolean check(int[] arr){
        int n= arr.length;
        for(int i=0;i<n-1;i++){
            if(arr[i]>arr[i+1])
                return false;
        }
        return true;
    }
}
