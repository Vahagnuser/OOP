package Vahagn_Musheghyan_HW02;


import java.util.Scanner;

/*
  This class reads an AUA ID and checks if it is in the correct format.
  
  Author: Vahagn Musheghyan
 */
public class Problem5 {
    public static void main(String[] args) {
        // *** Create a scanner object to read input from the terminal***
        Scanner sc = new Scanner(System.in);

        // ***Prompt the user to enter an AUA ID***
        System.out.print("Enter an AUA ID: ");

        // ***Read the input string***
        String input = sc.nextLine();

        // ***Check if the length of the input is 9***
        if (input.length() != 9) {
            System.out.println("false");
        } else {
            boolean correctFormat = true;

            // ***Check if the first two characters are letters***
            for (int i = 0; i < 2; i++) {
                if (!Character.isLetter(input.charAt(i))) {
                    correctFormat = false;
                    break;
                }
            }

            // ***Check if the next seven characters are digits***
            for (int i = 2; i < 9; i++) {
                if (!Character.isDigit(input.charAt(i))) {
                    correctFormat = false;
                    break;
                }
            }

            // ***Print the result based on the format check true or false***
            if (correctFormat) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        }

        // ***Close the scanner***
        sc.close();
    }
}
