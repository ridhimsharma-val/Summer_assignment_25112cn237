//Take integer inputs till the user enters 0 and print the sum of all numbers

import java.util.Scanner;

public class Sumofinputnums {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int sum=0;
        while(true){
            System.out.print("Enter a integer: ");
            int n= in.nextInt();
            if(n==0) break;
            sum= sum+n;
        }
        System.out.println("Sum: "+sum);
        in.close();
    }
}
