
class Solution {

    public int smallestDivisor(int[] nums, int threshold) {

        int left = 1;
        int right = 0;

        for(int n : nums){
            right = Math.max(right, n);
        }

        int ans = right;

        while(left <= right){

            int mid = left + (right-left)/2;

            int sum = 0;

            for(int n : nums){
                sum += (n + mid - 1) / mid; 
                // ceil(n/mid)
            }

            if(sum <= threshold){
                ans = mid;
                right = mid - 1;
            }
            else{
                left = mid + 1;
            }
        }

        return ans;
    }
}