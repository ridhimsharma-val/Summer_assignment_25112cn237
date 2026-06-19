import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of rows and columns for Matrix A: ");

        int m= in.nextInt(), n=in.nextInt();
        int[][] arr= new int[m][n];
        System.out.print("Enter elements in matrix A: ");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++)
                arr[i][j]=in.nextInt();
        }
        int p= in.nextInt(), q=in.nextInt();
        int[][] brr= new int[p][q];
        System.out.print("Enter elements in matrix B: ");
        for(int i=0;i<p;i++){
            for(int j=0;j<q;j++)
                brr[i][j]=in.nextInt();
        }
        int[][] crr= new int[m][q];   // new matrix formed will be of m*q
        for(int i=0;i<m;i++){
            for(int j=0;j<q;j++){
                for(int k=0;k<n;k++)
                    crr[i][j]+= arr[i][k] * brr[k][j];    // since in arr row remains same and we move column wise and in brr column remain const. and we move row wise
            }
        }
        for(int[] row:crr){
            for(int ele:row)
                System.out.print(ele+" ");
            System.out.println();
        }

        in.close();
    }
}
