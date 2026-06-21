//Leetcode -540

public class SingleEleinSortedArr {
    public static void main(String[] args) {
        int[] arr={1,1,2,2,3,3,4,5,5,6,6};
        System.out.print("Single element: "+single(arr));
    }

public static int single(int[] arr){
    int low=0;
    int high=arr.length-1;
    int n=arr.length-1;
    if(arr.length==1)    // if single ele array , return it
        return arr[0];
    if(arr[0]!=arr[1])    // if first ele is single return it
        return arr[0];
    if(arr[n]!=arr[n-1])  // if last ele is single return it
        return arr[n];

    while(low<=high){
        int mid=low+(high-low)/2;
        if(arr[mid]!=arr[mid-1] && arr[mid]!=arr[mid+1])  // if mid left right dono ke equal nii then single ele found
            return arr[mid];
        else{
            int first=mid, last =mid;    // first and last occurance of mid pair, initially dono mid pr rkhe then did changes 
            if(arr[mid]==arr[mid-1])
                first=mid-1;    // first shifted 1 back
            else
                last=mid+1;   // last shifted 1 ahead

            int count=first-low;  // left ke ele count kiye
            if(count%2==0)     // if count even mila to left me sabhi pairs honge and single ele right milega
                low=last+1;  // mid se nii kiye becoz pairs me h to last ke aage se dekhenge
            else
                high=first-1;
        }
    }
    return 69;   // definately answer miljaega loop se or edge cases pr so returned random
}

}
