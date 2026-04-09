package Basic;

public class Palandrom {
    public static void main(String[] args) {
        String name = "MADAM";
        String rev = "";
        for(int i=name.length()-1; i>=0; i--){
            rev = rev + name.charAt(i);
        }
        if(name.equals(rev)){
            System.out.println("palandrom hai");
        }
        else{
            System.out.println("palandrom nahi hai");
        }
    }
    
}
