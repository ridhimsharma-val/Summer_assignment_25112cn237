import java.util.ArrayList;
import java.util.Scanner;

public class PascalTriangle {
    public static int factorial(int n){
        int fact=1;
        for(int i=1;i<=n;i++)
            fact*=i;
        return fact;
    }
    public static int combination(int n, int r){
        int combination = factorial(n)/(factorial(r)*factorial(n-r));
        return combination;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Number of rows: ");
        int n=in.nextInt();
        ArrayList<ArrayList<Integer>> arr= new ArrayList<>();

        //method 1 : Time complexity O(n^3) because 3 times factorial loop is running
/*        for(int i=0;i<n;i++){
            arr.add(new ArrayList<>());
            for(int j=0;j<=i;j++){
                arr.get(i).add(combination(i,j));
            }
        }
*/

        //method 2 : Time complexity O(n^2)
        for(int i=0;i<n;i++){
            arr.add(new ArrayList<>());     // have to create new array list for each iteration
            for(int j=0;j<=i;j++){
                if(j==0 || j==i)           // simply fill 1 at borders, when j==0, j==i
                    arr.get(i).add(1);
                else{                     // otherwise fill the sum of upper element and upper left
                    int x= arr.get(i-1).get(j) + arr.get(i-1).get(j-1);
                    arr.get(i).add(x);
                }
            }
        }
        for(ArrayList<Integer> list:arr){
            for(int ele: list)
                System.out.print(ele+" ");
            System.out.println();

            in.close();
        }
    }
}
