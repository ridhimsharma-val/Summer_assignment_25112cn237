import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
public class AddingOne {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> arr= new ArrayList<>();
        System.out.print("Enter elements(Enter -1 to exit): ");
        while(true){
            int num= in.nextInt();
            if(num==-1)
                break;
            arr.add(num);
        }

        //method 1 (my approach ;)
        Collections.reverse(arr);
        int sum=0;
        int place=1;
        for(int i =0;i<arr.size();i++){
            sum+=arr.get(i) * place;
            place*=10;
        }
        sum+=1;
        int i=0;
        while(sum!=0){
            int r= sum%10;
            if(i<arr.size())
                arr.set(i,r);
            else                 
                arr.add(r);
            // as array size isnt increased so it will give out of bound error if we change, so just add another index
            sum/=10;
            i++;
        }
        Collections.reverse(arr);
        System.out.println(arr);


        //method 2 (carry method)

        in.close();
    }
}
