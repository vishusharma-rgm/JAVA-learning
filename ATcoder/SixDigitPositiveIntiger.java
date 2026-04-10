// Problem Statement
// You are given a 6-digit positive integer N
// Determine whether N satisfies all of the following conditions. 
// 1 appears exactly once.
// 2 appears exactly twice.
// 3 appears exactly three times.

package ATcoder;

import java.util.Scanner;

public class SixDigitPositiveIntiger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String strN = Integer.toString(N);
        
        int count1 = 0, count2 = 0, count3 = 0;
        
        for (char digit : strN.toCharArray()) {
            if (digit == '1') count1++;
            else if (digit == '2') count2++;
            else if (digit == '3') count3++;
        }
        
        if (count1 == 1 && count2 == 2 && count3 == 3) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    
    
}
