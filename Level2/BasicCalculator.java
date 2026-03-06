import java.util.Scanner;
public class BasicCalculator {
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner input = new Scanner(System.in);
        
        // Variable declarations
        double number1;
        double number2;
        double addition;
        double subtraction;
        double multiplication;
        double division;
        
        // Take user inputs
        System.out.print("Enter first number: ");
        number1 = input.nextDouble();
        
        System.out.print("Enter second number: ");
        number2 = input.nextDouble();
        
        // Perform arithmetic operations
        addition = number1 + number2;
        subtraction = number1 - number2;
        multiplication = number1 * number2;
        division = number1 / number2;
        
        // Display output
        System.out.println("The addition, subtraction, multiplication, and division value of 2 numbers " + number1 + " and " + number2 + " is " + addition + ", " + subtraction + ", " + multiplication + ", and " + division);
        
        // Close scanner
        input.close();
    }
}



