package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // array of primitive 
        int[] arr= new int[5];
        arr[0] = 11;
        arr[1] = 41;
        arr[2] = 76;
        arr[3] = 21;
        arr[4] = 25;

        System.out.println(arr[3]);


        //  input using for loop

        for(int i = 0; i<arr.length ; i+=1 ){
            arr[i]= in.nextInt();
        
           
            System.out.print(arr[i] + " ");
        }
        
        // array of objects
        String[] str = new String[4];
        for (int i = 0; i < str.length; i++) {
            str[i] = in.next();
        }

        System.out.println(Arrays.toString(str));

          // modify
        str[1] = "vishu";

        System.out.println(Arrays.toString(str));

            

        }


        
    }
    

