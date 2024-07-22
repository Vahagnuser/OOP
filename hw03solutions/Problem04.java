public class Problem04 {
    public static final int STARTING_DIVISOR = 2;
    // constants can be defined on the class level or inside methods.

    public static void main(String[] args) {
        CsUtils.printArray(factors(60));
    }

    // overload with default starting parameters for convenience
    public static int[] factors(int n){
        return factors(n, STARTING_DIVISOR);
    }
    public static int[] factors(int n, int div){
        if(n >= 2){
            if(n % div == 0){
                return CsUtils.appendToArray(factors(n/div,div),div);
            }else{
                return factors(n, div + 1);
            }
        }
        return new int[]{}; // Empty array.
    }
}
