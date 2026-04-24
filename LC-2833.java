// LC - 2833 : https://leetcode.com/problems/furthest-point-from-origin/description/

class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        // int lCount=(int)moves.chars().filter(ch -> ch=='L').count();
        // int rCount=(int)moves.chars().filter(ch -> ch=='R').count();
        // int blankCount=(int)moves.chars().filter(ch -> ch=='_').count();
        // if(lCount>rCount) return lCount+blankCount-rCount;
        // else if(lCount<rCount) return rCount+blankCount-lCount;
        
        // return blankCount;
        int ans=0;
        int l=moves.length();
        int rCount=0,lCount=0,bCount=0;
        for(int i=0;i<l;i++){
            if(moves.charAt(i)=='L') lCount++;
            else if(moves.charAt(i)=='R') rCount++;
            else bCount++;
        }
        if(lCount>rCount){
            ans=lCount+bCount-rCount;
        }
        else if(lCount<rCount){
            ans=rCount+bCount-lCount;
        }
        else ans=bCount;

        return ans;
    }
}