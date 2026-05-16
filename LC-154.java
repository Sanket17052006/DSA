// LC - 154 : https://leetcode.com/problems/find-minimum-in-rotated-sorted-array-ii/

class Solution {
    public int findMin(int[] nums) {
        return min(nums);
        
    }
    private int min(int[] nums){
        int left=0,right=nums.length-1;
        
        int ans=Integer.MAX_VALUE;
        while(left<right){
            int mid=left+(right-left)/2;
            ans=Math.min(ans,nums[mid]);
            if(nums[mid]>nums[right]){
                left=mid+1;
            }
            else if(nums[mid]<nums[right]){
                right=mid;
            }
            else{
                ans = Math.min(ans, nums[right]);
                right--;
            }
        }
        return Math.min(ans,nums[left]);
    }
}