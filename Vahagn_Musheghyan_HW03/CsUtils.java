package Vahagn_Musheghyan_HW03;

import java.util.Arrays;

public class CsUtils {
    /*
      Appends an integer value to an array.
     
     */
    public static int[] appendToArray(int[] array, int value) {
        int[] newArray = Arrays.copyOf(array, array.length + 1);
        newArray[newArray.length - 1] = value;
        return newArray;
    }

    /*
      Reverses the digits of an integer.
      
    
     */
    public static int reverse(int value) {
        int reversed = 0;
        while (value != 0) {
            reversed = reversed * 10 + value % 10;
            value = value / 10;
        }
        return reversed;
    }

    /*
     Checks if the given integer is a palindrome using int reverse methid.
     */
    public static boolean isPalindrome(int n) {
        if (n < 0) {
            return false; // Negative numbers are not palindromes
        }
        return n == reverse(n);
    }

    /*
      Checks if the given string is a palindrome.
      Uses a two-pointer technique to compare characters from both ends towards the center.
    
     */
    public static boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        // Compare characters from both ends towards the center
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false; // If characters do not match, it's not a palindrome
            }
            left++;
            right--;
        }

        return true; // If all characters matched, it's a palindrome
    }
    /**
     * A method for printing arrays of type int[]
     * @param arr The array containing the numbers that need to be printed
     */
    public static void printArray(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]);
            if(i != arr.length - 1){
                System.out.print("\t");
            }
        }
        System.out.println();
    }

    /**
     * A method for printing 2D arrays of type int[][]. It relies on the one-dimensional array printer method.
     * @param mtx The values that need to be printed. Each row of the 2D array is an array and can be used as such.
     */
    public static void printMatrix(int[][] mtx){
        for(int i = 0; i < mtx.length; i++){
            printArray(mtx[i]);
        }
    }

    /**
     * A method for printing a 2D array of strings.
     * It overloads the int[][] version.
     * Since we did not have a method for printing String[] arrays,
     * this implementation is done using the nested loop approach.
     * @param mtx A 2D array containing words.
     */
    public static void printMatrix(String[][] mtx){
        for(int i = 0; i < mtx.length; i++){
            for(int j = 0; j < mtx[i].length; j++){
                System.out.print(mtx[i][j]);
                if(j != mtx[i].length - 1){
                    System.out.print(", ");
                }
            }
            System.out.println();
        }
    }

}
