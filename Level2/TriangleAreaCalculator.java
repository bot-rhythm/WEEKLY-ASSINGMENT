import java.util.Scanner;
public class DistanceConverter {
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner input = new Scanner(System.in);
        
        // Variable declarations
        double distanceInFeet;
        double feetPerYard = 3.0;
        double yardsPerMile = 1760.0;
        double distanceInYards;
        double distanceInMiles;
        
        // Take user input
        System.out.print("Enter distance in feet: ");
        distanceInFeet = input.nextDouble();
        
        // Convert feet to yards
        distanceInYards = distanceInFeet / feetPerYard;
        
        // Convert yards to miles
        distanceInMiles = distanceInYards / yardsPerMile;
        
        // Display output
        System.out.println("The distance in yards is " + distanceInYards + " while the distance in miles is " + distanceInMiles);
        
        // Close scanner
        input.close();
    }
}

