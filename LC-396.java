// LC - 396 : https://leetcode.com/problems/rotate-function/

class Solution {
    public int maxRotateFunction(int[] nums) {
        int n = nums.length;
        int sum = 0;
        int val = 0;
        for (int i = 0; i < n; i++){
            sum+=nums[i];
            val += i*nums[i];
        }
        int ans = val;
        for (int i = 1; i < n; i++){
            val = val + sum - n * nums[n - i];
            ans = Math.max(ans, val);
        }
        return ans;
    }
}
