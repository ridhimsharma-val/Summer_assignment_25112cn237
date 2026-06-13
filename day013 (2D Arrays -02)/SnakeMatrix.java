import java.util.Scanner;

public class SnakeMatrix{
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
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

        //row wise
        for(int i=0;i<arr.length;i++){
            if(i%2==0){
                for(int j=0;j<arr[i].length;j++)
                    System.out.print(arr[i][j]+" ");
            }
            else{
                for(int j=arr[i].length-1;j>=0;j--)
                    System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        //column wise
        for(int j=0;j<arr[0].length;j++){
            if(j%2==0){
                for(int i=0;i<arr.length;i++)
                    System.out.print(arr[i][j]+" ");
            }
            else{
                for(int i=arr.length-1;i>=0;i--)
                    System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        in.close();
    }
}