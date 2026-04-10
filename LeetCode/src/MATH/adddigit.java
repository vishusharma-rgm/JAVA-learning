package MATH;

import java.util.Scanner;

class adddigit {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();

        Solution s = new Solution();

        int result = s.addDigits(num);

        System.out.println("Answer = " + result);

        sc.close();
    }
}

class Solution {

    public int addDigits(int num) {

        if(num == 0){
            return 0;
        }

        return 1 + (num - 1) % 9;
    }
}