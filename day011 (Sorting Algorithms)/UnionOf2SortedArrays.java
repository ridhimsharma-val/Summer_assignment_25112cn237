import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class UnionOf2SortedArrays {

    public static void input(ArrayList<Integer> inp,Scanner in){
    System.out.print("Enter elements in array(press -1 to stop): ");
    while(true){
        int num=in.nextInt();
        if(num==-1)
            break;
        inp.add(num);
    }
    Collections.sort(inp);
}
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        input(arr,in);
        ArrayList<Integer> brr = new ArrayList<>();
        input(brr,in);
        ArrayList<Integer> res= new ArrayList<>();

        int i=0;
        int j=0;
        while(i<arr.size() && j<brr.size()){
            if(arr.get(i).equals(brr.get(j))){
                if(res.isEmpty() || !res.get(res.size()-1).equals(arr.get(i)))   // current element not equal to previous ele
                    res.add(arr.get(i));
                i++;
                j++;
            }
            else if(arr.get(i)<brr.get(j)){
                if(res.isEmpty() || !res.get(res.size()-1).equals(arr.get(i)))
                    res.add(arr.get(i));
                i++;
            }
            else{
                if(res.isEmpty() || !res.get(res.size()-1).equals(brr.get(j)))
                    res.add(brr.get(j));
                j++;
            }
        }
         while(i < arr.size()){           // if elements are left in arr
            if(res.isEmpty() || 
               !res.get(res.size()-1).equals(arr.get(i)))
                res.add(arr.get(i));
            i++;
        }
        while(j < brr.size()){             // if elements are left in brr
            if(res.isEmpty() || 
               !res.get(res.size()-1).equals(brr.get(j)))
                res.add(brr.get(j));
            j++;
        }
        System.out.println("Union: "+res);
        in.close();
    }
}
