import java.util.Scanner;

public class Segregate0s1s2s {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n= in.nextInt();
        int[] arr=new int[n];
        System.out.print("Enter array elements(0,1,2 only): ");
        for(int i=0;i<n;i++)
            arr[i]=in.nextInt();
        int count0=0;
        int count1=0;
        for(int ele:arr){
            if(ele==0)
                count0++;
            else if(ele==1)
                count1++;
        }
        int i=0;
        while(count0!=0){
            arr[i]=0;
            i++;
            count0--;
        }
        while(count1!=0){
            arr[i]=1;
            i++;
            count1--;
        }
        while(i<n){
            arr[i]=2;
            i++;
        }
        for(int ele:arr)
            System.out.print(ele+" ");

        in.close();
    }
}
