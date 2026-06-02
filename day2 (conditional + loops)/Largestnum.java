

import java.util.Scanner;

public class Largestnum {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the numbers: ");
        int num1= input.nextInt(), num2=input.nextInt(), num3=input.nextInt();

        //method 1
        // if(num1>num2){
        //     if(num1>num3)
        //         System.out.println(num1+" is greatest");
        //     else
        //         System.out.println(num3+" is greatest");
        // }
        // else{
        //     if(num2>num3)
        //         System.out.println(num2+" is greatest");
        //     else 
        //         System.out.println(num3+" is greatest");
        // }

        //method 2
        // int max=num1;
        //     if(num2>max){
        //         max=num2;
        //     }
        //     if(num3>max){
        //         max=num3;
        //     }
        // System.out.println(max);

        //method 3
        int max= Math.max(num3,Math.max(num1,num2));
        System.out.println(max);
        input.close();
    }   

}
