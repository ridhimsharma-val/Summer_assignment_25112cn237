// do transpose, not just print
import java.util.Scanner;

public class Transpose {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int m=in.nextInt();
        System.out.print("Enter number of columns: ");
        int n=in.nextInt();
        int[][] arr= new int[m][n];
        System.out.print("Enter array elements: ");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++)
                arr[i][j]=in.nextInt();
        }
        // Transpose within same matrix (works for square matrix only)
/*        for(int i=0;i<arr.length;i++){
            for(int j=0;j<i;j++){      // to avoid two swaps, swap elements of a triangle only(here lower triangle taken and for upper do j=i, j<arr[i].length)
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
        for(int[] row: arr){
            for(int ele: row)
                System.out.print(ele+" ");
            System.out.println();
        }
*/            
        System.out.println();
        
        // transpose in another matrix
        int[][] brr= new int[n][m];
        for(int i=0;i<brr.length;i++){
            for(int j=0;j<brr[i].length;j++)
                brr[i][j]=arr[j][i];
        }
        for(int[] row: brr){
            for(int ele: row)
                System.out.print(ele+" ");
            System.out.println();
        }
        in.close();
    }
}
