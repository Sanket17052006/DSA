// LC - 70 : https://leetcode.com/problems/climbing-stairs/

class Solution {
    public int climbStairs(int n) {
        return fib(n);
        
    }


    private int fib(int n){
        int n1=1;
        int n2=2;
        if(n==1||n==2){
            return n;
        }
        for(int i=3;i<=n;i++){
            int t=n1+n2;
            n1=n2;
            n2=t;
        }
        return n2;

    }
}