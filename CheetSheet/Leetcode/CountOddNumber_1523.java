package CheetSheet.Leetcode;

import java.util.Scanner;

public class CountOddNumber_1523 {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println(" enter low:");
        int n = Sc.nextInt();
        System.out.println(" enter high:");
        int m = Sc.nextInt();
        int count =0;

        for(int i =n; i<=m; i++){
            if(i%2!=0){
                count++;
            
            }else{
                continue;

            }
        }
        System.out.println(count);

        // Scanner sc = new Scanner(System.in);
        // System.out.println(" enter a number:");
        // int n = sc.nextInt();
        // int count = 0;
        // for(int i = 1; i<=n; i++){
        //     if(i%2!=0){
        //         count++;

        //     }else{
        //         continue;

        //     }
        // }
        // System.out.println(count);

    }
    
}
