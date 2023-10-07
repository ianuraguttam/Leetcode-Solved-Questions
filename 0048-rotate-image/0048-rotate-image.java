class Solution {
    public void rotate(int[][] matrix) {
        int[][] ans = new int[matrix.length][matrix.length];

        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[i].length; j++){
                ans[i][j] = matrix[i][j];
            }
        }

        int index1=0;
        int index2=0;
        for(int i=0; i<ans.length; i++){
            for(int j= ans.length-1; j>=0; j--){
                matrix[index1][index2++] = ans[j][i];
            }
            index1++;
            index2=0;
        }
    }
}