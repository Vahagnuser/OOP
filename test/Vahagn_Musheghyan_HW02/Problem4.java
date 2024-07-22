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

        //***  Convert the sentence to a char array*** 
        char[] charArray = sentence.toCharArray();
        
        //***  Reverse the char array in place*** 
        int left = 0;
        int right = charArray.length - 1;
        char temp;
        while (left < right) {
            //***  Swap characters at left and right indices *** 
            temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;
            
            //***  Move towards the center*** 
            left++;
            right--;
        }
        
        //***  Print the reversed char array as a String*** 
        System.out.println(charArray);
        
        // *** Close the scanne ***
        scanner.close();
    }
}
