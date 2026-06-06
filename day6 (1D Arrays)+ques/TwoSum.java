import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter array size: ");
        int n= in.nextInt();
        int[] arr=new int[n];
        System.out.print("Enter array elements: ");
        for(int i=0;i<n;i++)
            arr[i]=in.nextInt();
        System.out.print("Enter the sum: ");
        int targetsum=in.nextInt();
        System.out.print("Pairs: ");
        boolean flag= false;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]+arr[j]==targetsum){
                    System.out.print(arr[i]+","+arr[j]+"; ");
                    flag=true;
                }
            }
        }
        if(!flag) System.out.println("no pair found");
        in.close();
    }
}
