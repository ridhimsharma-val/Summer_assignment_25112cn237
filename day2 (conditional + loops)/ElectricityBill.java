// like 5 rs/unit for first 50 units, 6 rs/unit for next 50 unit, 7r/unit fr rest

import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.print("Enter the units: ");
        float unit= in.nextFloat();
        float bill=0;
        if(unit<=50) bill= unit*5;
        else if(unit<=100) bill= 50*5 + (unit-50) *6;
        else  bill =50*5+50*6 +(unit-100)*7;
        System.out.println("Total bill= "+bill);
        in.close();
    }

}
