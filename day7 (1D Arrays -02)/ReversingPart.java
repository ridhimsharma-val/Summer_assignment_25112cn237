import java.util.Scanner;

public class ReversingPart {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n= in.nextInt();
        int[] arr= new int[n];
        System.out.print("Enter array elements: ");
        for(int i=0;i<n;i++)
            arr[i]=in.nextInt();
        System.out.print("Enter range of indices to be reversed: ");
        int n1=in.nextInt();
        int n2=in.nextInt();
        while(n1<n2){
            int temp=arr[n1];
            arr[n1]=arr[n2];
            arr[n2]=temp;
            n1++;
            n2--;
        }
        System.out.print("array after reversing part: ");
        for(int ele:arr)
            System.out.print(ele+" ");

        in.close();
    }
}
