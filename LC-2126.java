// LC - 2126 : https://leetcode.com/problems/destroying-asteroids/

class Solution {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
        Arrays.sort(asteroids);
        long m = mass;
        for(int i: asteroids){
            if(m < i){
                return false;
                
            }
            m += i;
        }
        return true;
    }
}