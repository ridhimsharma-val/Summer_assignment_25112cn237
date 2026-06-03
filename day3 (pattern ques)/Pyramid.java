import java.util.Scanner;

public class Pyramid {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n=in.nextInt();
        int nst=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print("  ");
            }
            for(int k=1;k<=nst;k++){
                System.out.print("* ");
            }
            nst+=2;
            System.out.println();
        }
        in.close();
    }
}
