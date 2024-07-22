import java.util.Scanner;

public class Problem03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n; // the total number of entries
        String currentName, nameOfHighest, nameOfSecondHighest;
        float currentScore, sum = 0, min, max, secondHighestScore = 0;

        n = sc.nextInt();

        if (n < 1) {
            System.exit(0);
        }

        currentName = sc.next();
        sc.next(); // Surnames are not needed in this problem but they
        // appear in the input and this is how they can be discarded.
        nameOfHighest = currentName;
        nameOfSecondHighest = currentName;
        currentScore = sc.nextFloat();
        max = currentScore;
        min = currentScore;
        sum += currentScore;

        for (int i = 1; i < n; i++) {
            currentName = sc.next();
            sc.next();
            currentScore = sc.nextFloat();

            if (currentScore > max) {
                secondHighestScore = max;
                max = currentScore;
                nameOfSecondHighest = nameOfHighest;
                nameOfHighest = currentName;
            } else if (currentScore > secondHighestScore) {
                secondHighestScore = currentScore;
                nameOfSecondHighest = currentName;
            }

            if (currentScore < min) {
                min = currentScore;
            }

            sum += currentScore;
        }

        System.out.println("Name of highest score student " + nameOfHighest);
        System.out.println("Name of the 2nd highest score student " + nameOfSecondHighest);
        System.out.println("Average score is " + sum / n);
        System.out.println("Different between max and min " + (max - min));
    }
}
