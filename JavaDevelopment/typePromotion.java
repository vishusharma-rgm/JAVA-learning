package JavaDevelopment;

public class typePromotion {
    public static void main(String[] args) {
        
    
    byte a = 10;
    byte b = 30;
    // byte c = a + b; --- IGNORE ---
    // byte c = (byte) (a + b); --- IGNORE ---
    int c = a * b;
    // int c = (int) (a * b); --- IGNORE ---

    System.out.println(c);
     


    }
}
