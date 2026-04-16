package CheetSheet.Leetcode;
import java.util.Scanner;
public class DefangIPAddress_1108 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter an ip address:");
        String address = sc.nextLine();
        String result= address.replace(".","[.]");
        System.out.println(result);
        sc.close();

    }
    
}
