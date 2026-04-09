package DSA;
import java.util.*;

class Solution {

    public int maxDistance(int[] position, int m) {

        Arrays.sort(position);

        int left = 1;
        int right = position[position.length-1] - position[0];

        int ans = 0;

        while(left <= right){

            int mid = left + (right-left)/2;

            if(canPlace(position, m, mid)){
                ans = mid;
                left = mid + 1; // try bigger distance
            }
            else{
                right = mid - 1;
            }
        }

        return ans;
    }

    private boolean canPlace(int[] pos, int balls, int dist){

        int count = 1;
        int last = pos[0];

        for(int i=1;i<pos.length;i++){

            if(pos[i] - last >= dist){

                count++;
                last = pos[i];
            }
        }

        return count >= balls;
    }
}