// LC - 36 : https://leetcode.com/problems/valid-sudoku/

class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<Character> set = new HashSet<>();
        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){
                if(board[i][j] != '.'){
                    if(!set.add(board[i][j])) return false;
                }
            }
            set.clear();
        }
        
        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){
                if(board[j][i] != '.'){
                    if(!set.add(board[j][i])) return false;
                }
            }
            set.clear();
        }
        for(int i=0; i<7; i+=3){
            for(int j=0; j<7; j+=3){
                set.clear();
                for(int row=i; row<i+3; row++){
                    for(int col=j; col<j+3; col++){
                        if(board[row][col] != '.'){
                            if(!set.add(board[row][col])) return false;
                }
            }
        }
            }
            
        }
        return true;
    }
}