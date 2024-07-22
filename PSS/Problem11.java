package PSS;
public class Problem11 {
    public static void printArray(char[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void printMatrix(char[][] mtx){
        for(int i = 0; i < mtx.length; i++){
            printArray(mtx[i]);
        }
    }

    public static void printArray(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void printMatrix(int[][] mtx){
        for(int i = 0; i < mtx.length; i++){
            printArray(mtx[i]);
        }
    }

    public static void main(String[] args) {
        printMatrix(new char[4][4]);
        // the printed symbol is the char with the value 0
        System.out.println();

        printMatrix(generateSquareWithDiagonalPattern(5));
        // Returned matrix is passed to the print method.
        System.out.println();

        char[][] myChars = new char[4][4];
        fillSquareWithIncreasingLettersVertical(myChars);
        // This method is void and doesn't return anything but
        // modifies its param
        printMatrix(myChars);
    }

    public static char[][] generateSquareWithDiagonalPattern(int n){
        char[][] result = new char[n][n];
        for(int i = 0; i < result.length; i++){
            for(int j = 0; j <= i; j++){
                result[i][j] = (char)('A' + j);
                result[j][i] = result[i][j];

            }
        }
        return result;
    }


    public static void fillSquareWithIncreasingLettersVertical(char[][] m){
        int size = m.length;
        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                m[i][j] = (char)('A' + j * size + i);
            }
        }
    }
}
