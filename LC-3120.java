// LC - 3120 : https://leetcode.com/problems/count-the-number-of-special-characters-i/

class Solution {
    public int numberOfSpecialChars(String word) {
        HashSet<Integer> set=new HashSet<>();
        int n=word.length();
        for(int i=0;i<n;i++){
            char ch=word.charAt(i);
            if(Character.isLowerCase(ch)){
                set.add((int)ch);
            }
        }
        int count=0;
        HashSet<Character> visited = new HashSet<>();
        for(int i=0;i<n;i++){
            char ch=word.charAt(i);
            if(Character.isUpperCase(ch) && set.contains((int) ch + 32) && !visited.contains(ch)){
                count++;
                visited.add(ch);
            }
        }
        return count;
    }
}