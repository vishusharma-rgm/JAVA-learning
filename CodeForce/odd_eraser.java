package CodeForce;

public class odd_eraser {
    public static void main(String[] args) {
        int n = 5;
        int[] arr = {1, 2, 3, 4, 5};
        int oddCount = 0;
        int evenCount = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        if (oddCount == 1) {
            for (int i = 0; i < n; i++) {
                if (arr[i] % 2 != 0) {
                    System.out.println(i + 1); // Output the position of the odd number
                    break;
                }
            }
        } else if (evenCount == 1) {
            for (int i = 0; i < n; i++) {
                if (arr[i] % 2 == 0) {
                    System.out.println(i + 1); // Output the position of the even number
                    break;
                }
            }
        }
    }
    
}
