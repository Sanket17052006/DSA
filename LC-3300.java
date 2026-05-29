// LC - 3300 : https://leetcode.com/problems/minimum-element-after-replacement-with-digit-sum/

class Solution {
    public int minElement(int[] nums) {
      int min=Integer.MAX_VALUE;
      for(int i: nums){
          int sum=0;
          while(i>0){
              int r=i%10;
              sum += r;
              i/=10;
          }
          min=Math.min(sum,min);
          
      }  
      return min;
    }
}