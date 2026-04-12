// LC - 643 : https://leetcode.com/problems/maximum-average-subarray-i/

class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double sum=0;
        for(int i=0;i<k;i++){
            sum += nums[i];
        }
        double max=sum/k;
        int left=0;
        for(int i=k;i<nums.length;i++){
            sum += nums[i];
            sum -= nums[left++];
            max=Math.max(sum/k,max);
        }
        return max;
        
    }
}