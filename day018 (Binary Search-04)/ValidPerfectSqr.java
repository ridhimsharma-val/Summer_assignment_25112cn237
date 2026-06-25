//Leetcode-367

import java.util.Scanner;

public class ValidPerfectSqr {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n= in.nextInt();
        boolean check=perfectSqr(n);
        if(check)
            System.out.print(n+" is a perfect square");
        else
            System.out.print(n+" is not a perfect square");
        in.close();
    }
    public static boolean perfectSqr(int n){
        int low=1;
        int high=n;
        while(low<=high){
            int mid=low+(high-low)/2;
            long square=(long) mid*mid;
            if(square==n)
                return true;
            else if(square<n)
                low=mid+1;
            else
                high=mid-1;
        }
        return false;
    }
}
