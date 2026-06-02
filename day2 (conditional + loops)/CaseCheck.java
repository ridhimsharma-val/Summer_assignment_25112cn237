

import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        System.out.print("Enter a character: ");
        Scanner in=new Scanner(System.in);
        char ch=in.next().trim().charAt(0);

        //method1
        // if(ch>='a' && ch<='z')
        //     System.out.println(ch+" is lowercase");
        // else if(ch >='A' && ch<='Z')
        //     System.out.println(ch+" is uppercase");
        // else if(ch>='0' && ch<='9')
        //     System.out.println(ch+" is digit");
        // else 
        //     System.out.println(ch+ " is a special character");
        
        //method 2
        if(Character.isLowerCase(ch))
            System.out.println("lowercase");
        else if(Character.isUpperCase(ch))
            System.out.println("Uppercase");
        else if(Character.isDigit(ch))
            System.out.println("Digit");
        else System.out.println("Special character");
        in.close();
    }
    
}
