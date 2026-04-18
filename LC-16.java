// LC - 16 : https://leetcode.com/problems/3sum-closest/

class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int l=nums.length;
        int closest=Integer.MAX_VALUE;
        int ans=0;
        Arrays.sort(nums);
        for(int i=0;i<l-2;i++){
            int left=i+1;
            int right=l-1;
            while(left<right){
                int sum=nums[i]+nums[left]+nums[right];
                if(sum==target) return sum;
                else if(sum<target) {
                    if(Math.abs(sum-target)<closest){
                        ans=sum;
                        closest=Math.abs(sum-target);
                    }
                    left++;
                }
                else{
                    if(Math.abs(sum-target)<closest){
                        ans=sum;
                        closest=Math.abs(sum-target);
                    }
                    right--;
                }
            }
        }
        return ans;

        
    }
}