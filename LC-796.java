// LC - 796 : https://leetcode.com/problems/rotate-string/

class Solution {
    public boolean rotateString(String s, String goal) {
        int l=s.length();
        int l1=goal.length();
        if(l!=l1) return false;
        for(int i=0;i<l;i++){
            String temp= s.substring(i,l)+s.substring(0,i);
            if(temp.equals(goal)) return true;
        }
        return false;
    }
}