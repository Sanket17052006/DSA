// LC - 2161 : https://leetcode.com/problems/partition-array-according-to-given-pivot/

class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int left=0,r=0,equal=0;
        for(int i:nums){
            if(i<pivot) left++;
            else if(i>pivot) r++;
            else equal++;
        }
        int[] lower = new int[left];
        int[] greater = new int[r];
        int[] eq = new int[equal];
        int k=0,l=0,m=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<pivot){
                lower[k++]=i;
            }
            else if(nums[i]>pivot){
                greater[l++]=i;
            }
            else{
                eq[m++]=i;
            }
        }
        int[] ans = new int[nums.length];
        int t=0;
        for(int i:lower){
            ans[t++]=nums[i];
        }
        for(int i:eq){
            ans[t++]=nums[i];
        }
        for(int i:greater){
            ans[t++]=nums[i];
        }
        return ans;
    }
}