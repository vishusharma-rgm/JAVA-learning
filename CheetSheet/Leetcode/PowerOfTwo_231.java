package CheetSheet.Leetcode;

import java.util.Scanner;

public class PowerOfTwo_231 {
    public static void main(String[] args) {

        // Method 1: Using Bit Manipulation

        int n = 16;
        boolean isPowerOfTwo = (n > 0) && ((n & (n - 1)) == 0);
        System.out.println(isPowerOfTwo);

        // Method 2: Using Loop

        int n = 36;
        if(n<=0){
            System.out.println(false);
            return;
        }

            while(n%2==0){
                n=n/2;
            
            
        }
        System.out.println(n==1);

        // Method 3: Using Logarithm

        Scanner sc = new Scanner(System.in);
        System.out.println(" enter a number:");
        int n = sc.nextInt();

        if(n<=0){
            System.out.println(false);

            
        }else if((n&(n-1))==0){
            System.out.println(true);
        }else{
            System.out.println("not power of 2");
        }
        sc.close();

        // Method 4: Using Bit Manipulation and Loop---Also to find the power of 2
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = sc.nextInt();

        if(n <= 0){
            System.out.println("Not power of 2");
            return;
        }

        if((n & (n-1)) == 0){

            int power = 0;

            int temp = n;

            while(temp > 1){
                temp = temp / 2;
                power++;
            }

            System.out.println(n + " = 2^" + power);
        }
        else{
            System.out.println("Not power of 2");
        }

        sc.close();
    }


    
}
