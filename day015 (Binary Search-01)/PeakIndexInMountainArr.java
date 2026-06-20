// Leetcode -852 values increase to a peak element and then decrease in the array. Return the index of peak element

public class PeakIndexInMountainArr {
    public static void main(String[] args) {
        int[] arr={2, 5, 9, 14, 20, 27, 35, 42, 38, 31, 24, 16, 8};
        int idx=peakIdx(arr);
        System.out.print("peak ele found at index: "+idx);
    }
    public static int peakIdx(int[] arr) {
        int low=0;
        int high=arr.length-1;
        while(low<high){           // loop stops when low==high
            int mid= low+(high-low)/2;
            if(arr[mid]<arr[mid+1])   // agar mid agle ele se small h to uske pehle peak nii mil skta
                low=mid+1;           // das why search space mid ke baad ki kr di
            else                   // agar mid agle se big h to uske baad waalo se bhi big rhega to search space mid se pehle ki krdi
                high=mid;  //peak is either mid or somewhere to left  might be a possibility to find peak at mid so will not shift 1 back
        }
        return low;   // as low will be at the peak when loop stops
    }
}
