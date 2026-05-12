// LC - 788 : https://leetcode.com/problems/rotated-digits/

class Solution {
    public int rotatedDigits(int n) {
        int ans=0;
        
        for(int i=1;i<=n;i++){
            boolean isUnique=false;
            int t=i;
            while(t>0){
                int r=t%10;
                if(r==2||r==5||r==6||r==9){
                    isUnique=true;
                }
                else if(r==3||r==4||r==7){
                    isUnique=false;
                    break;
                }
                t/=10;
            }
            if(isUnique){
                ans++;
            }
        }
        return ans;
    }
}