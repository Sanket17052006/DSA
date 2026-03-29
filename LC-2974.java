// LC - 2974 : https://leetcode.com/problems/minimum-number-game/description/

class Solution {
    public int[] numberGame(int[] nums) {
        Arrays.sort(nums);
        int l=nums.length;
        // O(n) - space complexity
        // int[] result= new int[l];
        // for(int i=0;i<l;i+=2){
        //     result[i]=nums[i+1];
        //     result[i+1]=nums[i];
        // }
        // return result;

        //O(1) - space
        for(int i=0;i<l;i+=2){
            int t=nums[i];
            nums[i]=nums[i+1];
            nums[i+1]=t;
        }
        return nums;
        
    }
}