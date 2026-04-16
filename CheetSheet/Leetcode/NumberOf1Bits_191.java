package CheetSheet.Leetcode;
import java.util.Scanner;
public class NumberOf1Bits_191 {
    public static void main(String[] args) {
        
    
    Scanner sc = new Scanner (System.in);
    System.out.println("enter a number");
    int n = sc.nextInt();
    int count =0;
    while(n!=0){
        if(n%2==1){
            count++;
        }
        n=n/2;
    }
    System.out.println(count);

    
}


    
}
