//Leetcode-33

public class SearchinRotatedSorted {
    public static void main(String[] args) {
        int[] arr={4,5,6,7,0,1,2};
        int target=0;
        int idx=search(arr,target);
        if(idx==-1)
            System.out.println("Target not found");
        else
            System.out.print("Target found at index: "+idx);
    }

    //method 1 (slightly wrong, many bugs)   (tried finding pivot and then applied binary search 2 times)
/*    public static int search(int [] arr, int x){
        // check rotations
        int low=0;
        int high=arr.length-1;
        while(low<high){
            int mid=low+(high-low)/2;
            if(arr[mid] > arr[high]){   // pivot is on right
                low=mid+1;    // check for last     
            }
            else       // rotation not happened
                high=mid;   // go left
        }
        int k=low;
        // if k=3 that means rotations till 2nd index

        if(arr[0]<=x){  // then rotated region will have x
            low=0;
            high=k-1;
            while(low<=high){
                int mid=low+(high-low)/2;
                if(arr[mid]==x)
                    return mid;
                else if(arr[mid]>x)
                    high=mid-1;
                else
                    low=mid+1;
            }
        }

        else{  // if arr[0] >x this means x will lie in next region
            low=k;
            high=arr.length-1;
            while(low<=high){
                int mid=low+(high-low)/2;
                if(arr[mid]==x)
                    return mid;
                else if(arr[mid]>x)
                    high=mid-1;
                else
                    low=mid+1;
            }
        }
        return -1;
    }
*/

    // method 2 (find a sorted half and search in sorted half )
    public static int search(int[] arr,int x){
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==x)
                return mid;
            else if(arr[low]<=arr[mid]){  // check if left half is sorted    (low to mid)
                if(x>=arr[low]  && x<arr[mid])   // check if x lies in left half
                    high=mid-1;                      // go to left half
                else   // arr does not lies in left half
                    low=mid+1;   // go to right half
            }
            else{      // check if right half is sorted     (mid to high)
                if(x>arr[mid] && x<=arr[high])      // check if x lies in right half
                    low=mid+1;                     // go to right half
                else                          // arr not in right half
                    high=mid-1;             // go to left half
            }
        }
        return -1;
    }
}
