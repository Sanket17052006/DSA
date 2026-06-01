// LC - 2144 : https://leetcode.com/problems/minimum-cost-of-buying-candies-with-discount/

class Solution {
    public int minimumCost(int[] cost) {
        int n = cost.length;
        if(n < 2) return cost[0];
        int ans=0;
        Arrays.sort(cost);
        if(n == 2) return cost[0]+cost[1];
        
        for(int i=n-1; i>=0; i--){
            int c=2;
            while(c-- != 0 && i>=0){
                ans += cost[i--];
            }
        }
        return ans;
    }
}