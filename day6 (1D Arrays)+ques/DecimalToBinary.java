import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter a number: ");
        int n= in.nextInt();
        System.out.print("binary :"+DecToBin(n));

        in.close();
    }
    public static int DecToBin(int n){
        int binary=0;
        int place=1; //place value=1
        while(n!=0){
            int r= n%2;
            n/=2;
            binary= binary+(r*place);
            place*=10;
        }
        return binary;
    }
}
