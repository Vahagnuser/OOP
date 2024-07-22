package Vahagn_Musheghyan_HW03;
import java.util.Scanner;
public class Problem3 {
    
    
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
    
            // Input the number of students
            System.out.print("Enter the number of students: ");
            int n = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character after nextInt()
    
            if (n <= 0) {
                System.out.println("Invalid number of students.");
                return;
            }
    
            // Variables to store student information
            String[] firstNames = new String[n];
            String[] lastNames = new String[n];
            double[] scores = new double[n];
    
            // Input student names and scores
            for (int i = 0; i < n; i++) {
                System.out.println("\nEnter details for student " + (i + 1) + ":");
    
                // Input and validate first name
                boolean validFirstName = false;
                while (!validFirstName) {
                    System.out.print("First name: ");
                    firstNames[i] = scanner.nextLine();
                    if (firstNames[i].matches("[a-zA-Z]+")) {
                        validFirstName = true;
                    } else {
                        System.out.println("Invalid input. Please enter letters only.");
                    }
                }
    
                // Input and validate last name
                boolean validLastName = false;
                while (!validLastName) {
                    System.out.print("Last name: ");
                    lastNames[i] = scanner.nextLine();
                    if (lastNames[i].matches("[a-zA-Z]+")) {
                        validLastName = true;
                    } else {
                        System.out.println("Invalid input. Please enter letters only.");
                    }
                }
    
                // Input and validate exam score
                boolean validScore = false;
                while (!validScore) {
                    System.out.print("Exam score (0-20): ");
                    scores[i] = scanner.nextDouble();
                    scanner.nextLine(); // Consume the newline character after nextDouble()
                    if (scores[i] >= 0 && scores[i] <= 20) {
                        validScore = true;
                    } else {
                        System.out.println("Invalid input. Please enter a score between 0 and 20.");
                    }
                }
            }
    
            // Find student with highest score
            int highestIndex = 0;
            double highestScore = scores[0];
            for (int i = 1; i < n; i++) {
                if (scores[i] > highestScore) {
                    highestScore = scores[i];
                    highestIndex = i;
                }
            }
    
            // Find student with second highest score
            int secondHighestIndex = 0;
            double secondHighestScore = Double.MIN_VALUE;
            for (int i = 0; i < n; i++) {
                if (i != highestIndex && scores[i] > secondHighestScore) {
                    secondHighestScore = scores[i];
                    secondHighestIndex = i;
                }
            }
    
            // Calculate average score
            double totalScore = 0;
            for (int i = 0; i < n; i++) {
                totalScore += scores[i];
            }
            double averageScore = totalScore / n;
    
            // Find the lowest score
            double lowestScore = scores[0];
            for (int i = 1; i < n; i++) {
                if (scores[i] < lowestScore) {
                    lowestScore = scores[i];
                }
            }
    
            // Output results
            System.out.println("\nStudent with highest score:");
            System.out.println(firstNames[highestIndex] + " " + lastNames[highestIndex]);
    
            System.out.println("\nStudent with second highest score:");
            System.out.println(firstNames[secondHighestIndex] + " " + lastNames[secondHighestIndex]);
    
            System.out.println("\nAverage score in the class: " + averageScore);
    
            double scoreDifference = highestScore - lowestScore;
            System.out.println("\nDifference between highest and lowest scores: " + scoreDifference);
    
            
        }
    
    
}


