package CodeForce.Implementation;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MarisaSteals2228A {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        StringBuilder sb = new StringBuilder();
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            StringTokenizer st = new StringTokenizer(br.readLine());
            int c0 = 0, c1 = 0, c2 = 0;
            for (int i = 0; i < n; i++) {
                int w = Integer.parseInt(st.nextToken());
                if (w == 0) c0++;
                else if (w == 1) c1++;
                else c2++;
            }
            int ops = c0; // each 0 alone is a valid operation
            int pairs = Math.min(c1, c2);
            ops += pairs;
            c1 -= pairs;
            c2 -= pairs;
            // remaining c1 or c2 (only one is nonzero), group in triples
            ops += c1 / 3;
            ops += c2 / 3;
            sb.append(ops).append('\n');
        }
        System.out.print(sb);
    }
}
    