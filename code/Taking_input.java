import java.util.Scanner;

public class Taking_input {

    public static void main(String[] args) {
        System.out.println("taking input from user");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number 1");
        int a = sc.nextInt();
        System.out.println("enter number 2");
        float b = sc.nextFloat();
        System.out.println("enter number 3 ");
        int c = sc.nextInt();

        int sum = a + c;
        float sum1 = b + c;
        boolean b1 = sc.hasNextBoolean();
        String str = sc.nextLine();

        System.out.println("the sum of these number is ");
        System.out.println(sum1);
        System.out.println(sum);
        System.out.println(b1);
        System.out.println(str);




    }
}
