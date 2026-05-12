// LC - 414 : https://leetcode.com/problems/third-maximum-number/

class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        if(n<3 || nums[0]==nums[n-1]) return nums[n-1];
        int max= nums[n-1];
        int c=1;
        for(int i=n-2; i>=0; i--){
            if(nums[i] != nums [i+1]){
                c++;
            }
            if(c==3){
                return nums[i];
            }
        }
        return max;
    }
}