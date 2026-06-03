import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        
    Scanner in= new Scanner(System.in);
    System.out.print("enter number of rows:");
    int m=in.nextInt();
    System.out.print("enter number of columns:");
    int n=in.nextInt();  
    for(int i=0;i<m;i++){
        for(int j=0;j<n;j++){
            System.out.print("* ");
        }
        System.out.println();
    } 
    in.close(); 
}
}