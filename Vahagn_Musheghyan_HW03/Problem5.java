package Vahagn_Musheghyan_HW03;
public class Problem5 {
  
   /*
      Generates an n x n 2D array filled with numbers from 1 to n^2 in snake order.
     
     */
    public static int[][] generateSnakeOrderArray(int n) {
        if (n < 1 || n > 30) {
            throw new IllegalArgumentException("n must be between 1 and 30");
        }

        int[][] array = new int[n][n];
        int value = n * n;
           // Fill the array in snake order pattern
        for (int col = 0; col < n; col++) {
            if (col % 2 == 0) { // Even columns (0-based index)
                for (int row = 0; row < n; row++) {
                    array[row][col] = value--; // Fill from top to bottom
                }
            } else { // Odd columns
                for (int row = n - 1; row >= 0; row--) {
                    array[row][col] = value--; // Fill from bottom to top
                }
            }
        }
                
             
        return array;
    }

    public static void main(String[] args) {
        int n = 3;
        int[][] result = generateSnakeOrderArray(n);
        System.out.println("Snake order array for n = " + n + ":");
        // for (int[] row : result) {
        //     System.out.println(Arrays.toString(row));
        // }
        CsUtils.printMatrix(result);
        n = 4;
        result = generateSnakeOrderArray(n);
        System.out.println("\nSnake order array for n = " + n + ":");
        // for (int[] row : result) {
        //     System.out.println(Arrays.toString(row));
        // }
        CsUtils.printMatrix(result);
    }
}
    
