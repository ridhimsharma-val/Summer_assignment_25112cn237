//Find the element that appears more than n/2 times in the array.

import java.util.Scanner;

public class MajorityElement {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n= in.nextInt();
        int[] arr= new int[n];
        System.out.print("Enter array elements: ");
        for(int i=0;i<n;i++)
            arr[i]=in.nextInt();
        for(int i =0;i<n;i++){
            int count=1;     // have to count arr[i] itself
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j])
                    count++;
            }
            if(count>n/2){
                System.out.print("majority element: "+arr[i]);
                break;
            }
        }
        in.close();
    }
}
