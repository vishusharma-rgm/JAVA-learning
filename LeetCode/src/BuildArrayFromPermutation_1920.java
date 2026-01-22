import java.util.Arrays;

// https://leetcode.com/problems/build-array-from-permutation
class Solution {
    public int[] buildArray(int[] nums) {
        int [] t=new int[nums.length];

        for(int i=0;i<nums.length;i++)
        {
            t[i]=nums[nums[i]];
        }

        return t;
    }
}