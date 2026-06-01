import java.util.Scanner;

public class Greetingmsg {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in); 
        System.out.print("Enter a name: ");
        String name=input.nextLine(); 
        System.out.println("orewa "+name);   //System.out.println("orewa "+ input.nextLine())
        input.close();
    }


}
