//Leetcode 566  (slight mapping concept)

import java.util.Scanner;

public class ReshapeTheMatrix {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int[][] arr= {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        System.out.print("Enter number of rows and col in reshaped matrix: ");
        int r= in.nextInt();
        int c=in.nextInt();
        int[][] res= new int[r][c];
        res= matrixReshape(arr, r, c);
        for(int[] row:res){
            for(int ele:row)
                System.out.print(ele+" ");
            System.out.println();
        }
        in.close();
    }
    public static int[][] matrixReshape(int[][] arr, int r, int c){
        int m=arr.length;
        int n= arr[0].length;
        if(m*n != r*c)     // total ele must be equal
            return arr; 
        int[][] res= new int[r][c];
        for(int idx=0; idx<m*n ; idx++){
        int oldRow = idx / n;      // row index milta h idx/number of rows
        int oldCol = idx % n;     // column index milta h idx% number of columns

        int newRow = idx / c;
        int newCol = idx % c;

        res[newRow][newCol] = arr[oldRow][oldCol];
        }
        return res;
    }
}
