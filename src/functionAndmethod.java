import java.util.Scanner;

public class functionAndmethod{
    public static void main(String[] args) {
        
        // Q:1 -- take a input of 2 number and print sum
    
    //  Scanner in = new Scanner(System.in);
    
    // System.out.print("Enter first number: ");
    // int a = in.nextInt();

    // System.out.println("Enter Seocnd number:");
    // int b = in.nextInt();

    // int sum = a+b;
    // System.out.println("Sum is "+ sum);
    

    // now let's see if we do this 100 times, it will be a lot of code;

    sum();
    sum();
    sum();
    sum();

    }

    static void sum(){
        Scanner in = new Scanner(System.in);
         System.out.print("Enter first number: ");
    int a = in.nextInt(); 

    System.out.println("Enter Seocnd number:");
    int b = in.nextInt();

    int sum = a+b;
    System.out.println("Sum is "+ sum);
     }
 }
    

