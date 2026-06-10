//Find pairs whose sum equals a target without using nested loops

import java.util.Arrays;
import java.util.Scanner;

public class TwoSum2{
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n= in.nextInt();
        int[] arr= new int[n];
        System.out.print("Enter array elements: ");
        for(int i=0;i<n;i++)
            arr[i]=in.nextInt();
        System.out.print("Enter target: ");
        int target=in.nextInt();
        Arrays.sort(arr);
        int i=0;
        int j=arr.length -1;
        while(i<j){
            int sum=arr[i]+arr[j];
            if(sum<target)
                i++;
            else if(sum>target)
                j--;
            else{ 
                System.out.print(arr[i]+","+arr[j]+"; ");
                i++;
                j--;
            }
        }
        in.close();
    }
}