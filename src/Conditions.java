public class Conditions {

    public static void main(String[] args) {
     /*   int salary = 25000;
        if(salary> 1000){
            salary =salary+2000;

        }else{
            salary= salary+1000;

        }
            */

        // multiple if-else
            int salary = 2000;
        if(salary>3000){
            salary+=1000;

        }else if(salary>1000){
            salary+=2000;

        }else{
            salary+=3000;

        }
        System.out.println(salary);
    }
}
