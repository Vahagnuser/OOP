import java.util.Scanner;

public class Problem05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = scanner.nextInt();
        boolean isPowerOfTwo = (n & (n - 1)) == 0;
        System.out.println(isPowerOfTwo ? "Is power of 2" : "Not a power of 2");
    }
}