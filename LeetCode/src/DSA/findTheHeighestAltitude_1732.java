package DSA;
class Solution {
    // 1732. Find the Highest Altitude
    public int largestAltitude(int[] gain) {
        int currentAltitude= 0;
        int maxAltitude=0;
        for(int i=0; i<gain.length; i++){
            currentAltitude= currentAltitude+gain[i];
            if(currentAltitude>maxAltitude){
                maxAltitude=currentAltitude;

            }
        }
        return maxAltitude;
    }
}