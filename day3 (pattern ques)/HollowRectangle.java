import java.util.Scanner;

public class HollowRectangle {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter Number of rows:");
        int m=in.nextInt();
        System.out.print("Enter Number of columns:");
        int n=in.nextInt();
        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                if(i==1 || i==m || j==1 || j==n)
                    System.out.print("* ");
                else System.out.print("  ");
            }
            System.out.println();
        }
        in.close();
    }
}
