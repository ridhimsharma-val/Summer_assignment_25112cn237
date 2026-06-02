// calculate distance b/w 2 pts

import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.print("Enter first pt coordinate: ");
        double x1= in.nextDouble(), y1= in.nextDouble(), z1= in. nextDouble();
        System.out.print("Enter second pt coordinates: ");
        double x2= in.nextDouble(), y2= in. nextDouble(), z2= in.nextDouble();
        double distance= Math.sqrt(Math.pow((x2-x1), 2)+Math.pow((y2-y1), 2)+ Math.pow((z2-z1), 2));
        System.out.println("Distance: "+distance);
        in.close();
    }
}
