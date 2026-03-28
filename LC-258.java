// LC - 258 : https://leetcode.com/problems/add-digits/

class Solution {
    public int addDigits(int num) {
        return repeat(num);
        
    }
    private int repeat(int num){
        if(num<=9){
            return num;
        }
        int sum=0;
        while(num>0){
            int r=num%10;
            sum += r;
            num/=10;
        }
        return repeat(sum);
    }
}