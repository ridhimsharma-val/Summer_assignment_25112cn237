

import java.util.Scanner;

public class Occurance {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n= in.nextInt();
        System.out.print("Enter the digit to count: ");
        int x=in.nextInt();
        int count=0;
        while(n!=0){
            if(n%10==x) count++;
            n=n/10;
        }
        System.out.println(x+" occured "+count+" times");
        in.close();
    }
}
