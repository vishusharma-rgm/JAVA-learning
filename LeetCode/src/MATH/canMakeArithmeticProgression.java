package MATH;

import java.util.Arrays;

public class canMakeArithmeticProgression {
    public static boolean canMakeAP(int[] arr) {
        Arrays.sort(arr);
        int diff = arr[1]- arr[0];
        for(int i =2; i<arr.length; i++){
            if(arr[i]-arr[i-1] != diff){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int arr[] ={1,4,2,5,2,7};
        System.out.println(canMakeAP(arr));
    }
    
}
