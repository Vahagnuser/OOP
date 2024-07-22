package PSS;
public class Problem02 {
    public static void main(String[] args) {
        System.out.println(ourParseInt("-123") + 1);
        System.out.println(ourParseInt("+123") + 1);
        System.out.println(ourParseInt("123") + 1);
    }
    public static int ourParseInt(String str) {

        int result = 0;
        int sign = 1;
        int i = 0;

        if (str.charAt(0) == '-') {
            sign = -1;
            i++;
        }else if (str.charAt(0) == '+') {
            i++;
        }

        while (i < str.length()) {
            char c = str.charAt(i);
            if (c < '0' || c > '9') {
                System.out.println("Invalid character found: " + c);
                System.exit(0);
            }
            result = result * 10 + (c - '0');
            i++;
        }
        return result * sign;
    }
}
