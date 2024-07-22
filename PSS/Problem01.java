package PSS;
public class Problem01 {
    public static boolean containsOddDigit(int n){
        n = (n > 0) ? n : -n;
        while(n > 0){
            if((n & 1) == 1){
                return true;
            }
            n /= 10;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(containsOddDigit(446687));
        System.out.println(containsOddDigit(446688));
    }
}
