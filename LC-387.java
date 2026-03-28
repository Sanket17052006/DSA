// LC - 387 : https://leetcode.com/problems/first-unique-character-in-a-string/

class Solution {
    public int firstUniqChar(String s) {
        int l=s.length();
        int l1[]= new int[26];
        for(char ch: s.toCharArray()){
            l1[ch-'a']++;
        }
        for(int i=0;i<l;i++){
            if(l1[s.charAt(i)-'a']==1){
                return i;
            }
        }
        return -1;
    }
}