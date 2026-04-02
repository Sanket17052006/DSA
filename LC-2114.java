// LC - 2114 : https://leetcode.com/problems/maximum-number-of-words-found-in-sentences/

class Solution {
    public int mostWordsFound(String[] sentences) {
        int max=0;
        for(String ch:sentences){
            String[] temp= ch.split(" ");
            if(temp.length>max){
                max=temp.length;
            }

        }
        return max;
        
    }
}