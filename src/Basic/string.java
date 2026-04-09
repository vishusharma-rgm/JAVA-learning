// pata karna hai "my name is vishu " mai kitne character hai
package Basic;

public class string {
    public static void main(String[] args) {
        String name = "my name is vishu";
        int count = 0;
        for(int i=0; i<name.length(); i++){
            if(name.charAt(i) != ' '){
                count++;
            }

        
    }
    System.out.println("isme hai : " + count);    
}
}