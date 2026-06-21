// Leetcode-441

import java.util.Scanner;

public class ArrangingCoins {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of coins: ");
        int n= in.nextInt();
        System.out.print("Number of complete rows: "+rows(n));
        in.close();
    }
    //method 1 (Maths)  (explanation: try on paper)
    public static int rows(int n){
        long val=8L *n+1;  // L forces to do cal in long
        long k= (sqrt(val) -1)/2; 
        return (int)k;
    }
    public static long sqrt(long n){
        long low=1;
        long high=n;
        long res=0;
        if(n==0)
            return 0;
        while(low<=high){
            long mid= low+(high-low)/2;
            if(mid > n / mid)            // to avoid overflow
                high=mid-1;
            else if(mid < n / mid){
                res=mid;
                low=mid+1;
            }
            else return mid;
        }
        return res;
    }
}
