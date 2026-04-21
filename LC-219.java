// LC - 219 : https://leetcode.com/problems/contains-duplicate-ii/

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int left=0,right=nums.length;
        while(left<right){
            if(Math.abs(left-right)<k){
                right--;
                continue;
            }
            if(nums[left]==nums[right]){
                return true;
            }
            else{

            }
            
        }
        return false;

        
    }
}