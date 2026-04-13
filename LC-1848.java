// LC - 1848 : https://leetcode.com/problems/minimum-distance-to-the-target-element/

class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
        int n=nums.length;
        int min=0;
        int flag=0;
        for(int i=0;i<n;i++){
            if(nums[i]==target){
                if(flag==0){
                    min=Math.abs(i-start); 
                    flag++;
                }
                else  min=Math.min(min,Math.abs(i-start));
            }

        }
        return min;

        
    }
}