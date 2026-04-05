// LC - 657 : https://leetcode.com/problems/robot-return-to-origin/

class Solution {
    public boolean judgeCircle(String moves) {
        // int l=moves.length();
        // int left=l-moves.replace("L","").length();
        // int right=l-moves.replace("R","").length();
        // int up=l-moves.replace("U","").length();
        // int down=l-moves.replace("D","").length();

        // return (left==right) && (up ==down);

        int upDown=0, rightLeft=0;
        for(char ch:moves.toCharArray()){
            if(ch=='U') upDown++;
            else if(ch=='D') upDown--;
            else if(ch=='R') rightLeft++;
            else rightLeft--;

        }

        return rightLeft==0 && upDown==0;

    }
}