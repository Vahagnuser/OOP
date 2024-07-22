public class CsUtils {
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
     * A method for printing 2D arrays of type int[][]. It relies on the one-dimensional
     * array printer method.
     * @param mtx The values that need to be printed. Each row of the 2D array
     *            is an array and can be used as such.
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

    public static boolean isPalindrome(String s){
        for(int i = 0; i < s.length()/2; i++){
            if(s.charAt(i) != s.charAt(s.length() - 1 - i)){
                // As soon as a mismatch is encountered, return false.
                return false;
            }
        }
        return true;
    }


    public static boolean isPalindrome(int n){
        return reverse(n) == n;
    }

    public static int reverse(int n){
        int result = 0;
        while(n > 0){
            result *= 10;
            result += n % 10;
            n /= 10;
        }
        return result;
    }

    public static int[] appendToArray(int[] arr, int e){
        int[] result = new int[arr.length + 1];
        for(int i = 0; i < arr.length; i++){
            result[i] = arr[i];
        }
        result[arr.length] = e;
        return result;
    }

}