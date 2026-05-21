// LC - 3043 : https://leetcode.com/problems/find-the-length-of-the-longest-common-prefix/

class Solution {
    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        Set<Integer> s=new HashSet<>();
        for(int i : arr1){
            while(i>0){
                s.add(i);
                i/=10;
            }
        }
        int ans=0;
        for(int i : arr2){
            while(i>0){
            if(s.contains(i) && i>0){
                ans=Math.max(ans ,(int)Math.log10(i)+1);
                break;
            }
            i/=10;
            }
        }
        return ans;
        
    }
}