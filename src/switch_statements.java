import java.util.Scanner;

public class switch_statements {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String fruit = in.next();

        switch (fruit) {
            case "apple" -> System.out.println("Apple is red");
            case "banana" -> System.out.println("Banana is yellow");
            case "grape" -> System.out.println("Grape is purple");
            case "orange" -> System.out.println("Orange is orange");
            case "kiwi"-> System.out.println("kiwi is green");
            default -> System.out.println("Unknown fruit");
        }


    }
    
}
