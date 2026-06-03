import java.util.Scanner;

public class Typecasting {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("Enter a decimal number:");
        float x=input.nextFloat();
        int num=(int)(x);
        System.out.println(num);

        //automatic type promotion in expressions
        int a=511;
        byte b =(byte)(a); // since 257 exceeds the limit of byte which is 256 only
        System.out.println(b); // result will be remainder of 256 and the value you want to put  257 % 256=1
        input.close();
    }
}
