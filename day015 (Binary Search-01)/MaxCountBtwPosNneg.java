// Leetcode-2529

public class MaxCountBtwPosNneg {
    public static void main(String[] args) {
        int arr[]={-3,-2,-1,0,0,1,2};
        int count=maxCount(arr);
        System.out.print(count);
    }
    public static int maxCount(int[] arr){
        int low=0;
        int n= arr.length;
        int high=n-1;
        //for negative numbers
        int negCount=arr.length;   //if all -ve nikle then loop se koi change nii hoga so pehle se hi wo case liya
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]>=0){
                negCount=mid;
                high=mid-1;   // check kro first non negative occurance ke liye
            }
            else
                low=mid+1;  // agr mid -ve aaya to uske pehle ke bhi negative rhenge
        }
        //for pawsitive numbers
        low=0;
        high=n-1;
        int posCount=arr.length;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]>0){
                posCount=mid;
                high=mid-1;  // check for first pawsitive occurance
           }
            else
                low=mid+1;
        }
        posCount=n-posCount;
        return (Math.max(negCount, posCount));
    }
}
