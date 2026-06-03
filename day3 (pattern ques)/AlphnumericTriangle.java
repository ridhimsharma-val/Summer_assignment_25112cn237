import java.util.Scanner;

public class AlphnumericTriangle {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n=in.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if(i%2==0) System.out.print((char)(j+64)+" ");
                else System.out.print(j+" ");
            }
            System.out.println();
        }
        in.close();
    }
}
