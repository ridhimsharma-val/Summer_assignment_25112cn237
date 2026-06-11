import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CommonElements {

    public static void input(ArrayList<Integer> inp, Scanner in){
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

        //methood 1 (brute force)
/*        for(int i=0;i<arr.size();i++){
            for(int j=0;j<brr.size();j++){
                if(arr.get(i).equals(brr.get(j))){
                    res.add(arr.get(i));
                    brr.set(j,-1);      // this will mark as brr[j] as used so no same brr ele will be matched multiple times
                    break;
                }
            }
        }
*/

        //method 2 (two pointers technique)
        int i=0;
        int j=0;
        while(i<arr.size() && j<brr.size()){
            if(arr.get(i).equals(brr.get(j))){
                res.add(arr.get(i));
                i++;
                j++;
            }
            else if(arr.get(i)<brr.get(j))
                i++;
            else
                j++;
        }
        System.out.println(res);
        in.close();
    }
}
