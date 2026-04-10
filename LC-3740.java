// LC -3740 - https://leetcode.com/problems/minimum-distance-between-three-equal-elements-i/

class Solution {
    public int minimumDistance(int[] nums) {
        int n = nums.length ;
        if (n <= 2) return -1 ;
        int res = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++)
            for (int j = i+1; j < n; j++)
                if (nums[i] == nums[j])
                    for (int k = j+1; k < n; k++)
                        if (nums[j] == nums[k])
                            res =Math.min(res, 2*(k-i)) ;
        if(res != Integer.MAX_VALUE) return res;
        return -1;
    }
}