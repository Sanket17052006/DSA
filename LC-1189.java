// LC - 1189 : https://leetcode.com/problems/maximum-number-of-balloons/

class Solution {
    public int maxNumberOfBalloons(String text) {
        String word = "balloon";
        if(text.length() < word.length()) return 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0; i<text.length(); i++){
            map.put(text.charAt(i),map.getOrDefault(text.charAt(i),0) + 1);
        }
        int count=0;
        while(true){
            if(map.getOrDefault('b', 0) >= 1 && map.getOrDefault('a', 0) >= 1 && map.getOrDefault('l', 0) >= 2 && map.getOrDefault('o', 0) >= 2 && map.getOrDefault('n', 0) >= 1){
                map.put('b', map.get('b')-1);
                map.put('a', map.get('a')-1);
                map.put('l', map.get('l')-2);
                map.put('o', map.get('o')-2);
                map.put('n', map.get('n')-1);
                count++;
            } else {
                break;
            }
        }
        return count;
    }
}