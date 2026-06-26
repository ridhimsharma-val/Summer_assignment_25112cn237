import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a word(enter all small): ");
        String s=in.next();
        int i=0;
        int j=s.length()-1;
        boolean check=true;
        while(i<j){
            if(s.charAt(i) != s.charAt(j)){
                check =false;
                break;
            }
                i++;
                j--;
        }
        if(check)
            System.out.println("Is a palindrome");
        else
            System.out.println("Not a palindrome");

        in.close();
    }
}
