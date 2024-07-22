package Vahagn_Musheghyan_HW02;

import java.util.Scanner;

/**
 * This class reads an integer from the terminal and prints the powers of two
 * that make up the value using bitwise operations.
 * 
 * Author: Vahagn Musheghyan
 */
public class Problem6 {
    public static void main(String[] args) {
        // Create a scanner object to read input from the terminal
        Scanner sc = new Scanner(System.in);

        // ***Prompt the user to enter an integer value***
        System.out.print("Enter an integer value: ");

        // ***Read the integer value***
        int value = sc.nextInt();

        // ***Close the scanner***
        sc.close();

        // ***Print the powers of two that make up the value***
        System.out.print("Powers of two that make up the value: ");
        for (int i = 0; i < 32; i++) {
            if ((value & (1 << i)) != 0) {
                System.out.print(1 << i);
                System.out.print(" ");
            }
        }
    }
}
