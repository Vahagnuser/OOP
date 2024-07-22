package Vahagn_Musheghyan_HW03;
import java.util.Random;

public class Problem1 {

    // Method to check if a year is a leap year
    public static boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                return year % 400 == 0;
            } else {
                return true;
            }
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Random rand = new Random();
        int countLeapYears = 0;

        // Generate three random years from the 20th century (1901-2000)
        int years;
        for (int i = 0; i < 3; i++) {
            years = 1901 + rand.nextInt(100); // Generates a number between 1901 and 2000
            if (isLeapYear(years)) {
                countLeapYears++;
            }
            System.out.println(years);
        }

        // Print message based on countLeapYear 
        if (countLeapYears >= 2) {
            System.out.println("Most were leap years.");
        } else {
            System.out.println("Most were not leap years.");
        }
    }
}
