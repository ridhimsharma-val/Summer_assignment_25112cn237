// leetcode-48

//import java.util.Scanner;

public class RotateBy90 {
/*    public static void reverse(int[] rev){
        int i=0;
        int j=rev.length-1;
        while(i<j){
            int temp=rev[i];
            rev[i]=rev[j];
            rev[j]=temp;
            i++;
            j--;
        }
    }
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
        int[][] brr= new int[n][m];
        //did transpose
        for(int i=0;i<brr.length;i++){
            for(int j=0;j<brr[i].length;j++)
                brr[i][j]=arr[j][i];
        }
        //reversing rows
        for(int i=0;i<brr.length;i++){
            reverse(brr[i]);
        }
        for(int[] row:brr){
            for(int ele:row)
                System.out.print(ele+" ");
            System.out.println();
        }

        
    }


// aah for  anticlockwise rotattion , first rev rows then transpose or transpose then rev columns

*/
//leetcode method (for square matrix only)
public static void main(String[] args) {
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
        rotate(arr);
        for(int row[]:arr){
            for(int ele:row)
                System.out.print(ele+" ");
            System.out.println();
        }

    }
    public static void rotate(int[][] arr) {

        //transpose
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<i;j++){
                int temp = arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
        //reverse
        for(int i=0;i<arr.length;i++)
            reverse(arr[i]);
    }
    public static void reverse(int[] rev){
        int i=0;
        int j=rev.length-1;
        while(i<j){
            int temp=rev[i];
            rev[i]=rev[j];
            rev[j]=temp;
            i++;
            j--;
        }

    }
}