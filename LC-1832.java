// LC -1832 : https://leetcode.com/problems/check-if-the-sentence-is-pangram/

class Solution {
    public boolean checkIfPangram(String sentence) {
        for(char ch='a';ch<='z';ch++){
            if(!sentence.contains(String.valueOf(ch))) return false;
        }
        return true;
        // Set<Integer> set=new HashSet<Integer>();
        // for(int i=0;i<sentence.length();i++){
        //     set.add('a'-sentence.charAt(i));
        // }
        // return set.size()==26?true:false;
    }
}