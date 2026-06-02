

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in= new Scanner (System.in);
        int ans=0;
        while(true){   //infinite while loop
        System.out.print("Enter an operator: ");
        char op=in.next().trim().charAt(0);
            if( op=='+'|| op=='-' || op=='*'||op=='/' || op=='%'){
                System.out.print("enter two numbers: ");
                int n1= in.nextInt(), n2=in.nextInt();
                if(op=='+') ans= n1 + n2;
                if(op=='-') ans= n1 - n2;
                if(op=='*') ans= n1 * n2;
                if(op=='/'){
                    if(n2!=0) ans =n1/n2;
                    else System.out.println("not defined");
                }
                if(op=='%') ans= n1 % n2;
                System.out.println("Result: "+ans);
            }
            else if(op=='X' || op=='x')
                break;
            else System.out.println("invalid operator");
        }
        in.close();
    }
}
