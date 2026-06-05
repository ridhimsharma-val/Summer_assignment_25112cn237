import java.util.Scanner;

public class Sumofdigits {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n= in.nextInt();
        int sum=digits_sum(n);
        System.out.println("Sum: "+sum);
        in.close();
    }
    public static int digits_sum(int n){
        n=Math.abs(n);   // will convert the input to positive if its neggative
        int sum=0;
        while(n!=0){
            int r=n%10;
            sum=sum+r;
            n=n/10;
        }
        return sum;
    }

}
