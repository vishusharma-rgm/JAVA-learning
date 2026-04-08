package Basic;

import java.util.Scanner;

public class TakingInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int a = sc.nextInt();
        System.out.println("enter another number");
        int b = sc.nextInt();
        int sum = a+b;
        System.out.println(" the sum is "+sum);
        

    }
    
}
