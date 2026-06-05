import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int n1= in.nextInt(), n2= in.nextInt();
        System.out.println("LCM: "+lcm(n1,n2));
        in.close();
    }
    public static int lcm(int n1, int n2){
        int lcm=(n1*n2)/hcf(n1,n2);
        return lcm;
    }
    public static int hcf(int n1, int n2){
        int a=Math.max(n1, n2);
        int b=Math.min(n1, n2);
        while(b!=0){
            int rem=a%b;
            a=b;
            b=rem;
        }
        return a;
    }
}
