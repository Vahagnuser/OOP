package Vahagn_Musheghyan_HW03;
public class Problem6 {
  



   /*
      Generates an n x n 2D array filled with numbers from 1 to n^2 in snake order.
    */
    public static int[][] generateSpiralOrderArray(int size) {
        if (size < 1 || size > 30) {
            throw new IllegalArgumentException("n must be between 1 and 30");
        }

        
        int[][] array = new int[size][size];
        int value = size*size;
        int top = 0, bottom = size - 1;
        int left = 0, right = size - 1;
        while (value >0) {
            // Traverse from left to right along the top row
            for (int col = left; col <= right; col++) {
                array[top][col] = value--;
            }
            top++;

            // Traverse from top to bottom along the right column
            for (int row = top; row <= bottom; row++) {
                array[row][right] = value--;
            }
            right--;

            // Traverse from right to left along the bottom row
            for (int col = right; col >= left; col--) {
                array[bottom][col] = value--;
            }
            bottom--;

            // Traverse from bottom to top along the left column
            for (int row = bottom; row >= top; row--) {
                array[row][left] = value--;
            }
            left++;
        }

        return array;
    }

    public static void main(String[] args) {
        int n = 3;
        int[][] result = generateSpiralOrderArray(n);
        System.out.println("Spiral order array for n = " + n + ":");
        // for (int[] row : result) {
        //     System.out.println(Arrays.toString(row));
        // }
        CsUtils.printMatrix(result);
        n = 4;
        result = generateSpiralOrderArray(n);
        System.out.println("\nSpiral order array for n = " + n + ":");
        // for (int[] row : result) {
        //     System.out.println(Arrays.toString(row));
        // }
        CsUtils.printMatrix(result);
    }
}
    
