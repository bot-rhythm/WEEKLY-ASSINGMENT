import java.util.Scanner;

public class SumNaturalNumbers {

    // Recursive method
    public static int recursiveSum(int n) {
        if (n == 1)
            return 1;
        return n + recursiveSum(n - 1);
    }

    // Formula method
    public static int formulaSum(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Not a natural number!");
        } else {
            int rec = recursiveSum(n);
            int form = formulaSum(n);

            System.out.println("Sum using recursion: " + rec);
            System.out.println("Sum using formula: " + form);

            if (rec == form) {
                System.out.println("Both results are equal ✅");
            } else {
                System.out.println("Results are not equal ❌");
            }
        }

        sc.close();
    }
}
