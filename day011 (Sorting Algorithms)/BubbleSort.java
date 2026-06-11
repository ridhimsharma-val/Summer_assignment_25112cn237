import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n=in.nextInt();
        int[] arr= new int[n];
        System.out.print("Enter array elements: ");
        for(int i=0;i<n;i++)
            arr[i]=in.nextInt();

        //method 1  
/*      for(int i=0;i<n-1;i++){             //loop for each pass
            for(int j=0;j<n-1-i;j++){      // wha's happenin in each pass(every new pass will check 1 less then previous one as it's already sorted)
                if(arr[j]>arr[j+1]){
                    int temp= arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
*/

        //method 2
/*        for(int i=0;i<n-1;i++){      
            boolean isSorted=true;        // checked if the array got sorted before n-1 passes
            for(int j=0;j<n-1-i;j++){      
                if(arr[j]>arr[j+1]){
                    int temp= arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    isSorted=false;
                }
            }
            if(isSorted)                // if sorted then break the bigger loop
                break;
        }
*/
        //method 3
        for(int i=0;i<n-1;i++){ 
            int swaps=0;                     
            for(int j=0;j<n-1-i;j++){      
                if(arr[j]>arr[j+1]){
                    int temp= arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swaps++;             // can count if swaps happened
                }
            }
            if(swaps==0)              // if no swaps happened then array is sorted
                break;
        }
        for(int ele:arr)
            System.out.print(ele+" ");
        in.close();
    }
}
