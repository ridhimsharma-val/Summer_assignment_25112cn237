import java.util.Scanner;

public class Move0sToEnd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
         System.out.print("Enter array size: ");
        int n= in.nextInt();
        int[] arr= new int[n];
        System.out.print("Enter array elements: ");
        for(int i=0;i<n;i++)
            arr[i]= in.nextInt();
        int j = 0; 
        for(int i = 0; i < n; i++){
            if(arr[i] != 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
        for(int ele:arr)
            System.out.print(ele+" ");
        
    }
}
