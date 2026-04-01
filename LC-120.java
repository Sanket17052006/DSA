// LC - 120 : https://leetcode.com/problems/triangle/description/

class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int l = triangle.size();
        int[] res = new int[l];
        for (int j = 0; j < l; j++) {
            res[j] = triangle.get(l - 1).get(j);}
        for (int i = l - 2; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                res[j]=triangle.get(i).get(j) + Math.min(res[j], res[j + 1]);
            }
        }

        return res[0];
    }
}