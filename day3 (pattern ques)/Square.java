import java.util.Scanner;

public class Square {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.print("Enter number of rows and columns: ");
        int n= in.nextInt();

        //star square
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
System.out.println();
        //number square
        for(int i=0;i<n;i++){
            for(int j=1;j<=n;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
System.out.println();
        //alphabet square
        for(int i=0;i<n;i++){
            for(int j=1;j<=n;j++){
                System.out.print((char)(j+64)+" ");
            }
            System.out.println();
        }
System.out.println();
        //number square with same number in easch column
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
        in.close();
    }
}
