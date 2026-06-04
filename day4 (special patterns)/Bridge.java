import java.util.Scanner;

public class Bridge {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n=in.nextInt();
        int nst=n-1, nsp=1;
        for(int i=1;i<=2*n-1;i++){
            System.out.print("* ");
        }
        System.out.println();
        for(int i=2;i<=n;i++){
            for(int j=1;j<=nst;j++){
                System.out.print("* ");
            }
            for(int k=1;k<=nsp;k++){
                System.out.print("  ");
            }
            for(int l=1;l<=nst;l++){
                System.out.print("* ");
            }
            nst--;
            nsp+=2;
            System.out.println();
        }
        in.close();
    }
}
