//order agnostic binary search: first check whether the array is ascending or descending then do appropriate search

import java.util.Scanner;

public class OrderAgnostic {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n=in.nextInt();
        System.out.print("Enter array elements(either in ascending or descending): ");
        int[] arr= new int[n];
        for(int i=0;i<n;i++)
            arr[i]=in.nextInt();
        System.out.print("Enter target element: ");
        int target=in.nextInt();
        boolean check=(arr[0]<arr[n-1]);    // checked for ascending
        int idx=-1;
        if(check){          // for ascending do normal binary search
            int low=0;
            int high=n-1;
            while(low<=high){
                int mid= low+(high-low)/2;
                if(arr[mid]<target)
                    low=mid+1;
                else if(arr[mid]>target)
                    high=mid-1;
                else{
                    idx=mid;
                    break;
                }
            }
        }
        else{         // for descending do reverse binary search
            int low=0;
            int high=n-1;
            while(low<=high){
                int mid= low+(high-low)/2;
                if(arr[mid]<target)          // target is on left
                    high=mid-1;
                else if(arr[mid]>target) 
                    low=mid+1;           //target is on right
                else{
                    idx=mid;
                    break;
                }
            }
        }
        if(idx==-1)
            System.out.print("Target not found");
        else
            System.out.print("Target found at "+idx+" index");

        in.close();
    }
}
