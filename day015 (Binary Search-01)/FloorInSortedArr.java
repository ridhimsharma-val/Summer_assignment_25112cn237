/*find the index (0-based) of the largest element in arr[] that is less than or equal to x. This element is called the floor of x. If such an element does not exist, return -1.

Note: In case of multiple occurrences of floor of x, return the index of the last occurrence. */

public class FloorInSortedArr {
    public static void main(String[] args) {
        int[] arr={1,2,8,10,10,12,19};
        int target=11;
        int idx=floor(arr,target);
        System.out.print("Floor of x is at idx: "+idx);
    }
    public static int floor(int[] arr,int x){
        int low=0;
        int high=arr.length-1;
        int idx=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]>x)     
                high=mid-1;     // uske aage floor nii mil skta
            else{             // when arr[mid]<=x there is a possibility that arr[mid] can be x so stored its idx
            idx=mid;       // when finding arr[mid]=x will not return mid directly , will check the last occurance
            low=mid+1;
            }
        }
        return idx;
    }
}
