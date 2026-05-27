// LC - 3121 : https://leetcode.com/problems/count-the-number-of-special-characters-ii/

class Solution {
    public int numberOfSpecialChars(String word) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<word.length();i++){
            int ch=(int)word.charAt(i);
            if(!(Character.isUpperCase(ch) && !map.containsKey(ch))){
                map.put(ch,i);
            }
        }
        int count=0;
        for(int i:map.keySet()){
            if(i>90 && map.containsKey(i+32) && map.get(i) < map.get(i+32)){
                count++;
            }
        }
        return count;
    }
}