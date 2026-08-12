// package JavaDevelopment;

// public class Computer {

//     public void PlayMusic(){
//         System.out.println("music playing");
//     }

//     public String getMeApen(int cost ){
//         if(cost>=10)
//             return "pen";
    
//     return "nothing";
// }

//     }
    
//     public class Demo {
//         public static void main(String [] a[])
//     {
//         Computer c = new Computer


//         }
//     }

package JavaDevelopment;

public class Computer {

    public void PlayMusic() {
        System.out.println("music playing");
    }

    public String getMeApen(int cost) {
        if (cost >= 10)
            return "pen";

        return "nothing";
    }

    public static void main(String[] args) {
        Computer obj = new Computer();

        obj.PlayMusic();
        String str = obj.getMeApen(5);
        System.out.println(str);
        
    }
}