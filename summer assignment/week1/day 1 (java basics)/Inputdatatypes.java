import java.util.Scanner;

public class Inputdatatypes {
    public static void main(String[] args) {
        Scanner input =new Scanner (System.in);
        System.out.print("Enter Roll number: ");
        int rollno= input.nextInt();
        System.out.println("Your roll number is " +rollno);
        input.nextLine();     //java reads the previous enter in next input as it gets stored from previous input, using this clears the buffer and prepares scanner for fresh input
        System.out.print("Enter your name: ");
        String name=input.nextLine();
        System.out.println("Your name is "+name);
        float percentage=69.69f;
        System.out.println("Percentage :"+percentage );
        char grade='C';
        System.out.println("Your grade is "+grade);
        input.close();
    }
}
