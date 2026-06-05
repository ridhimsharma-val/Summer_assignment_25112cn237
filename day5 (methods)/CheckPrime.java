import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n= in.nextInt();
        boolean flag= prime(n);
        if(flag) System.out.println(n+ " is a prime number");
        else System.out.println(n+" is not a prime number");
        in.close();
    }
    public static boolean prime(int n){
        if(n<=1) return false;
        
        for(int i=2;i*i<=n;i++){     // i<=sqrt(n) Because if a number has a factor bigger than √n, the smaller factor already exists.
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}
