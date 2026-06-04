import java.util.Scanner;

public class Butterfly {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n= in.nextInt();


        // method 1 

        int nsp=n-1, nst=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=nst;j++){
                System.out.print("* ");
            }
            for(int k=1;k<=nsp;k++){
                System.out.print("  ");
            }
            for(int l=1;l<=nst;l++){
                System.out.print("* ");
            }
            if(i<n/2+1){
                nsp-=2;
                nst++;
            }
            else{
                nsp+=2;
                nst--;
            }
            System.out.println();
        }
            

        // method 2  (upper half+ lower half)

       /*int ml=n/2+1;  //middle line
        int nst=1, nsp=n-1;

        //for first half
        for(int i=1;i<=ml;i++){
            for(int j=1;j<=nst;j++){
                System.out.print("* ");
            }
            for(int k=1;k<=nsp;k++){
                System.out.print("  ");
            }
            for(int l=1;l<=nst;l++){
                System.out.print("* ");
            }
            System.out.println();
            nsp-=2;
            nst++;
        }
        //for second half
        nst--;    // restoring stars N spaces
        nsp+=2;
        for(int i=1;i<=n-ml;i++){
            for(int j=1;j<=nst;j++){
                System.out.print("* ");
            }
            for(int k=1;k<=nsp;k++){
                System.out.print("  ");
            }
            for(int l=1;l<=nst;l++){
                System.out.print("* ");
            }
            System.out.println();
            nsp+=2;
            nst--;
        }
            */
        in.close();
    }
}
