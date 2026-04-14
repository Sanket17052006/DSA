// LC -3 : https://leetcode.com/problems/longest-substring-without-repeating-characters/

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        int max=0;
        int left=0,right=0;
        HashSet<Character> set=new HashSet<>();
        for(;right<n;right++){
            char ch=s.charAt(right);
            while(set.contains(ch)){
                set.remove(s.charAt(left++));
            }

            set.add(ch);
            max=Math.max(max,set.size());

                
            }


        
        return max;
        
    }
}