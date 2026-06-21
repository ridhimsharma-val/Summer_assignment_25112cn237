//Leetcode-69
// if n is not a perfect square then return the floor value of square root

import java.util.Scanner;

public class SqrtX {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n= in.nextInt();
        System.out.print("Square root: "+(sqrt(n)));
        in.close();
    }

    // method 1 (brute force) TC: O(sqrt(n)) as loop breaks on root n
/*    public static int sqrt(int n){
        int root=1;
        for(int i=1;i<=n;i++){            // as root of every number comes in b/w 1 and n
            if(i*i>n)
                break;     // break the loop at when sqrt exceeds the number
            root=i;    // mark the root as i
        }
        return root;
    }
*/

    // method 2(binary search)
    public static int sqrt(int n){
        int low=1;
        int high=n;
        int res=0;
        if(n==0)
            return res;
        while(low<=high){
            int mid= low+(high-low)/2;
            long square= (long)mid*mid;   // to avoid integer overflow when mid is large(did type casting of mid)
            if(square>n)
                high=mid-1;
            else if(square<n){
                res=mid;  // can be a potential root(floor)
                low=mid+1; // checked further
            }
            else
                return mid;
        }
        return res;
    }
}
