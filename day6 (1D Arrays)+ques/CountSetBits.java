import java.util.Scanner;

public class CountSetBits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n= in.nextInt();
        int count=0;
        while(n!=0){
            if(n%2==1) 
                count++;
            n/=2;
        }
        System.out.println("set bits: "+count);
        in.close();
    }
}
