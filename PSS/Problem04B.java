package PSS;
public class Problem04B {
    public static void main(String[] args) {
        String testSentence = "The quick brown fox jumps over the lazy do";
        System.out.println(containsEveryLetter(testSentence));
    }
    public static boolean containsEveryLetter(String sentence) {
        boolean[] seen = new boolean[26];
        int count = 0;

        for(int i = 0; i < sentence.length(); i++){
            char c = sentence.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                c = (char) (c - 'A' + 'a');
            }
            if (c >= 'a' && c <= 'z') {
                int index = c - 'a';
                if (!seen[index]) {
                    seen[index] = true;
                    count++;
                }
            }
            if(count >= 26){
                return true;
            }
        }
        return false;
    }
}
