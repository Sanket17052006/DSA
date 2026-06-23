// LC - 49 : https://leetcode.com/problems/group-anagrams/

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, ArrayList<String>> map = new HashMap<>();
        for(String s : strs){
            char[] ch = s.toCharArray();
            Arrays.sort(ch);
            String sb = new String(ch);
            map.computeIfAbsent(sb, x -> new ArrayList<>()).add(s);
        }
        return new ArrayList<>(map.values());
    }
}