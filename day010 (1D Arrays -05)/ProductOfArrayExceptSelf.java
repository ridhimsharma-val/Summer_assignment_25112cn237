//For every index, output: product of all ele except itself

import java.util.Scanner;

public class ProductOfArrayExceptSelf {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n= in.nextInt();
        int[] arr= new int[n];
        System.out.print("Enter array elements: ");
        for(int i=0;i<n;i++)
            arr[i]=in.nextInt();

        //method 1(brute force)
/*        int[] res= new int[n];
        for(int i=0;i<n;i++){
            int product=1;
            for(int j=0;j<n;j++){
                if(i!=j)
                    product*=arr[j];
            }
            res[i]=product;
        }
        for(int ele:res)
            System.out.print(ele+" ");
*/
        
        //method 2(total product approach(fails when array contains zero)) 
        int totalproduct=1;
        for(int ele:arr)
            totalproduct*=ele;
        for(int i=0;i<n;i++){
            arr[i]=totalproduct / arr[i];
        }
        for(int ele:arr)
            System.out.print(ele+" ");

        in.close();
    }
}
