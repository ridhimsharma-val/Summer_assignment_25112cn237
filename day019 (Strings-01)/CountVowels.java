import java.util.Scanner;

public class CountVowels {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter something: ");
        String s=in.nextLine();
        int n=s.length();
        int count=0;
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(ch=='a' ||ch=='e'||ch=='i'||ch=='o'||ch=='u'||
            ch=='A' ||ch=='E'||ch=='I'||ch=='O'||ch=='U')
                count++;
        }
        System.out.println(count);

        in.close();
    }
}
