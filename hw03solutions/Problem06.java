public class Problem06 {
    public static void main(String[] args) {
        int[][] m = new int[4][4];
        fillSpiralMatrix(m);
        CsUtils.printMatrix(m);

    }
    public static void fillSpiralMatrix(int[][] mtx) {
        int n = mtx.length;
        int num = n * n;

        for(int k = 0; k < (n /2); k++){

            for(int i = k; i < n - 1 - k; i++){
                mtx[k][i] = num--;
            }
            for(int i = k; i < n - 1 - k; i++){
                mtx[i][n-1-k] = num--;
            }
            for(int i = k; i < n - 1 - k; i++){
                mtx[n-1-k][n-1-i] = num--;
            }
            for(int i = k; i < n - 1 - k; i++){
                mtx[n-i-1][k] = num--;
            }
        }

        if(n%2 != 0){
            mtx[n/2][n/2] = 1;
        }

    }
}