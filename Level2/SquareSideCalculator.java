import java.util.Scanner;
public class SquareSideCalculator {
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner input = new Scanner(System.in);
        
        // Variable declarations
        double perimeter;
        int numberOfSides = 4;
        double sideLength;
        
        // Take user input
        System.out.print("Enter perimeter of the square: ");
        perimeter = input.nextDouble();
        
        // Calculate side length
        sideLength = perimeter / numberOfSides;
        
        // Display output
        System.out.println("The length of the side is " + sideLength + " whose perimeter is " + perimeter);
        
        // Close scanner
        input.close();
    }
}

