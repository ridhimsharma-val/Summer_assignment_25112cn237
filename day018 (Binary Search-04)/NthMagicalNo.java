//Leetcode-878 (hard)

import java.util.Scanner;

public class NthMagicalNo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a and b: ");
        int a=in.nextInt();
        int b=in.nextInt();
        System.out.print("Enter n: ");
        int n=in.nextInt();
        System.out.println("Nth magical number: "+(nthmagical(a,b,n)));
        in.close();
    }
    public static int nthmagical(int a, int b , int n){
        long low=Math.min(a, b);   // search space small number se start hogi as it will be first multiple
        long high= (long)n*Math.min(a, b);    // worst case me search n * small number tk jaegi
        while(low<=high){
            long mid=low+(high-low)/2;
            long diva=mid/a;    // numbers before mid dat are div by a
            long divb=mid/b;    // dat are div by b
            long both=mid/lcm(a,b); // div by both

            long count=diva +divb -both;     // total numbers before mid that are div by a and b(both appeared in both a and b so subtracted once)

            if(count<n)         // if total num div by a and b less than n then the nth will be on right
                low=mid+1;
            else             // if count equal or less aa jae mid ke then the nth will be on left
                high=mid-1;
        }                        // loop breaks when high becomes one less than low and mid=nth , and low will be on mid
        return (int)(low % 1000000007);     // ques me bola ans ko is num se modulo krke dene ko
    }

    public static long lcm(int a, int b){
        return ((long)a * b) / hcf(a,b);         // to avoid overflow
    }
    public static long hcf(int a, int b){
        long n1=Math.max(a, b);
        long n2=Math.min(a, b);
        while(n2!=0){
            long rem=n1%n2;
            n1=n2;
            n2=rem;
        }
        return n1;
    }
}
