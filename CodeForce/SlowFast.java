package CodeForce;

/*
========================================================================
  CODEFORCES JAVA TEMPLATE — VishuKush
  ------------------------------------------------------------------
  HOW TO USE:
  1. Har naye problem ke liye ye poora file copy karo.
  2. Apna logic sirf solve() method ke andar likho.
  3. Class ka naam hamesha "Main" hi rakhna — Codeforces isi naam se
     compile/run karta hai. (Codeforces pe file name Main.java hoga)
  4. Submit karte time Language: "Java 21" ya "Java 8" select karna
     (jo bhi CF pe available ho — Java 21 prefer karo).
========================================================================
*/

import java.io.*;
import java.util.*;

public class SlowFast {

    // ---------- FAST INPUT READER ----------
    // Scanner slow hota hai bade inputs ke liye (TLE de sakta hai).
    // Isliye BufferedReader + StringTokenizer use karo — bahut fast hai.
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    static String next() throws IOException {
        while (st == null || !st.hasMoreTokens()) {
            st = new StringTokenizer(br.readLine());
        }
        return st.nextToken();
    }

    static int nextInt() throws IOException {
        return Integer.parseInt(next());
    }

    static long nextLong() throws IOException {
        return Long.parseLong(next());
    }

    static double nextDouble() throws IOException {
        return Double.parseDouble(next());
    }

    static String nextLine() throws IOException {
        return br.readLine();
    }

    static int[] readIntArray(int n) throws IOException {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = nextInt();
        return arr;
    }

    static long[] readLongArray(int n) throws IOException {
        long[] arr = new long[n];
        for (int i = 0; i < n; i++) arr[i] = nextLong();
        return arr;
    }

    // ---------- FAST OUTPUT ----------
    // System.out.println baar-baar call karna bhi slow hota hai.
    // StringBuilder me sab jama karo, ek hi baar print karo.
    static StringBuilder sb = new StringBuilder();

    // ---------- MAIN ----------
    public static void main(String[] args) throws IOException {
        int t = 1;
        boolean multipleTestCases = false; // agar problem me "first line has t" likha ho to true kar do

        if (multipleTestCases) {
            t = nextInt();
        }

        while (t-- > 0) {
            solve();
        }

        System.out.print(sb);
    }

    // ==================== YAHAN APNA LOGIC LIKHO ====================
    static void solve() throws IOException {
        int n = nextInt();
        int[] a = readIntArray(n);

        // ---- example: array print kar rahe hain, isse replace kar dena ----
        for (int x : a) {
            sb.append(x).append(' ');
        }
        sb.append('\n');
    }
    // ==================================================================


    // ---------- COMMONLY USEFUL HELPERS (zaroorat pe use karo) ----------

    // GCD
    static long gcd(long a, long b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    // LCM
    static long lcm(long a, long b) {
        return a / gcd(a, b) * b;
    }

    // Fast power (mod)  ->  (base^exp) % mod
    static long power(long base, long exp, long mod) {
        long result = 1;
        base %= mod;
        while (exp > 0) {
            if ((exp & 1) == 1) result = (result * base) % mod;
            base = (base * base) % mod;
            exp >>= 1;
        }
        return result;
    }

    // Prime check (O(sqrt(n)))
    static boolean isPrime(long n) {
        if (n < 2) return false;
        for (long i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    // Sieve of Eratosthenes — primes up to n
    static boolean[] sieve(int n) {
        boolean[] isComposite = new boolean[n + 1];
        for (int i = 2; (long) i * i <= n; i++) {
            if (!isComposite[i]) {
                for (int j = i * i; j <= n; j += i) {
                    isComposite[j] = true;
                }
            }
        }
        return isComposite; // isComposite[x] == false matlab x prime hai
    }

    static final long MOD = 1_000_000_007L;
}

/*
========================================================================
  QUICK CHECKLIST — SUBMIT KARNE SE PEHLE
  ------------------------------------------------------------------
  [ ] Sample input/output khud test kiya (CF ka "Custom Invocation" use karo)
  [ ] Edge cases socha: n=1, empty array, sabse chhota/bada input
  [ ] long use kiya jahan overflow ho sakta hai (int max ~2*10^9)
  [ ] multipleTestCases sahi set kiya (true/false)
  [ ] Output format bilkul match karta hai (spaces, newlines)

  AGAR WRONG ANSWER / TLE AAYE:
  - WA  -> apna logic ek chhote hand-made example pe khud chalao
  - TLE -> Scanner to nahi use kar raha? Nested loop O(n^2) to nahi
           jab n bada hai? (n > 10^5 ho to O(n^2) risky hai)
  - RE  -> array index out of bounds check karo, n=0 case check karo
========================================================================
*/