// LC - 3751 : https://leetcode.com/problems/total-waviness-of-numbers-in-range-i/

class Solution {
public int totalWaviness(int num1, int num2) {
        int count=0;
        if(num2<100) return 0;
        int i=num1;
        if(num1<100) i=100;
        for(; i<=num2; i++){
            int c=wavy(i);
            count += c;
        }
        return count;
    }
private int wavy(int n){
        String s=Integer.toString(n);
        int ans=0;
        for(int i=1;i<s.length()-1;i++){
            int mid=s.charAt(i);
            int left=s.charAt(i-1);
            int right=s.charAt(i+1);
            if(mid>left && mid>right) ans++;
            else if(mid<left && mid<right) ans++;
        }
        return ans;
    }
}