// This is a simple Java program that demonstrates the use of switch statements. It assigns a day number to the variable 'day' and uses a switch statement to determine the corresponding day name. The program then prints out the name of the day based on the value of 'day'. If the value of 'day' does not match any case, it defaults to "Invalid day".
package JavaDevelopment;

public class SwitchStatements {
    public static void main(String[] args) {
        int day = 3;
        String dayName;

        switch (day) {
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break; 
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
            case 7:
                dayName = "Sunday";
                break;
            default:
                dayName = "Invalid day";
        }

        System.out.println("The day is: " + dayName);
        
    }
    
}
