package Basic;

import java.util.Scanner;

public class even_odd {
    public static void main(String[] args) {
        
    
    Scanner sc= new Scanner(System.in);
    int n = sc.nextInt();
    if(n<=3){
        System.out.println("mot possible");

    }
    else{
        for(int i =2; i<=n; i+=2){
            System.out.println(i+" ");

        }
        for(int i=1; i<=n; i+=2){
            System.out.println(i+" ");

            }
        }
    }

    }
    
    
    

