import java.util.Scanner;

public class Rotate {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n= in.nextInt();
        int[] arr= new int[n];
        System.out.print("Enter array elements: ");
        for(int i=0;i<n;i++)
            arr[i]=in.nextInt();
        System.out.print("Eneter number of rotations: ");
        int k=in.nextInt();
        k = k % n;   //k should not be greater than n

        //for anti clockwise rotation
        reverse(arr,0,k-1);   //reversing first portion
        reverse(arr,k,n-1);  //reversing second portion
        reverse(arr,0,n-1);    //reversing complete array
        System.out.print("Rotated array: ");
        for(int ele: arr)
            System.out.print(ele+" ");

        in.close();
    }
    public static void reverse(int[] rev, int i, int j){    // no need to return somethin as arrays are passed by reference so changes will happen in arr only
        while(i<j){
            int temp=rev[i];
            rev[i]=rev[j];
            rev[j]=temp;
            i++;
            j--;
        }
    }
}

//for clockwise rotation just reverse the array first then reverse different parts
