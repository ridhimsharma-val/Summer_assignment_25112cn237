//Calculate Average Of N Numbers

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        // System.out.print("Enter a number:");
        // int n= in.nextInt();
        // int sum=0;
        // for(int i=1;i<=n;i++){
        //     sum=sum+i;
        // }
        // System.out.println("Average: "+sum/n);

        // taking n inputs to claculate average

        int sum=0;
        int count=0;
        while(true){
            System.out.print("Enter a number: ");
            int n= in.nextInt();
            if(n==0) break;
            sum=sum+n;
            count++;
        }
        System.out.println("Average: "+(float)sum/count);
        in.close();

    }
}


