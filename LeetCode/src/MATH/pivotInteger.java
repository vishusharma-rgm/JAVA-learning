package MATH;

public class pivotInteger {
    
    public static int pivotInteger(int n) {
        int totalSum = (n * (n + 1)) / 2; // Calculate the total sum of integers from 1 to n
        int leftSum = 0;

        for (int i = 1; i <= n; i++) {
            leftSum += i; // Update the left sum

            if (leftSum == totalSum - leftSum) {
                return i; // Found the pivot integer
            }
        }

        return -1; // No pivot integer found
    }

    public static void main(String[] args) {
        int n = 8;
        int pivot = pivotInteger(n);
        System.out.println("Pivot Integer: " + pivot);
    }
    
}
