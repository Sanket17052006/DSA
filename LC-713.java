// LC - 713 : https://leetcode.com/problems/subarray-product-less-than-k/

class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if(k<=1) return 0;
        int count=0,left=0;
        int l=nums.length;
        int product=1;
        for(int right=0;right<l;right++){
            product *= nums[right];

            while(product>=k){
                product /= nums[left++];
            }
            count += right-left+1;
        
        }
        return count;
    }
}