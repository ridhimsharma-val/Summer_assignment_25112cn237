// count digits without loop

import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=in.nextInt();
        String s =Integer.toString(n);
        System.out.println(s.length());
        in.close();
    }
}
