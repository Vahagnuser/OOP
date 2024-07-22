package Vahagn_Musheghyan_HW03;
public class Problem2 {

    public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);
        //System.out.print("Enter a value to check for palindrome: ");
        //String input1 = scanner.nextLine(); // Read input as a string
        //int input2=scanner.nextInt();
        String input1 ="assa";
        int input2=21144112;

        // Check if the input is a palindrome
        boolean isPalindromeString = CsUtils.isPalindrome(input1);
        boolean isPalindromeInt = CsUtils.isPalindrome(input2);

        // Output the result based on whether the input is a palindrome or not
        if (isPalindromeString) {
            System.out.println(input1 + " is a palindrome.");
        } else {
            System.out.println(input1 + " is not a palindrome.");
        }
        if (isPalindromeInt) {
            System.out.println(input2 + " is a palindrome.");
        } else {
            System.out.println(input2 + " is not a palindrome.");
        }
    }
}

