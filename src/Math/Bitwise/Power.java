package Math.Bitwise;

public class Power {
    public static void main(String[] args) {
        int base = 2;
        int exponent = 3;
        System.out.println(power(base, exponent));
    }

    static int power(int base, int exponent) {
        int result = 1;
        while (exponent > 0) {
            if ((exponent & 1) == 1) {
                result *= base;
            }
            base *= base;
            exponent >>= 1;
        }
        return result;
    }
    
}
