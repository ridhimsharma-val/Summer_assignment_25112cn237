import java.util.Scanner;

public class ReverseRows {
    
    public static void reverse(int[] arr){
        int i=0;
        int j=arr.length -1;
        while(i<j){
            int temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
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
        
        for(int i=0;i<arr.length;i++)
            reverse(arr[i]);               // paasing each row to reverse method as it's a array in itself

        for(int[] row : arr){           // printing using for each loop
            for(int ele : row)
                System.out.print(ele+" ");
            System.out.println();
        }
        in.close();
    }
}
