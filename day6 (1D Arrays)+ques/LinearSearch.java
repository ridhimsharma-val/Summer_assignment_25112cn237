import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n= in.nextInt();
        int[] arr= new int[n];
        System.out.print("Enter array elements: ");
        for(int i=0;i<n;i++)
            arr[i]=in.nextInt();
        System.out.print("Enter the number to be searched: ");
        int target= in.nextInt();
        boolean found=false;
        for(int i=0;i<n;i++){
            if(arr[i]==target){
                System.out.println(target+ " found at "+i+ " index");
                found=true;
                break;
            }
        }
        if(!found) System.out.println("Element not found");
        in.close();
    }
}
