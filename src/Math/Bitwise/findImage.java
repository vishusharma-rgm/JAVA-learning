package Math.Bitwise;

public class findImage {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(findImage(n));
    }

    static int findImage(int n) {
        return ~n;
    }
    
}
