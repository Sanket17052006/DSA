// LC - 1752 : https://leetcode.com/problems/check-if-array-is-sorted-and-rotated/

class Solution {
    public boolean check(int[] nums) {
        int c=1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>nums[(i+1)%nums.length]){
                if (c==2) return false;
                c++;
                
            }
        }
        return true;
    }
}