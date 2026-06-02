import java.util.Scanner;

public class HCF {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.print("Enter Both numbers: ");
        int n1=in.nextInt(), n2=in.nextInt();

        //method1
        // int smaller=Math.min(n1, n2); // we will check smaller Because no number greater than the smaller number can divide the smaller number.
        // int HCF=0;
        // for(int i=1;i<=smaller;i++){
        //     if(n1%i==0 && n2%i==0){
        //         HCF=i;
        //     }
        // }
        // System.out.println("HCF: "+HCF);

        //method 2: using remainder method'

        int a=Math.max(n1, n2), b =Math.min(n1, n2);
        while(b!=0){
             int rem=a%b;
            a=b;
            b=rem;
        }
        System.out.println("HCF: "+a);
        in.close();
    }
}
