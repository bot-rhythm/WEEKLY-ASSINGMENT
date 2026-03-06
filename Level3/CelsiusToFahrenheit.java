import java.util.Scanner;
public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner input = new Scanner(System.in);
        
        // Variable declarations
        double celsius;
        double fahrenheitResult;
        
        // Take user input
        System.out.print("Enter temperature in Celsius: ");
        celsius = input.nextDouble();
        
        // Convert Celsius to Fahrenheit using formula: (°C × 9/5) + 32 = °F
        fahrenheitResult = (celsius * 9.0 / 5.0) + 32;
        
        // Display output
        System.out.println("The " + celsius + " celsius is " + fahrenheitResult + " fahrenheit");
        
        // Close scanner
        input.close();
    }
}


