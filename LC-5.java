// LC - 5 : https://leetcode.com/problems/longest-palindromic-substring/

public class Solution {
    public String longestPalindrome(String s) {
        int maxL = 1;
        String max = s.substring(0, 1);
        if (s.length() <= 1) {
            return s;
        }
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + maxL; j <= s.length(); j++) {
                if (j - i > maxL && check(s.substring(i, j))) {
                    maxL = j - i;
                    max = s.substring(i, j);
                }
            }
        }

        return max;
    }
    boolean check(String s) {
        int start = 0;
        int end = s.length() - 1;
        while (start < end) {
            if (s.charAt(start) != s.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }
}