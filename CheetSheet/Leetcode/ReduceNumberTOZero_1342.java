package CheetSheet.Leetcode;

import java.util.Scanner;

public class ReduceNumberTOZero_1342 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter a number:");
        int n = sc.nextInt();
        int count =0;
          
        while(n>0){
            if(n%2==0){
                n=n/2;
                count++;

            }else{
                n=n-1;
                count++;
                
            }

        }
        System.out.println(count);
    }

    
}
