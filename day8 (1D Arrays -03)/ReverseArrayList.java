import java.util.ArrayList;
import java.util.Scanner;

public class ReverseArrayList {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> arr= new ArrayList<>();
        System.out.print("Enter elements (enter -1 to stop): ");
        while(true){
            int num= in.nextInt();
            if(num==-1)
                break;
            arr.add(num);
        }
        int i=0;
        int j= arr.size()-1;
        while(i<j){
            int temp=arr.get(i);
            arr.set(i,arr.get(j));
            arr.set(j,temp);
            i++;
            j--;
        }
        System.out.print("Reversed array list: ");
        System.out.println(arr);

        in.close();
    }
}
