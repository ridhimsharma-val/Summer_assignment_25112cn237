import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n= in.nextInt();
        for(int i=1;i<=n/2;i++){
            if(n%i==0) System.out.println(i +" is a factor of "+n);
        }
        System.out.println(n+ " is a factor of "+n);
        in.close();
    }
}
