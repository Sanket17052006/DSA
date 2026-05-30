// LC - 200 : https://leetcode.com/problems/number-of-islands/

class Solution {
    public int numIslands(char[][] grid) {
        int count=0;
        int n=grid.length;
        int m=grid[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]=='1'){
                    dfs(grid, i ,j);
                    count++;
                }
            }
        }
        return count;
    }
    private void dfs(char[][] grid, int n, int m){
        if( n<0 || m<0 || n>=grid.length || m>=grid[0].length || grid[n][m]=='0' ) return;
        grid[n][m]='0';
        dfs(grid, n+1, m);
        dfs(grid, n-1, m);
        dfs(grid, n, m+1);
        dfs(grid, n, m-1);
    }
}