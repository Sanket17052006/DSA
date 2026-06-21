// LC - 1833 : https://leetcode.com/problems/maximum-ice-cream-bars/

class Solution {
    public int maxIceCream(int[] costs, int coins) {
        int[] freq = new int[(int)(Math.pow(10,5)+1)];
        for(int i = 0; i < costs.length; i++){
            freq[costs[i]]++;
        }
        int max=0;
        for(int i = 0; i < freq.length; i++){
            if(coins < i) break;
            if(freq[i] == 0) continue;
            max += Math.min(freq[i], coins / i);
            coins -= (Math.min(freq[i], coins / i) * i);
        }
        return max;
    }
}