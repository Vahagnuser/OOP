package Vahagn_Musheghyan_HW03;
import java.util.Arrays;
import java.util.Scanner;
public class Problem4 {
  

 /*
      Recursively finds the prime factors of a given natural number and appends them to the result array.
    
     */
    public static int[] findPrimeFactors(int n, int factor, int[] result) {
        if (n <= 1) {
            return result; // Base case: return the result array
        }
        if (n % factor == 0) {
            // Current factor divides n, include it in the result
            result = CsUtils.appendToArray(result, factor);
            return findPrimeFactors(n / factor, factor, result);
        } else {
            // Current factor does not divide n, try the next factor
            return findPrimeFactors(n, factor + 1, result);
        }
    }

    
    public static void main(String[] args) {
        // Test cases for prime factorization
        int number = 60;
        int[] primeFactors = findPrimeFactors(number, 2, new int[0]);
        System.out.println("Prime factors of " + number + ": " + Arrays.toString(primeFactors));

        number = 45;
        primeFactors = findPrimeFactors(number, 2, new int[0]);
        System.out.println("Prime factors of " + number + ": " + Arrays.toString(primeFactors));

        number = 17; // Prime number
        primeFactors = findPrimeFactors(number, 2, new int[0]);
        System.out.println("Prime factors of " + number + ": " + Arrays.toString(primeFactors));

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your number:");
        int n= sc.nextInt();
        primeFactors = findPrimeFactors(n, 2, new int[0]);
        System.out.println("Prime factors of " + n + ": " + Arrays.toString(primeFactors));
        sc.close();
    }
}


