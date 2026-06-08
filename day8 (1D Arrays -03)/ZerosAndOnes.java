import java.util.Scanner;

public class ZerosAndOnes {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n= in.nextInt();
        int [] arr= new int[n];
        System.out.print("Enter array elements: ");
        for(int i=0;i<n;i++)
            arr[i]=in.nextInt();

        // method 1 : Two pass method
/*        int count0=0;
        for(int ele: arr){
            if(ele==0)
                count0++;
        }
        for(int i= 0;i<n;i++){
            if(i<count0)
                arr[i]=0;
            else 
                arr[i]=1;
        }
        for(int ele:arr)
            System.out.print(ele+" ");
        in.close();
*/

        // method 2 : Two pointer technique
/*        int i = 0;
        int j = n-1;
        while(i<j){
            if(arr[i]==1 && arr[j]==0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
            if(arr[i]==0)
                i++;
            if(arr[j]==1)
                j--;
        }
        for(int ele:arr)
            System.out.print(ele+" ");
*/

        // method 3 : Two pointer technique(cleaner/optimized code)
        int i=0;
        int j= n-1;
        while(i<j){
            if(arr[i]==0)
                i++;
            else if(arr[j]==1)
                j--;
            else if(arr[i]==1 && arr[j]==0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j--;
            }
        }
        for(int ele:arr)
            System.out.print(ele+" ");

        in.close();
    }
}
