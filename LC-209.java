// LC - 209 : https://leetcode.com/problems/minimum-size-subarray-sum/

class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int l=nums.length;
        int ans=Integer.MAX_VALUE;
        int sum=0;
        int left=0;
        for(int i=0;i<l;i++){
            sum += nums[i];
            while(sum>=target){
                int currentLength=i-left+1;
                if(currentLength<ans) ans=currentLength;
                sum -= nums[left];
                left++;
            }
        }
        return ans==Integer.MAX_VALUE?0:ans;
    }
}