import java.util.Random;

public class PlayerHeights {

    // Generate random heights
    public static int[] generateHeights() {
        int[] heights = new int[11];
        Random rand = new Random();

        for (int i = 0; i < heights.length; i++) {
            heights[i] = rand.nextInt(101) + 150; // 150 to 250
        }

        return heights;
    }

    // Sum of heights
    public static int sum(int[] arr) {
        int s = 0;
        for (int x : arr) {
            s += x;
        }
        return s;
    }

    // Mean height
    public static double mean(int[] arr) {
        return (double) sum(arr) / arr.length;
    }

    // Shortest height
    public static int shortest(int[] arr) {
        int min = arr[0];
        for (int x : arr) {
            if (x < min) {
                min = x;
            }
        }
        return min;
    }

    // Tallest height
    public static int tallest(int[] arr) {
        int max = arr[0];
        for (int x : arr) {
            if (x > max) {
                max = x;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] heights = generateHeights();

        System.out.print("Player Heights: ");
        for (int h : heights) {
            System.out.print(h + " ");
        }

        System.out.println("\nSum of heights: " + sum(heights));
        System.out.println("Mean height: " + mean(heights));
        System.out.println("Shortest height: " + shortest(heights));
        System.out.println("Tallest height: " + tallest(heights));
    }
}
