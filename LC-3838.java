// LC - 3838 : https://leetcode.com/problems/weighted-word-mapping/

class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        StringBuilder sb= new StringBuilder();
        HashMap<Character,Integer> map=new HashMap<>();
        int k=97;
        for(int i:weights){
            map.put((char)k++,i);
        }
        for(String s : words){
            int l=s.length();
            int sum=0;
            for(int i=0;i<l;i++){
                sum += map.get(s.charAt(i));
            }
            int mod=sum%26;
            sb.append((char)(122-mod));

        }
        return sb.toString();
    }
}