// LC - 1855 : https://leetcode.com/problems/maximum-distance-between-a-pair-of-values/description/

class Solution {
    public int maxDistance(int[] nums1, int[] nums2) {
        int n1=nums1.length,n2=nums2.length;
        int max=0;
        int left=0,right=0;
        while(left<n1 && right<n2){
            if(nums1[left]<=nums2[right]){
                max=Math.max(max,right-left);
                right++;
            }
            else{
                left++;
            }

        }
        return max;
        
    }
}