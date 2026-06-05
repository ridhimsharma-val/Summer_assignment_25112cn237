import java.util.Scanner;

public class StrongNo {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n= in.nextInt();
        if(isStrong(n)) System.out.println("Given number is a strong number");
        else System.out.println("Given number is not a storng number");
        in.close();
    }
    public static int factorial(int n){
        int fact=1;
        for(int i=1;i<=n;i++)
            fact*=i;
        
        return fact;
    }
    public static boolean isStrong(int n){
        int original=n;
        int sum=0;
        while(n!=0){
        sum= sum+ factorial(n%10);
        n/=10;
    }
        return (sum==original);
    }
}
