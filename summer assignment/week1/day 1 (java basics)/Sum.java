import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("Enter Both Numbers: ");
        int n1= input.nextInt();
        int n2= input.nextInt();
        int sum= n1+n2;
        System.err.println("Sum ="+sum);    //System.out.println("sum = "+(n1+n2))  can do this also
        input.close();
    }
}
