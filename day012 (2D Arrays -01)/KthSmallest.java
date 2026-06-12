//dont use built in soorting(all ele are distinct)

import java.util.Scanner;

public class KthSmallest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n=in.nextInt();
        int[] arr= new int[n];
        System.out.print("Enter array elements: ");
        for(int i=0;i<n;i++)
            arr[i]=in.nextInt();
        System.out.print("Enter the value of k: ");
        int k=in.nextInt();

        //doing selection sort till k
        for(int i=0;i<k;i++){
            int mindx=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[mindx])
                    mindx=j;
            }
            int temp=arr[i];
            arr[i]=arr[mindx];
            arr[mindx]=temp;
        }
        System.out.print(arr[k-1]);
        in.close();
    }
}
