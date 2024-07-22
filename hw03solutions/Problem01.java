public class Problem01 {
    public static void main(String[] args){
        final int TOTAL = 3;
        int count = 0, year;

        for(int i = 0; i < TOTAL; i++){
            year = (int)(Math.random() * 100) + 1901;
            System.out.println(year);
            // We have to go through all the random years in order to print them anyway.
            if(isLeapYear(year)){
                count++;
            }
        }

        // generalized solution for more than half the cases
        if(count > TOTAL / 2 + 1){
            System.out.println("Most of the years were leap.");
        }
    }

    public static boolean isLeapYear(int y){
        return ((y % 4 == 0 && y % 100 != 0) || (y % 400 == 0));
    }
}
