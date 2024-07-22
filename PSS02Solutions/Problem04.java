public class Problem04 {
    public static void main(String[] args) {
        /*
        Long.MAX_VALUE
    Long.MIN_VALUE
    -1L >>> 1
    ● -1L is (64 bits of 1s)
    ● Unsigned right shift: shift “-1L” right by 1 bit fills the leftmost bit with 0
    and shifts all bits to the right.
    ● This gives (0 & 63 bits of 1) which is ‘9223372036854775807’ the
    maximum positive value for ‘long’.
    1L << 63
    ● Shift 1 left by 63: This moves the binary 1 to the left most position and
    adds zeros from the right 63 times. This makes the number the
    smallest negative ‘long’ value which is ‘-9223372036854775808’.
         */
        //for (int i = 0; i <= 63; i++) {
            System.out.println();
            
    }
}
