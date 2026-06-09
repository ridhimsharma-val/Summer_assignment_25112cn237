import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class Merge2SortedArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter elements in array 1: ");
        ArrayList<Integer> arr= new ArrayList<>();
        input(arr,in);
        System.out.print("Enter elements in array 2: ");
        ArrayList<Integer> brr= new ArrayList<>();
        input(brr,in);
        ArrayList<Integer> res= new ArrayList<>();

        int i=0; // for arr 
        int j=0; //for brr

        //method 1
/*        while(i!=arr.size() || j!=brr.size()){
            if(i==arr.size()){
                res.add(brr.get(j));
                j++;
            }
            else if(j==brr.size()){
                res.add(arr.get(i));
                i++;
            }
            else if(arr.get(i)<brr.get(j)){
                res.add(arr.get(i));
                i++;
            }
            else{
                res.add(brr.get(j));
                j++;
            }
        }
*/

        //method 2
        while(i<arr.size() && j<brr.size()){     //will stop when either of array finishes
            if(arr.get(i)<brr.get(j)){
                res.add(arr.get(i));
                i++;
            }
            else{
                res.add(brr.get(j));
                j++;
            }
        }
        while(i<arr.size()){          // will work if j got finished and i left
            res.add(arr.get(i));
            i++;
        }
        while(j<brr.size()){        // will work if i got finished and j left
            res.add(brr.get(j));
            j++;
        }
        //method 3(can do from reverse)
        
        System.out.print("Merged array: ");
        System.out.println(res);
    }
    public static ArrayList<Integer> input(ArrayList<Integer> inp, Scanner in){
        while(true){
            int num = in.nextInt();
            if(num==-1)
                break;
            inp.add(num);
        }
        Collections.sort(inp);
        return inp;
    }
}
