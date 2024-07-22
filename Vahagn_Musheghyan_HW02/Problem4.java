package Vahagn_Musheghyan_HW02;

import java.util.Scanner;

/**
 This class reads a sentence from the terminal and prints it in reverse.

  
 Author: Vahagn Musheghyan
 */
public class Problem4 {
    public static void main(String[] args) {
        //  *** Create a scanner object to read input from the terminal *** 
        Scanner scanner = new Scanner(System.in);

        // ***  Prompt the user to enter a sentence *** 
        System.out.print("Enter a sentence... ");

        // ***  Read the input sentence *** 
        String sentence = scanner.nextLine();

        //*** extracts each character start from last ***
        for (int i=sentence.length()-1; i>=0; i--)
        {
          System.out.print( sentence.charAt(i)); 
          
        }
        
        
        // *** Close the scanne ***
        scanner.close();
    }
}
