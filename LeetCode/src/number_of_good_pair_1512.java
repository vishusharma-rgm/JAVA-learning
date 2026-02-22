// class Solution {
//     public int numIdenticalPairs(int[] nums) {
//         HashMap<Integer, Integer> map = new HashMap<>();
//         int count = 0;

//         for (int num : nums) {
//             int freq = map.getOrDefault(num, 0);
//             count += freq;   // existing same numbers form pairs
//             map.put(num, freq + 1);
//         }

//         return count;
//     }
// }
class Solution {
    public int numIdenticalPairs(int[] nums) {
        int[] freq = new int[101];   // because 1 <= nums[i] <= 100
        int count = 0;

        for (int num : nums) {
            count += freq[num];   // existing same numbers form pairs
            freq[num]++;
        }

        return count;
    }
}