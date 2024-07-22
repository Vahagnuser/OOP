package PSS;
public class Problem03 {
    public static int romanToInt(String s){
        int result = 0, previousValue = 0, currentValue;

        for (int i = s.length() - 1; i >= 0; i--) {
            currentValue = 0;
            switch (s.charAt(i)) {
                case 'I':
                    currentValue =  1;
                    break;
                case 'V':
                    currentValue = 5;
                    break;
                case 'X':
                    currentValue = 10;
                    break;
                case 'L':
                    currentValue = 50;
                    break;
                case 'C':
                    currentValue = 100;
                    break;
                case 'D':
                    currentValue = 500;
                    break;
                case 'M':
                    currentValue = 1000;
            }

            if (currentValue < previousValue) {
                result -= currentValue;
            } else {
                result += currentValue;
            }

            previousValue = currentValue;
        }
        return result;
    }


    public static void main(String[] args) {
        String romanNumeral = "XXIV";
        int intValue = romanToInt(romanNumeral);
        System.out.println("Roman " + romanNumeral + " is " + intValue + " as integer.");
    }
}
