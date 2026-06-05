import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(true){
            System.out.print("Enter Two numbers: ");
            int n1=in.nextInt(), n2=in.nextInt();
            System.out.print("Enter an operator: ");
            char op= in.next().trim().charAt(0);
            if(op=='+'||op=='-'||op=='*'||op=='/'||op=='%'){

                if(n2==0 && (op=='/' || op=='%'))
                System.out.println("not defined");
            else
                System.out.println("Result: "+ans(op,n1,n2));
        }
            else if(op=='X'||op=='x') break;
            else System.out.println("Enter a valid operator");
        }
        in.close();
    }
    public static int ans(char op,int n1,int n2){
        int ans=0;
        switch(op){
            case '+':
                ans=n1+n2;
                break;
            case '-':
                ans=n1-n2;
                break;
            case '*':
                ans=n1*n2;
                break;
            case '/':
                ans=n1/n2;
                break;
            case '%':
                ans=n1%n2;
                break;
        }
        return ans;
    }
}
