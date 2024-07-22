public class Problem09 {
    public static void main(String[] args) {
        int n = 7; // Example size, n must be odd
        printHourglassPattern(n);
    }

    public static void printHourglassPattern(int n) {
        if (n % 2 == 0) {
            System.out.println("n must be an odd number.");
            return;
        }

        // Upper half including the middle line
        for (int i = 0; i < n / 2 + 1; i++) {
            printLine(n, i);
        }

        // Lower half excluding the middle line
        for (int i = n / 2 - 1; i >= 0; i--) {
            printLine(n, i);
        }
    }

    private static void printLine(int n, int i) {
        // Print leading spaces
        for (int j = 0; j < i; j++) {
            System.out.print("#");
        }

        // Print pattern
        for (int j = 0; j < n - 2 * i; j++) {
            if (j % 2 == 0) {
                System.out.print("*");
            } else {
                System.out.print("#");
            }
        }

        // Print trailing spaces
        for (int j = 0; j < i; j++) {
            System.out.print("#");
        }

        // New line
        System.out.println();
    }
}
