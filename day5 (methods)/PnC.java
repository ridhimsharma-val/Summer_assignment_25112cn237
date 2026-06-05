import java.util.Scanner;

public class PnC {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.print("Enter n and r: ");
        long n=in.nextLong(), r=in.nextLong();
        long ncr= combination(n,r);
        long npr= factorial(n)/factorial(n-r);
        System.out.println(n+"c"+r+"="+ncr);
        System.out.println(n+"p"+r+"="+npr);
        in.close();
    }
    public static long combination(long n, long r){
        long ncr=(factorial(n))/((factorial(r))*(factorial(n-r)));
        return ncr;
    }
    public static long factorial(long a){
        long fact=1;
        for(long i=1;i<=a;i++)
            fact=fact*i;
        return fact;
    }
}
