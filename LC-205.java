// LC - 205 : https://leetcode.com/problems/isomorphic-strings/

class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        HashMap<Character, Integer> map = new HashMap<>();
        HashMap<Character, Integer> map1 = new HashMap<>();
        
        for (int i = 0; i < s.length(); i++) {
            char charS = s.charAt(i);
            char charT = t.charAt(i);
            if (!map.getOrDefault(charS, -1).equals(map1.getOrDefault(charT, -1))) {
                return false;
            }
            map.put(charS, i);
            map1.put(charT, i);
        }
        
        return true;
    }
}
