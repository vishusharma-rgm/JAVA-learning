// https://codeforces.com/problemset/problem/2230/A

package CodeForce.Implementation;

import java.io.*;
import java.util.StringTokenizer;

public class OptimalPurchase2230A {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int t = Integer.parseInt(br.readLine());
        while(t-->0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            long n = Long.parseLong(st.nextToken());
            long a = Long.parseLong(st.nextToken());
            long b = Long.parseLong(st.nextToken());

            long ans;
            if (b >= 3 * a) {
                // Buying only individual keys is always optimal.
                ans = n * a;
            } else {
                long groups = n / 3;
                long rem = n % 3;

                long option1 = groups * b + rem * a;
                long option2 = (rem == 0) ? option1 : (groups + 1) * b;

                ans = Math.min(option1, option2);
            }

            System.out.println(ans);
        }
    }
}

        
