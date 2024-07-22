package Vahagn_Musheghyan_HW02;

import java.util.Scanner;

/**
  This class reads an integer from the terminal and prints a specified triangle pattern.
  
  Author: Vahagn Musheghyan
 */
public class Problem3 {
    public static void main(String[] args) {
        //  *** Create a scanner object to read input from the terminal *** 
        Scanner scanner = new Scanner(System.in);

        //  *** Prompt the user to enter the height of the triangle *** 
        System.out.print("Enter Triangle Height: ");

        //  *** Read the integer value *** 
        int n = scanner.nextInt();

        //  *** Print the triangle pattern *** 
        for (int i = 0; i < n; i++) {
            // ***  Print the first set of hashes *** 
            for (int j = 1; j <= i + 1; j++) System.out.print("#");

            // ***  Print spaces *** 
            for (int j = 2 * n - i; j >= i + 1; j--) System.out.print(" ");

            // ***  Print the second set of hashes *** 
            for (int j = 1; j <= i + 1; j++) System.out.print("#");

            System.out.print(" ");

            // ***  Print the third set of hashes *** 
            for (int j = 1; j <= n - i; j++) System.out.print("#");

            // ***  Print spaces *** 
            for (int j = 1; j <= 2 * (i + 1); j++) System.out.print(" ");

            // ***  Print the fourth set of hashes *** 
            for (int j = 1; j <= n - i; j++) System.out.print("#");

            //  ***  Move to the next line until i<n  *** 
            System.out.println();
        }

        //  *** Close the scanner  *** 
        scanner.close();
    }
}
