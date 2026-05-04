// LC - 48 : https://leetcode.com/problems/rotate-image/

class Solution {
    public void rotate(int[][] matrix) {
        int l=matrix.length;
        for(int i=0;i<l;i++){
            for(int j=i+1;j<l;j++){
                int t=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=t;
            }
        }
        for(int i=0;i<l;i++){
            int start=0,end=l-1;
            while(start<end){
                int t=matrix[i][start];
                matrix[i][start]=matrix[i][end];
                matrix[i][end]=t;
                start++;
                end--;
            }
        }
        return;

    }
}