import java.util.Scanner;

public class Level3_Problem1_DigitFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;

        System.out.print("Enter a number: ");
        num = sc.nextInt();

        // Handle negative numbers
        if (num < 0) {
            num = -num;
        }

        int temp = num;
        int count = 0;

        // Count digits
        while (temp > 0) {
            count++;
            temp /= 10;
        }

        // Edge case: if number is 0
        if (num == 0) {
            count = 1;
        }

        int[] digits = new int[count];
        int index = 0;

        temp = num;

        // Store digits in array
        if (num == 0) {
            digits[0] = 0;
        } else {
            while (temp > 0) {
                digits[index] = temp % 10;
                temp /= 10;
                index++;
            }
        }

        // Frequency array (0–9)
        int[] freq = new int[10];

        // Calculate frequency
        for (int i = 0; i < digits.length; i++) {
            freq[digits[i]]++;
        }

        // Display result
        System.out.println("\nDigit Frequencies:");
        for (int i = 0; i < 10; i++) {
            if (freq[i] > 0) {
                System.out.println("Digit " + i + " occurs " + freq[i] + " times");
            }
        }

        sc.close();
    }
}
