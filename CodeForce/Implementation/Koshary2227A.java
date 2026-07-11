package CodeForce.Implementation;

import java.util.StringTokenizer;

public class Koshary2227A {
    public static void main(String[] args) throws Exception {
        java.io.BufferedReader br = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        StringBuilder sb = new StringBuilder();
        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            if (x % 2 == 1 && y % 2 == 1) sb.append("NO\n");
            else sb.append("YES\n");
        }
        System.out.print(sb);
    }
}