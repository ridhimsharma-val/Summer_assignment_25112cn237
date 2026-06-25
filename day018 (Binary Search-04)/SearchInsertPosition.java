//Leetcode -35

public class SearchInsertPosition {
    public static void main(String[] args) {
        int[] arr={1,3,5,6};
        int target =2;
        int idx=search(arr,target);
        System.out.println(idx);
        
    }
    public static int search(int[] arr,int x){
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==x)
                return mid;
            else if(arr[mid]>x)
                high=mid-1;
            else
                low=mid+1;
        }
        return low;  // whwn loop breaks low will always be the insertion position 
    }
}
