//Leetcode-74

public class SearchA2dMatrix {
    public static void main(String[] args) {
        int [][] arr= {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target=16;
        boolean check=search(arr,target);
        if(check)
            System.out.print("Target found");
        else
            System.out.print("Target not found");
    }
    public static boolean search(int[][] arr,int x){

        // 2d array ko as a 1D array visualize kiya and thne work on 1D array indices
        int low=0;
        int high= (arr.length * arr[0].length) -1;    //(total ele -1) will be last index of 1d array
        int n= arr[0].length;   // total columns
        while(low<=high){
            int mid=low+(high-low)/2;
            // 1d array ki mid idx ke liye row column find kro
            int row= mid/n;
            int col= mid%n;

            if(arr[row][col]==x)
                return true;
            else if(arr[row][col]<x)
                low=mid+1;
            else
                high=mid-1;
        }
        return false;
    }
}
