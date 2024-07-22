package PSS;
public class Problem05 {
    public static void main(String[] args) {
        String allCharacters = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz!@#$%^&*()_+-=[]{}|;':,.<>/?";
        int n = (int) (Math.random() * 21) + 20;
        for(int i = 0; i < n; i++){
            int index = (int) (Math.random() * allCharacters.length());
            System.out.print(allCharacters.charAt(index));
        }
        // See p6 for a different appropach
    }
}
