// LC - 3898 : https://leetcode.com/problems/find-the-degree-of-each-vertex/

class Solution {
    public int[] findDegrees(int[][] matrix) {
        int n=matrix.length;
        int[] ans= new int[n];
        Arrays.fill(ans,0);
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]==1){
                    ans[i]++;
                }
            }

        }
        return ans;
    }
}