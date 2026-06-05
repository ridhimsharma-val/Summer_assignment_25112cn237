import java.util.Scanner;

public class ArmstrongNo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n= in.nextInt();
        if(armstrong(n)) System.out.println("given number is armstrong number");
        else System.out.println("given number is not an armstrong number");
        in.close();
    }
    public static int count(int n){
        int count=0;
        while(n!=0){
            n=n/10;
            count++;
        }
        return count;
    }
    public static boolean armstrong(int n){
        int original=n;
        int sum=0;
        int digits=count(n);
        while(n!=0){
            sum= sum+(int)Math.pow(n%10,digits);  //math.pow returns double, so typecasting
            n=n/10;
        }
        return (sum==original) ;
    }
}
