import java.util.Scanner;

public class CounterFactors {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.print("enter a number: ");
        int n= in.nextInt();
        int count=factor(n);
        System.out.println("Total factors of "+n+" : "+count);
        in.close();
    }
    public static int factor(int n){
        int count=0;
        for(int i=1;i<=n;i++){
            if(n%i==0) count++;
        }
        return count;
    }
}
