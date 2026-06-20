// Leetcode-59
//Given a positive integer n, generate an n x n matrix filled with elements from 1 to n^2 in spiral order.

import java.util.Scanner;

public class SpiralMatrix_II {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=in.nextInt();
        int [][] arr=spiral(n);
        for(int[] row: arr){
            for(int ele:row)
                System.out.print(ele+" ");
            System.out.println();
        }
        in.close();
    }
    public static int[][] spiral(int n){
        int[][] arr=new int[n][n];
        int fr=0;
        int fc=0;
        int lr=n-1;
        int lc=n-1;
        int num=1;
        while(fr<=lr && fc<=lc){
            
            for(int j= fc;j<=lc;j++)
                arr[fr][j]=num++;         // post increment of num first use then increase
            fr++;
            if(fr>lr)
                break;

            for(int i=fr;i<=lr;i++)
                arr[i][lc]=num++;
            lc--;
            if(fc>lc)
                break;

            for(int j=lc;j>=fc;j--)
                arr[lr][j]=num++;
            lr--;
            if(fr>lr)
                break;

            for(int i=lr;i>=fr;i--)
                arr[i][fc]=num++;
            fc++;
        }
        return arr;
    }
}
