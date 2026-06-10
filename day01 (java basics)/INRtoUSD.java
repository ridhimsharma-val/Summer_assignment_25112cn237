import java.util.Scanner;

public class INRtoUSD {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input input money in INR: ");
        double rupees=input.nextInt();
        double rate=0.012;
        double dollars= rupees*rate;
        System.out.println("Money in USD $ : "+dollars);
        input.close();
    }
}
