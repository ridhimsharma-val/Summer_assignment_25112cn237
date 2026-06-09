import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class AddTwoArrays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> arr= new ArrayList<>();
        System.out.print("Enter elements in array 1(press -1 to exit): ");
        input(arr,in);
        ArrayList<Integer> brr= new ArrayList<>();
        System.out.print("Enter elements in array 2(press -1 to exit): ");
        input(brr,in);
        ArrayList<Integer> res= new ArrayList<>();

        int i=arr.size()-1;
        int j=brr.size()-1;
        int carry=0;
        while(i>=0||j>=0){
             if(i < 0){
                int sum = brr.get(j) + carry;
                res.add(sum % 10);
                carry = sum / 10;
            }
            else if(j < 0){
                int sum = arr.get(i) + carry;
                res.add(sum % 10);
                carry = sum / 10;
            }
            else{
                int sum = arr.get(i) + brr.get(j) + carry;
                res.add(sum % 10);
                carry = sum / 10;
            }
            i--;
            j--;
        }
        Collections.reverse(res);

        if(carry==1)
            res.add(0,1);
        System.out.println(res);
        
    }
    public static ArrayList<Integer> input(ArrayList<Integer> inp, Scanner in){
        while(true){
            int num =in.nextInt();
            if(num==-1)
                break;
            inp.add(num);
        }
        return inp;
    }
}
