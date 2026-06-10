//Best Time to Buy and Sell Stock

import java.util.Scanner;

public class BuySellStock {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n= in.nextInt();
        int[] arr= new int[n];
        System.out.print("Enter array elements: ");
        for(int i=0;i<n;i++)
            arr[i]=in.nextInt();

        //method 1 (brute force)   X wrong (The global minimum may not give maximum profit Example: [2,10,1,5] )
/*        int min=Integer.MAX_VALUE;
        int ind=0; // to store index of min element
        for(int i=0;i<n;i++){
            if(arr[i]<min){
                min=arr[i];
                ind=i;
            }
        }
        int diff=0;
        for(int i=ind+1;i<n;i++){
            if(arr[i]-arr[ind]>=diff)
                diff= arr[i]-arr[ind];
            }
            System.out.println(diff);
*/

        //method 2 (correct brute force: assume buy every day)
/*        int maxprofit=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int profit=arr[j]-arr[i];
                maxprofit=Math.max(maxprofit, profit);
            }
        }
        System.out.println(maxprofit);
*/

        //method 3 (optimal apporach)
        int min= Integer.MAX_VALUE;  // cheapest stock seen so far
        int maxprofit=0;                // max profit so far
        for(int i=0;i<n;i++){
            min= Math.min(min, arr[i]);
            int profit= arr[i] - min;
            maxprofit= Math.max(maxprofit, profit);
        }
        System.out.println(maxprofit);
        in.close();
    }
}

