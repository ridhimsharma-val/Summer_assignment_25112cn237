import java.util.Scanner;

public class WaveArray {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n= in.nextInt();
        int [] arr= new int[n];
        System.out.print("Enter array elements: ");
        for(int i=0;i<n;i++)
            arr[i]= in.nextInt();
        //for sorted array
        for(int i=0;i<n;i+=2){
            if(i==n-1)   
                break;      // to handle odd array as at last only single element is left so swappin with i+1 will give index out of bound error
            int temp= arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
        }
        System.out.print("Wavy <<^-^>> array: ");
        for(int ele: arr)
            System.out.print(ele+" ");

        in.close();
    }
}
