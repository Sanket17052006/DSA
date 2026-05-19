// LC - 2540 : https://leetcode.com/problems/minimum-common-value/

class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        int p1=0,p2=0;
        int l1=nums1.length;
        int l2=nums2.length;
        int ans=-1;
        while(p1<l1 && p2< l2){
            if(nums1[p1]==nums2[p2]){
                ans=nums1[p1];
                break;
            }
            else if(nums1[p1]<nums2[p2]){
                p1++;
            }
            else{
                p2++;
            }
        }
        return ans;
    }
}
