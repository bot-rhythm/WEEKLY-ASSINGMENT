import java.util.Scanner;
public class TriangleAreaCalculator {
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner input = new Scanner(System.in);
        
        // Variable declarations
        double baseInCm;
        double heightInCm;
        double areaInSqCm;
        double conversionFactor = 2.54;
        double baseInInches;
        double heightInInches;
        double areaInSqInches;
        
        // Take user inputs
        System.out.print("Enter base in cm: ");
        baseInCm = input.nextDouble();
        
        System.out.print("Enter height in cm: ");
        heightInCm = input.nextDouble();
        
        // Calculate area in square centimeters
        areaInSqCm = 0.5 * baseInCm * heightInCm;
        
        // Convert base and height to inches
        baseInInches = baseInCm / conversionFactor;
        heightInInches = heightInCm / conversionFactor;
        
        // Calculate area in square inches
        areaInSqInches = 0.5 * baseInInches * heightInInches;
        
        // Display output
        System.out.println("The Area of the triangle in sq in is " + areaInSqInches + " and sq cm is " + areaInSqCm);
        
        // Close scanner
        input.close();
    }
}

