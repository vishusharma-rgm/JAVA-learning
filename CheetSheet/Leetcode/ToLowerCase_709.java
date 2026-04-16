package CheetSheet.Leetcode;

import java.util.Scanner;

public class ToLowerCase_709 {
    public static void main(String[] args) {
        // Method 1: Using built-in method
        String s = "Hello";
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch>='A' && ch<='Z'){
                sb.append((char)(ch+32));
            }else{
                sb.append(ch);
            }
        }
        System.out.println(sb.toString());

        
       // METHOD 2:
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter a string:");
        String input = sc.nextLine();
        String result= input.toLowerCase();
        System.out.println(result);
    }

    
}
