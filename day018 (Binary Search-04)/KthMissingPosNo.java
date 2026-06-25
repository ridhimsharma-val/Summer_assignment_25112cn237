//Leetcode-1539

public class KthMissingPosNo {
    public static void main(String[] args) {
        int[] arr={2,3,4,7,11};
        int targetIdx= 5;
        int k=search(arr,targetIdx);
        System.out.println(k);
    }

    // wrong approach
/*    public static int search(int [] arr, int k){
        int low=0;
        int high=arr.length-1;
        ArrayList<Integer> miss =new ArrayList<>();
        // for left half space
        int i=1;
        while(low<high){
            int mid=low+(high-low)/2;

            if(mid !=arr[mid]+1 ){        // mot matching with index dat means there are ele missing in left
                if(arr[mid] !=arr[mid]-i  && arr[mid]-i >0){
                    miss.add(arr[mid]-i);
                    i++;
                }
                else{
                    high=mid;
                    i=1;
                }
            }
        }
        // for right half space
        high=arr.length-1;
        while(low<high){
            int mid=low+(high-low)/2;
            
            if(high!= arr[high]+1){    //idx not matching with ele dat means there are ele missing in right
                if(arr[mid]!=arr[mid]+i){
                    miss.add(arr[mid]+i);
                    i++;
                }
                else{    
                    low=mid;
                    i=1;
                }
            }
        }
        return miss.get(k-1);
    }
*/
  
    // correct method 
    public static int search(int[] arr, int k){
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            int correctVal= mid+1;        // arr[mid] should hold this value
            int miss= arr[mid]-correctVal;    // missing ele before mid\

            if(miss<k)           // if missing ele before mid is less than k then we will go ahead 
                low=mid+1;
            else{               // if missing ele is before mid is greater than or equal to k then the kth missing will be found in left half only
                high=mid-1;
            }
        }
        return high+1+k;    // loop breaks when high just become 1 less than low so there will be k missing ele b/t high and low and +1 for correct value on dat index
}
}