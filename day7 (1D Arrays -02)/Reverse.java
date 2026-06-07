import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n= in.nextInt();
        int[] arr= new int[n];
        System.out.print("Enter array elements: ");
        for(int i=0;i<n;i++)
            arr[i]= in.nextInt();

        //method 1     (could have made a loop till n/2 for swap)
    /*     int[] brr= new int[n];
        int m=n-1;
        for(int i=0;i<n;i++){
            brr[i]=arr[m];
            m--;
        }
        for(int i=0;i<n;i++){
            arr[i]=brr[i];
        }
        System.out.print("Reversed Array: ");
        for(int i=0;i<n;i++)
            System.out.print(arr[i]+" ");
    */

        //method 2 (better approach)

        int i= 0;
        int j=n-1;
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        System.out.print("Reversed array: ");
        for(int ele : arr)      //for each looop
            System.out.print(ele+ " ");
        in.close();
    }
}
