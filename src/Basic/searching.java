// RAMANUJAN mai kitne baar A repeat ho raha hau 
// target=3

// ab user se input bhi le or fir search kare
package Basic;

import java.util.Scanner;

public class searching{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string");
        String name= sc.nextLine();
        System.out.println("enter a char");
        char target= sc.next().charAt(0);
        int count =0;
        for(int i=0; i<name.length(); i++){
            
            if(name.charAt(i) == target){
                count++;
            }
        }
        int i=0;
        
        if(count == 0){
                System.out.println("bhag bsdk aise hi time waste kr raha hai");
            }
        System.out.println(count);



        
    }
}


// public class searching {
//     public static void main(String[] args) {
       
        
//         String name = "RAMANUJAN";
//         char target = 'A';
//         int count = 0;
//         for(int i=0; i<name.length(); i++){
            
//             if(name.charAt(i) == target){
//                 count++;
//             }
//         }
//         if(count == 0){
//             System.out.println("bhag bsdk aise hi time waste kr raha hai");
//         }

//         // System.out.println("count");
//         System.out.println(count);
//     }
    
// }




