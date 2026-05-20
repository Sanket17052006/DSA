// LC - 2657 : https://leetcode.com/problems/find-the-prefix-common-array-of-two-arrays/

class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int n = A.length;
        int[] ans = new int[n];
        HashSet<Integer> set=new HashSet<>();
        for(int i = 0 ; i<n ; i++){
            set.add(B[i]);
            int t=i;
            int c=0;
            for(int j=0;j<=i;j++){
                if(set.contains(A[j])){
                    c++;
                }
            }
            ans[i]=c;
        }
        return ans;
    }
}