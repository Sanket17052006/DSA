// LC - 2075 : https://leetcode.com/problems/decode-the-slanted-ciphertext/

class Solution {
    public String decodeCiphertext(String encodedText, int rows) {
        int l=encodedText.length();
        int columns=l/rows;
        char[][] matrix=new char[rows][columns];
        int k=0;
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                char ch=encodedText.charAt(k++);
                    matrix[i][j]=ch;
            }
        }
        StringBuilder s=new StringBuilder();
        for(int i=0;i<columns;i++){
            int r=0;
            int c=i;
            while(r<rows && c<columns){
                s.append(matrix[r++][c++]);
            }
        }
        int l1=s.length()-1;
        int t=l1;
        for(int i=l1;i>=0;i--){
            if(s.charAt(i)==' '){
                t--;
                continue;
            }
            break;
        }
        return s.substring(0,t+1);




        
    }
}