//sum of all possible substrings

import java.util.Scanner;

public class SumOfSubstrings {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter a number: ");
        String s = in.next();
        int sum=0;
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                String x= s.substring(i,j+1);
                sum+= Integer.parseInt(x);
            }
        }
        System.out.println("Total Sum: "+sum);
        in.close();
    }
}
