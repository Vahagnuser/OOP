package PSS;
public class Problem09 {
    public static void main(String[] args) {
        System.out.println(isPrime(29));
        System.out.println(isPrime(30));
    }

    public static boolean isPrime(int n){
        return isPrime(n,2);
    }

    public static boolean isPrime (int n, int i) {
        if (i >= n) {
            return true;
        }
        if (n < 1) {
            return false;
        }
        if (n % i == 0) {
            return false;
        }
        return isPrime(n, i + 1);
    }
}
