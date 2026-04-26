package DSA;
import java.util.*;
// https://leetcode.com/problems/create-target-array-in-the-given-order/submissions/1957045658
// 1389. Create Target Array in the Given Order
class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            list.add(index[i], nums[i]);
        }

        // Convert List<Integer> to int[]
        int[] target = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            target[i] = list.get(i);
        }

        return target;
    }
}
