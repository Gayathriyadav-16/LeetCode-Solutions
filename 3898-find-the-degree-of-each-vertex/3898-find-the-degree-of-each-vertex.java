class Solution {
    public int[] findDegrees(int[][] matrix) {
        int n = matrix.length;
        int ans[] = new int[n];
        for(int i=0;i<n;i++){
            int cn=0;
            for(int j=0;j<n;j++){
                if(matrix[i][j] == 1)
                   cn++;
            }
            ans[i] = cn;
        }
        return ans;
        
    }
}