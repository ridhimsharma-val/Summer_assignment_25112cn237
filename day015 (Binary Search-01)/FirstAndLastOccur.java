// Leetcode-34
public class FirstAndLastOccur {
    public static void main(String[] args) {
        int[] arr={5,7,7,8,8,10};
        int target=8;
        int[] resIdx=searchRange(arr,target);
        for(int ele:resIdx)
            System.out.print(ele+" ");
    }
    public static int[] searchRange(int[] arr, int target) {
        int low=0;
        int high=arr.length-1;
        int first=-1;
        int last=-1;
        while(low<=high){                   //found first occurance
            int mid= low+(high-low)/2;
            if(arr[mid]>target)
                high=mid-1;
            else if(arr[mid]<target)
                low=mid+1;
            else{
                first=mid;
                high=mid-1;  // might possible to get ele in the left
            }
        }
        low=0;         // reseting low and high
        high=arr.length-1;
        while(low<=high){                    // found last occurance
            int mid= low+(high-low)/2;
            if(arr[mid]>target)
                high=mid-1;
            else if(arr[mid]<target)
                low=mid+1;
            else{
                last=mid;
                low=mid+1;  // might possible to get ele in the right
            }
        }
        int[] idx={first,last};
        return idx;
    }
}
