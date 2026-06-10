import java.util.Scanner;

public class MaxConsecutive1s {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n= in.nextInt();
        int[] arr= new int[n];
        System.out.print("Enter array elements: ");
        for(int i=0;i<n;i++)
            arr[i]=in.nextInt();

        //method 1(brute force)
/*        int max=0;
        for(int i=0;i<n;i++){
            int count=0;
            if(arr[i]==1){
                count++;
            for(int j=i+1;j<n;j++){
                if(arr[j]==1)
                    count++;
                else 
                    break;
                }  
            }
            if(count>max)
                max=count;
        }
        System.out.println("Maximum consecutive 1s in array: "+max);
*/
     
        //method 2(optimal solution)
        int currstreak=0;   //currentstreak
        int maxstreak=0;
        for(int i=0;i<n;i++){
            if(arr[i]==1){
                currstreak++;
                maxstreak=Math.max(currstreak, maxstreak);   //update max only if current streak is bigger
            }
            else
                currstreak=0;
        }
        System.out.print("maximum consecutive 1s in the array: "+maxstreak);
        in.close();
    }
}
