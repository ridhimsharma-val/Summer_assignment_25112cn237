import java.util.Scanner;

public class FlippedTriangle {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n=in.nextInt();
        int nst=n;   //no of stars (better to make a new variable so that conventional  loops can be applied)
        for(int i=1;i<=n;i++){
            for(int j=1;j<=nst;j++){    // can do j<=n+1-i
                System.out.print("* ");
            }
            nst--;
            System.out.println();
        }
        in.close();
    }
}
