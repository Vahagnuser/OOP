package PSS;
public class Problem04A {
    public static boolean containsEveryLetter(String sentence) {

        sentence = sentence.toLowerCase();
        for (char c = 'a'; c <= 'z'; c++) {
            if (sentence.indexOf(c) == -1) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String testSentence = "The quick brown fox jumps over the lazy dog";
        System.out.println(containsEveryLetter(testSentence));
    }
}
