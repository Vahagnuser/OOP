public class Problem05 {

    public static void main(String[] args) {
        CsUtils.printMatrix(produceSnakeMatrix(3));
        System.out.println();
        CsUtils.printMatrix(produceSnakeMatrix(4));
    }

    public static int[][] produceSnakeMatrix(int n){
        int[][] result = new int[n][n];
        int num = n * n;

        for(int i = 0; num > 0; i += 2) {
            for (int j = 0; j < n; j++) {
                result[j][i] = num--;
            }

            if(num <= 0){
                break;
            }

            for (int j = 0; j < n; j++) {
                result[n - j - 1][i + 1] = num--;
            }

        }

        return result;
    }
}