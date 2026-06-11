import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n=in.nextInt();
        int[] arr= new int[n];
        System.out.print("Enter array elements: ");
        for(int i=0;i<n;i++)
            arr[i]=in.nextInt();

        //method 1 (find smallest and swap with current)
/*        for(int i= 0;i<n-1;i++){
            int minIndex=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[minIndex]){
                    minIndex=j;
                }
            }
            int temp=arr[i];
                arr[i]=arr[minIndex];
                arr[minIndex]=temp;
        }
*/

        //mehtod 2 (find largest and swap with current)
        for(int i=n-1;i>0;i--){
            int maxdx=i;
            for(int j=i-1;j>=0;j--){
                if(arr[j]>arr[maxdx])
                    maxdx=j;
            }
            int temp=arr[i];
            arr[i]=arr[maxdx];
            arr[maxdx]=temp;
        }
        System.out.print("Sorted array: ");
        for(int ele:arr)
            System.out.print(ele+" ");
        in.close();
    }
}
