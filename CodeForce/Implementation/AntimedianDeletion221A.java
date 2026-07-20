// https://codeforces.com/problemset/problem/2211/A

package CodeForce.Implementation;

import java.io.*;

public class AntimedianDeletion221A {
    
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder ans = new StringBuilder();

        while(t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            String[] arr = br.readLine().split(" ");;
            
            
            if(n == 1) {
                ans.append(1);
                ans.append("\n");
            } else { 
                for(int i = 1; i <= n; i++) {
                    ans.append(2);
                    if(i < n) ans.append(" ");
                }
                ans.append("\n");
            }
        }

        System.out.println(ans);
    }
}
    

