package PSS;
public class Problem06 {
    public static void main(String[] args) {
        char[] chs = randomChars(40);
        for (int i = 0; i < chs.length; i++) {
            System.out.print(chs[i]);
        }
    }

    public static char[] randomChars(int size){
        char[] result = new char[size];
        for(int i = 0; i < size; i++){
            result[i] = (char) ((Math.random() * 94) + 33);
            // generates a random char between 33 and 126
        }
        return result;
    }
}
