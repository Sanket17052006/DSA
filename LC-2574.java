// LC - 2574 : https://leetcode.com/problems/left-and-right-sum-differences/

class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n= nums.length;
        int[] ans= new int[n];
        Arrays.fill(ans,0);
        int sum=0;
        for(int i=0; i<n; i++){
            ans[i]=sum;
            sum+=nums[i];
        }
        sum=0;
        for(int i=n-1; i>-1; i--){
            ans[i]=Math.abs(ans[i]-sum);
            sum+=nums[i];
        }
        return ans;
        
    }
}