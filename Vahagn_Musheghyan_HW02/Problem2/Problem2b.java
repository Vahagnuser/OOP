package Vahagn_Musheghyan_HW02.Problem2;

import java.util.Scanner;

/**
  This class reads a positive integer and prints a series of swimming ducks based on the input.
 
  Author: Vahagn Musheghyan
 */
public class Problem2b {
    public static void main(String[] args) {
        // ***  Create a scanner object to read input from the terminal *** 
        Scanner sc = new Scanner(System.in);

        // ***  Prompt the user to enter the number of swimming ducks *** 
        System.out.print("Enter Swimming Ducks Count: ");

        while (true) {
            // ***  Read the integer value *** 
            int n = sc.nextInt();
            
            // ***  Check if the input is a positive number *** 
            if (n <= 0) {
                System.out.println("Ducks cannot be non-positive, enter a positive number...");
            } else {
                // ***  Print the upper part of the ducks  *** 
                for (int i = 1; i <= n; i++) {
                   if(i%5==1) System.out.print("<(^)____ ");
                   else if(i%5==2) System.out.print("=(-)____ ");
                   else if(i%5==3) System.out.print(">(^)____ ");
                   else if(i%5==4) System.out.print("<(-)____ ");
                   else  System.out.print("=(^)____ ");
                }
                System.out.println();

                // ***  Print the lower part of the ducks  *** 
                for (int i = 0; i < n; i++) {
                    System.out.print("   \\___/ ");
                }

                // ***  Close the scanner and exit the loop  *** 
                sc.close();break;
            }
        }
    }
}
