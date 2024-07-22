public class Problem02 {
    public static void main(String[] args) {
        int a = 45; // Valid
        int b = 45.0; // Invalid
        int c = 0xcl; // Invalid
        double d = 5; // Valid
        double e = 5e1f; // Valid
        float f = 0x5e1f; // Valid
        boolean g = FALSE; // Invalid
        boolean h = g = true; // Valid

    }
}
