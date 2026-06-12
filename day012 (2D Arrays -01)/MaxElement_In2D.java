import java.util.Scanner;

public class MaxElement_In2D {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int m=in.nextInt();
        System.out.print("Enter number of columns: ");
        int n= in.nextInt();
        System.out.print("Enter array elements: ");
        int arr[][]=new int[m][n];
        for(int i=0;i<m;i++){         // can do i<arr.length
            for(int j=0;j<n;j++)     // can do j<arr[0].length  since every ele of 2D array contains another array
                arr[i][j]=in.nextInt();
        }
        in.close();
        int max=Integer.MIN_VALUE;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(arr[i][j]>max)
                    max=arr[i][j];
            }
        }
        System.out.println("Maximum element in the array: "+max);
    }
}
