// LC - 11 : https://leetcode.com/problems/container-with-most-water/

class Solution {
    public int maxArea(int[] height) {
        int ans=0;
        int left=0,right=height.length-1;
        while(left<right){
            int width=right-left;
            int h=Math.min(height[right],height[left]);
            int area=width*h;
            ans=Math.max(area,ans);
            if(height[right]<height[left]) right--;
            else left++;
        }
        return ans;
        
    }
}