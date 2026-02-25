import java.util.Scanner;

public class nested_switch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int empID = in.nextInt();
        String departement = in.next();

        switch(empID){
            case 1:
            System.out.println("vishu");
            break;
             case 2:
                System.out.println("rtyui");
                break;
                 case 3:
                 System.out.println("emp number 3");

                 switch (departement) {
                    case "it" -> System.out.println("it departement");
                    case "hr" -> System.out.println("hr departement");
                    default -> System.out.println("nahi hai ");
                }
                 break;

                                default:
                                    System.out.println("enter correct emid");

                 }

                

            
        }




    }
    

