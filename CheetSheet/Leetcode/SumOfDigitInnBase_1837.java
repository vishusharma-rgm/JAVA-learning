package CheetSheet.Leetcode;
import java.util.Scanner;
public class SumOfDigitInnBase_1837 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter a base:");
    int input= sc.nextInt();
    System.out.println("enter a base");
    int k = sc.nextInt();
    int n = input;
    // int n = 34;
    // int k= 6;
    int sum = 0;

    while(n>0){
        int digit= n%k;
        sum+=digit;
        n/=k;

    }
    System.out.println(sum);
}
}
