import java.util.Scanner;

public class OddNoTriangle {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.print("Enter numbers of rows: ");
        int n=in.nextInt();
        for(int i=1;i<=n;i++){
            int a=1;
            for(int j=1;j<=i;j++){
                System.out.print(a+ " ");
                a+=2;
            }
            System.out.println();
        }
        in.close();
    }
}
