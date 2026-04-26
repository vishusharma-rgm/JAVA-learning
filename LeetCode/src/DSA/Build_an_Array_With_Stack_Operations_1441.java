package DSA;
import java.util.List;
import java.util.ArrayList;
// 1441. Build an Array With Stack Operations
class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> result = new ArrayList<>();

        int j = 0; // pointer for target

        for (int i = 1; i <= n && j < target.length; i++) {
            result.add("Push");

            if (i == target[j]) {
                j++;
            } else {
                result.add("Pop");
            }
        }

        return result;
    }
}