// LC - 2553 : https://leetcode.com/problems/separate-the-digits-in-an-array/

class Solution {
    public int[] separateDigits(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        
        for (int i = nums.length - 1; i >= 0; i--) {
            int val = nums[i];
            while (val > 0) {
                ans.add(val % 10);
                val /= 10;
            }
        }
        
        int[] arr = new int[ans.size()];
        for (int i = 0; i < ans.size(); i++) {
            arr[i] = ans.get(ans.size() - 1 - i);
        }
        
        return arr;
    }
}
