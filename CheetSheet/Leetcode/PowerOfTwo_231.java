package CheetSheet.Leetcode;

import java.util.Scanner;

public class PowerOfTwo_231 {
    public static void main(String[] args) {

        // Method 1: Using Bit Manipulation

        int n = 16;
        boolean isPowerOfTwo = (n > 0) && ((n & (n - 1)) == 0);
        System.out.println(isPowerOfTwo);








        // Method 2: Using Loop

        int a = 36;
        if(a<=0){
            System.out.println(false);
            return;
        }

            while(a%2==0){
                a=a/2;
            
            
        }
        System.out.println(a==1);





        

        // Method 3: Using Logarithm

        Scanner sc = new Scanner(System.in);
        System.out.println(" enter a number:");
        int b = sc.nextInt();

        if(b<=0){
            System.out.println(false);

            
        }else if((b&(b-1))==0){
            System.out.println(true);
        }else{
            System.out.println("not power of 2");
        }
        sc.close();







        // Method 4: Using Bit Manipulation and Loop---Also to find the power of 2
        
        Scanner dc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int c = dc.nextInt();

        if(c <= 0){
            System.out.println("Not power of 2");
            return;
        }

        if((c & (c-1)) == 0){

            int power = 0;

            int temp = c;

            while(temp > 1){
                temp = temp / 2;
                power++;
            }

            System.out.println(c + " = 2^" + power);
        }
        else{
            System.out.println("Not power of 2");
        }

        sc.close();
    }


    
}
