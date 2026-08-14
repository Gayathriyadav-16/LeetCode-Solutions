class Solution {
    public void setZeroes(int[][] matrix) {
        boolean[] ar = new boolean[matrix.length];
        boolean[] br = new boolean[matrix[0].length];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j] == 0){
                    ar[i] = true;
                    br[j] = true;
                }
            }
        }
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(ar[i] || br[j]){
                    matrix[i][j] = 0;
                }
            }
        }
    }
}