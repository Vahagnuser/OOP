package Vahagn_Musheghyan_HW02;
import java.util.Scanner;

/*
 This class reads an integer from the terminal and determines if it is even or odd using bitwise operations
 Author: Vahagn Musheghyan
 */
public class Problem1 {
    public static void main(String[] args) {
        // *** Create a scanner object to read input from the terminal ***
        Scanner sc = new Scanner(System.in);

        // ***  Prompt the user to enter an integer *** 
        System.out.print("Enter an integer: ");
        
        // ***  Read the integer value *** 
        int number = sc.nextInt();
        
        // ***  Determine if the number is even or odd using bitwise AND operation  *** 
        // ***  If the least significant bit is 0 the number is even, otherwise it is odd *** 
        System.out.println((number & 1) == 0 ? "even" : "odd");
        
        // ***  Close the scanner *** 
        sc.close();
    }
}
