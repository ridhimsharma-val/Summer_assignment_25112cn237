import java.util.Scanner;

public class PerfectNO {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n= in.nextInt();
        if(factsum(n)) System.out.println("Given number is a perfect number");
        else System.out.println("Not a perfect number");
        in.close();
    }
    public static boolean factsum(int n){
        int sum=0;
        for(int i=1;i<n;i++){   // perfect number is sum of proper factors (excluding number itself)
            if(n%i==0) sum+=i;
        }
        return  (sum==n);
    }
}
