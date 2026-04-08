import java.util.Scanner;

public class Level1_Problem2_NumberCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        System.out.println("Enter 5 numbers:");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                System.out.print(arr[i] + " is Positive ");

                if (arr[i] % 2 == 0)
                    System.out.println("and Even");
                else
                    System.out.println("and Odd");
            } 
            else if (arr[i] < 0) {
                System.out.println(arr[i] + " is Negative");
            } 
            else {
                System.out.println(arr[i] + " is Zero");
            }
        }

        if (arr[0] == arr[4]) {
            System.out.println("First and last elements are Equal");
        } 
        else if (arr[0] > arr[4]) {
            System.out.println("First element is Greater than last");
        } 
        else {
            System.out.println("First element is Less than last");
        }

        sc.close();
    }
}
