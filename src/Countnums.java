public class Countnums {
    public static void main(String[] args) {
        
        int n = 23456543;

        int count = 0;
        while(n>0){
            int rem = n%10;
            if(rem ==5){
                count+=1;

            }
            n = n/10;
        }
        System.out.println(count);

    }
    
}
