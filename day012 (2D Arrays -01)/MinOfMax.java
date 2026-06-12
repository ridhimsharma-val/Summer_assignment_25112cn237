//find the minimum element out of all the maximum elements of each row

import java.util.Scanner;

public class MinOfMax {
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
        int min=Integer.MAX_VALUE;
        for(int i=0;i<m;i++){
            int max=Integer.MIN_VALUE;
            for(int j=0;j<n;j++){
                if(arr[i][j]>max)
                    max=arr[i][j];
            }
            if(max<min)
                min=max;
        }
        System.out.print("Minimum among row maximums: "+min);
        in.close();
    }
}
