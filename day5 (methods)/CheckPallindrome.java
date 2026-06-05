import java.util.Scanner;

public class CheckPallindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n= in.nextInt();
        if(reverse(n)) System.out.println("Given number is palindrome");
        else System.out.println("Given number is not a palindrome");
        in.close();
    }
    public static boolean reverse(int n){
        int original=n;
        int rev=0;
        while(n!=0){
            rev= rev*10 + n%10;
            n=n/10;
        }
        return (rev== original);
    }
}
