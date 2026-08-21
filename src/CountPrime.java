// Given an integer n, return the number of prime numbers that are strictly less than n.
public class CountPrime {
    
    public static void main(String[] args) {
        int n = 10;
        int ans = countPrimes(n);
        System.out.println(ans);
    }

    static int countPrimes(int n) {
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (isPrime(i)) {
                count++;
            }
        }
        return count;
    }

    static boolean isPrime(int n) {
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    
}
