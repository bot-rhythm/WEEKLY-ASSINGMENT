import java.util.Scanner;
public class FahrenheitToCelsius {
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner input = new Scanner(System.in);
        
        // Variable declarations
        double fahrenheit;
        double celsiusResult;
        
        // Take user input
        System.out.print("Enter temperature in Fahrenheit: ");
        fahrenheit = input.nextDouble();
        
        // Convert Fahrenheit to Celsius using formula: (°F − 32) x 5/9 = °C
        celsiusResult = (fahrenheit - 32) * 5.0 / 9.0;
        
        // Display output
        System.out.println("The " + fahrenheit + " fahrenheit is " + celsiusResult + " celsius");
        
        // Close scanner
        input.close();
    }
}

