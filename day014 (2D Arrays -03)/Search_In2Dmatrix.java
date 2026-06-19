// Leetcode 240
import java.util.Scanner;

public class Search_In2Dmatrix {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] arr= {{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
        System.out.print("Enter the target: ");
        int target=in.nextInt();
        if(search(arr,target))
            System.out.println(target+" found");
        else
            System.out.println(target+" not found");

        in.close();
    }

    //method 1 (runtime 11ms as traversing complete array, Time complexity: O(m*n))
/*    public static boolean search(int[][] arr, int target){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]==target) return true;
            }
        }
        return false;
    }
}
*/

    // method 2  (time complexity: O(m+n))
        public static boolean search(int[][] arr, int target){
            int i= 0;     // first row
            int j= arr[0].length -1;       // last column
            while(i<arr.length && j>=0){  // break loop when i or j move out of the matrix
                if(arr[i][j]>target)     // go left [possible that the ele can be found on left , uske neeche waale bhi taget se abde honge]
                    j--;
                else if(arr[i][j]<target)  // go down [ not possible to get ele in the left, uske left waale bhi taget se chhote honge]
                    i++;
                else
                    return true;
            }
            return false;
        }

    }
