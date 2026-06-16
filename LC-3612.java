// LC - 3612 : https://leetcode.com/problems/process-string-with-special-operations-i/

class Solution {
    public String processStr(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isLowerCase(c)) {
                sb.append(c);
            } else if (c == '*') {
                if (sb.length() > 0) {
                    sb.deleteCharAt(sb.length() - 1);
                }
            } else if (c == '#') {
                String temp = sb.toString();
                sb.append(temp);
            } else if (c == '%') {
                sb.reverse();
            }
        }
        return sb.toString();
    }
}