// LC - 42 : https://leetcode.com/problems/trapping-rain-water/

class Solution {
    public int trap(int[] height) {
    int left = 0, right = height.length - 1;
    int maxLeft = 0, maxRight = 0;
    int res = 0;
    while (left <= right) {
        if (maxLeft <= maxRight) {
            maxLeft = Math.max(maxLeft, height[left]);
            res += maxLeft - height[left];
            left++;
        } else {
            maxRight = Math.max(maxRight, height[right]);
            res += maxRight - height[right];
            right--;
        }
    }

    return res;
    }
}