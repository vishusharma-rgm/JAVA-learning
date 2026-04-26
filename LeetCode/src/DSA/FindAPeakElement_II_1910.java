package DSA;
class Solution {
    // 1910. Find a Peak Element II
    public int[] findPeakGrid(int[][] mat) {
        
        int m = mat.length;
        int n = mat[0].length;
        
        int low = 0;
        int high = n - 1;
        
        while(low <= high){
            
            int mid = (low + high)/2;
            
            // find max element row in mid column
            int maxRow = 0;
            
            for(int i = 0; i < m; i++){
                if(mat[i][mid] > mat[maxRow][mid]){
                    maxRow = i;
                }
            }
            
            int left = mid-1 >= 0 ? mat[maxRow][mid-1] : -1;
            int right = mid+1 < n ? mat[maxRow][mid+1] : -1;
            
            if(mat[maxRow][mid] > left && mat[maxRow][mid] > right){
                return new int[]{maxRow, mid};
            }
            
            else if(right > mat[maxRow][mid]){
                low = mid + 1;
            }
            
            else{
                high = mid - 1;
            }
        }
        
        return new int[]{-1,-1};
    }
}