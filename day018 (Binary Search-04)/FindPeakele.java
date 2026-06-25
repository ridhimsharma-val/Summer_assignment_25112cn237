//Leetcode-162

public class FindPeakele {
    public static void main(String[] args) {
        int[] arr={1,2,1,3,5,6,4};
        int idx=peak(arr);
        System.out.print(idx);
    }
    public static int peak(int[] arr){
        int low=0;
        int high=arr.length-1;
        while(low<high){
            int mid=low+(high-low)/2;
            if(arr[mid]<arr[mid+1])    // mid agr agle se small then peak on right
                low=mid+1;
            else                // mid agle se bada then peak exist before or can be mid
                high=mid;      // jab mid agle se bada ho to high = mid krne se next iteration me check ho jaega ki usse pehle small aa rha
        }
        return low;
    }
}
