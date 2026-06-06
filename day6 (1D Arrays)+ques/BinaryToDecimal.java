import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter a Binary number: ");
        int n= in.nextInt();
        System.out.print("Decimal number: "+binToDec(n));

        in.close();
    }
    public static int binToDec(int n){
        int dec=0;
        int place=1;
        while(n!=0){
            int lastdig = n % 10;
            dec= dec + ( lastdig * place);
            place = place * 2;   // place value increases by base/radix like base 2 , base 10
            n /= 10;
        }
        return dec;
    }
    
}
