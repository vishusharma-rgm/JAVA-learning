package Math.Bitwise;

public class MagicNumber {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(magicNumber(n));
    }

    static int magicNumber(int n) {
        int ans = 0;
        int base = 5;

        while (n > 0) {
            int lastDigit = n & 1;
            n = n >> 1;
            ans += lastDigit * base;
            base *= 5;
        }
        return ans;
    }
    
}
