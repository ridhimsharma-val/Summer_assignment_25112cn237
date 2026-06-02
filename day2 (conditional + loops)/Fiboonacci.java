

import java.util.Scanner;

public class Fiboonacci {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.print("Enter a number:");
        int n= in.nextInt();

        //method 1
       /* int a =0,b=1;
        int sum=0;
        if(n==1) System.out.println(n + "th fibonacci number:"+a);
        else if(n==2) System.out.println(n + "th fibonacci number:"+b);
        else{
        for (int i = 2; i < n; i++) {  // this gives n+2 fibnacci no.
            sum=a+b;
            a=b;
            b=sum;
        }
        System.out.println(n + "th fibonacci number:"+sum);
    } */
    
    //method 2
        int a=0,b=1;
        for (int i = 1; i < n; i++) {
        int temp=a;
        a=b;
        b=temp+a;
    }
    System.out.println(n+"th fibonacci number: "+a);
    in.close();
}
}