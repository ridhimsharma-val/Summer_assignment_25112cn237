import java.util.Scanner;

public class VerticalFlippedTri {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n=in.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){   //could have made a variable for number of spaces nsp=n-1
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++){
                System.out.print((char)(j+64)+" ");
            }
            System.out.println();
        }
        in.close();
    }
}
