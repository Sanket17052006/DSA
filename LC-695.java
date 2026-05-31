//  LC - 695 : https://leetcode.com/problems/max-area-of-island/

class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int max=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1){
                    int count=dfs(grid,i,j);
                    max=Math.max(max,count);
                }
            }
        }
        return max;
    }
    private int dfs(int[][] grid, int i, int j){
        if(i<0||j<0||i>=grid.length||j>=grid[0].length) return 0;
        int count=0;
        if(grid[i][j]==1){
            count=1;
            grid[i][j]=0;
            count += dfs(grid, i+1, j);
            count += dfs(grid, i-1, j);
            count += dfs(grid, i, j+1);
            count += dfs(grid, i, j-1);
        }
        return count;
    }
}