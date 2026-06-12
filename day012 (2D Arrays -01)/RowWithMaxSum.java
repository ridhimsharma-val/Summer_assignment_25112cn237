import java.util.Scanner;

public class RowWithMaxSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int m=in.nextInt();
        System.out.print("Enter number of columns: ");
        int n= in.nextInt();
        System.out.print("Enter array elements: ");
        int arr[][]=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++)
                arr[i][j]=in.nextInt();
        }
        int max=Integer.MIN_VALUE;
        int idx=0;
        for(int i=0;i<m;i++){
            int rowsum=0;
            for(int j=0;j<n;j++){
                rowsum += arr[i][j];
            }
            if(rowsum>max){
                max=rowsum;
                idx=i;
            }
        }
        System.out.print("Row with maximum sum: "+(idx+1));
        System.out.println("Maximum sum: "+max);
        in.close();
    }
}
