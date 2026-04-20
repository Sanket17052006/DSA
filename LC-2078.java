// LC - 2078 : https://leetcode.com/problems/two-furthest-houses-with-different-colors/

class Solution {
    public int maxDistance(int[] colors) {
        int ans=0;
        for(int i=0;i<colors.length-1;i++){

        int left=i,right=colors.length-1;
        while(left<right){
            if(colors[left] != colors[right]){
                int res=Math.abs(left-right);
                ans=Math.max(res,ans);
            }

            right--;
        }
        }
        return ans;
        
    }
}