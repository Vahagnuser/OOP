package PSS;
public class Problem10 {

    public static void main(String[] args) {
        System.out.println(factorialRecursive(6));
        System.out.println(factorialRecursive(4));
    }
    public static int factorialRecursive(int n){
        if(n > 1){
            return n * factorialRecursive(n - 1);
        }
        return 1;
    }
}
