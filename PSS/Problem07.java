package PSS;
import java.util.*;

public class Problem07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers. To stop, enter a non-integer or Ctrl+D:");
        readAndCube(sc);
    }

    public static void readAndCube(Scanner sc) {
        if (sc.hasNextInt()) {
            int number = sc.nextInt();
            readAndCube(sc);
            System.out.println(number * number * number);
        }
    }
}
