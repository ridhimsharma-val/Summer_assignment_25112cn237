// Leetcode - 704

public class BinarySearch {
    public static void main(String[] args) {
       int[] arr={-1,0,3,5,9,12};
       int target=10;
       int resultIdx=search(arr,target);
       if(resultIdx ==-1)
        System.out.print("target not found");
       else
        System.out.print("ttarget found at "+resultIdx+" index");
    }
    public static int search(int[] arr, int target) {
        int low =0;
        int high=arr.length-1;
        while(low<=high){
            int mid=(low+high)/2;      //can do mid= low+(high-low)/2 to avoid integer overflow
            if(arr[mid]>target)      // go left
                high=mid-1;
            else if(arr[mid]<target) //go right
                low=mid+1; 
            else                     // if found then return its index
                return mid;
        }
        return -1;            // if not found then return -1;
    }
}
