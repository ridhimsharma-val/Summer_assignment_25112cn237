

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n= in.nextInt();
        int r=0;
        while(n>0){
            r=r*10+n%10;
            n=n/10;
        }
        System.out.println("reversed number: "+r);
        in.close();
    }
}
