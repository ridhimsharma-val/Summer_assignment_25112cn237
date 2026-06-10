//Remove Duplicates from Sorted Array

import java.util.Arrays;
import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n= in.nextInt();
        int[] arr= new int[n];
        System.out.print("Enter array elements: ");
        for(int i=0;i<n;i++)
            arr[i]=in.nextInt();
        Arrays.sort(arr);

        //method1(brute force)
/*        int[] res= new int[n];
        int j=0;
        for(int i=0;i<n;i++){
            if(i==n-1){
                res[j]=arr[i];
                j++;
            }
            else if(arr[i]==arr[i+1])
                continue;
            else{
                res[j]=arr[i];
                j++;
            }
        }
        for(int i=0;i<j;i++)
            System.out.print(res[i]+" ");
*/

        //method 2(two pointer)
        int j=0; // stores last unique element
        int i=1; // checking pointer
        while(i<n){
            if(arr[j]==arr[i]){
                i++;
                continue;
            }
            else{  // arr[j]!=arr[i]
                j++;
                arr[j]=arr[i];   // j will be changed to next unique element
                i++;
            }
        }
        System.out.print("Array after removing duplicates: ");
        for(int k=0;k<=j;k++)
            System.out.print(arr[k]+" ");
        in.close();
    }
}
