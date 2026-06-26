import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String s= in.next();
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        System.out.println(sb);
        in.close();
    }
}
// cant do the two pointer method as strings are immutable so no indexed will be changed
