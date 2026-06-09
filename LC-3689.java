// LC - 3689 : https://leetcode.com/problems/maximum-total-subarray-value-i/

class Solution {
    public long maxTotalValue(int[] nums, int k) {
        long max=Long.MIN_VALUE;
        long min=Long.MAX_VALUE;
        for(int i : nums){
            if(i<min) min=i;
            if(i>max) max=i;
        }
        return (max-min)*k;
    } 
}