//(0s,1s,2s in one pass)

import java.util.Scanner;

public class DutchNationalFlag {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n= in.nextInt();
        int[] arr= new int[n];
        System.out.print("Enter array elements: ");
        for(int i=0;i<n;i++)
            arr[i]=in.nextInt();
        int low=0;        //where 0 should go
        int mid=0;       // current ele
        int high=n-1;   // where 2 should go
        while(mid<=high){
            if(arr[mid]==0){
                int temp=arr[mid];
                arr[mid]=arr[low];
                arr[low]=temp;
                mid++;
                low++;
            }
            else if(arr[mid]==1)
                mid++;
            else{         // mid=2
                int temp=arr[mid];
                arr[mid]=arr[high];
                arr[high]=temp;
                high--;
            } 
        }
        for(int ele:arr)
            System.out.print(ele+" ");
        in.close();
    }
}
