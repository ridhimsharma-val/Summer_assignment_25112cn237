import java.util.Scanner;

public class LeaderInArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n= in.nextInt();
        int[] arr= new int[n];
        System.out.print("Enter array elements: ");
        int[] brr=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=in.nextInt();

        //method 1 (brute force)
/*        int x=0;
        for(int i=0;i<n;i++){
            boolean check=true;
            for(int j=i+1;j<n;j++){
                if(arr[i]<=arr[j]){
                    check=false;
                    break;
                }
            }
            if(check){
                brr[x]=arr[i];
                x++;
            }
        }
        for(int i= 0 ;i<x;i++)           // not to print zeroes that are in array after leaders
            System.out.print(brr[i]+" ");
*/

        //method 2 (traversing from right)
        int i=arr.length-1;
        int x=0;
        int max=Integer.MIN_VALUE;
        while(i>=0){
            if(arr[i]>max){
                max=arr[i];
                brr[x]=arr[i];
                x++;
            }
            i--;
        }
        for(int j=x-1;j>=0;j--)
            System.out.print(brr[j]+" ");

        in.close();
    }       
}
