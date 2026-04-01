class Solution {

    public int minDays(int[] bloomDay, int m, int k) {

        if((long)m * k > bloomDay.length) return -1;

        int left = Integer.MAX_VALUE;
        int right = Integer.MIN_VALUE;

        for(int d : bloomDay){
            left = Math.min(left, d);
            right = Math.max(right, d);
        }

        int ans = -1;

        while(left <= right){

            int mid = left + (right-left)/2;

            if(canMake(bloomDay, m, k, mid)){
                ans = mid;
                right = mid - 1;
            }
            else{
                left = mid + 1;
            }
        }

        return ans;
    }

    private boolean canMake(int[] arr, int m, int k, int day){

        int flowers = 0;
        int bouquet = 0;

        for(int d : arr){

            if(d <= day){
                flowers++;

                if(flowers == k){
                    bouquet++;
                    flowers = 0;
                }
            }
            else{
                flowers = 0;
            }
        }

        return bouquet >= m;
    }
}