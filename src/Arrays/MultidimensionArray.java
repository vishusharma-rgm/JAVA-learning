package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MultidimensionArray {
    /**
     * @param args
     */
    public static void main(String[] args) {
         /*
             1 2 3
             4 5 6
             7 8 9
        */
       Scanner in = new Scanner(System.in);

    //    int[][] arr = new int[3][];
       
    //    int[][] arr = {
    //     {1,2,3},
    //     {4,5,6},
    //     {6,7,8},

    //    };
       int[][] arr = new int[3][3];
        System.out.println(arr.length); // no of ro

        for( int row=0 ; row<arr.length; row++){
              for( int col=0 ; col<arr.length; col++){
                arr[row][col] = in.nextInt();
                 System.out.print(arr[row][col] + " ");

        }
        System.out.println();

        for(int[] a : arr) {
            System.out.println(Arrays.toString(a));
        }


    }
    
}
}