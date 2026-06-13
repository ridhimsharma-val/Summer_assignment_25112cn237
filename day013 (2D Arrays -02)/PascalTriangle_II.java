//Given an integer rowIndex, return the rowIndexth (0-indexed) row of the Pascal's triangle.

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PascalTriangle_II {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        int rowIndex= in.nextInt();
        List<Integer> arr= new ArrayList<>();
        arr=getRow(rowIndex);
        for(int ele: arr)
            System.out.print(ele+" ");

        in.close();
    }
        //method 1 : runtime 2ms (as i am creating full triangle and storing each row so space O(n^2)
        public static List<Integer> getRow(int rowIndex){
            List<List<Integer>> arr= new ArrayList<>();
            for(int i=0;i<=rowIndex;i++){
                arr.add(new ArrayList<>());
                for(int j=0;j<=i;j++){
                    if(j==0 || j==i)
                        arr.get(i).add(1);
                    else{
                        int val= arr.get(i-1).get(j) + arr.get(i-1).get(j-1);
                        arr.get(i).add(val);
                    }
                }   
            }
            return arr.get(rowIndex);
        }


        // method 2 : runtime 1 ms (storing just previous row and current row )
        
        
}
