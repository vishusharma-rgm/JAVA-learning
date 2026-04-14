package CheetSheet.Leetcode;

import java.util.Scanner;

public class PalamdromeNumber_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value: ");
        String input = sc.nextLine();

        String reverse = "";

        for(int i = input.length()-1; i >= 0; i--){
            reverse = reverse + input.charAt(i);
        }

        if(input.equalsIgnoreCase(reverse))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");

        sc.close();
    }
    
}
