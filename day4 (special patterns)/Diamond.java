import java.util.Scanner;

public class Diamond {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n=in.nextInt();
        int nsp=n/2,nst=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=nsp;j++){
                System.out.print("  ");
            }
            for(int k=1;k<=nst;k++){
                System.out.print("* ");
            }
            if(i<n/2+1){
                nst+=2;
                nsp--;
            }
            else{
                nst-=2;
                nsp++;
            }
            System.out.println();
        }in.close();
    }
}
