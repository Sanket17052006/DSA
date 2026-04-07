// LC - 3159 : https://leetcode.com/problems/find-occurrences-of-an-element-in-an-array/

class Solution {
    public int[] occurrencesOfElement(int[] nums, int[] queries, int x) {
        int l=queries.length;
        int[] res=new int[l];
        int l1=nums.length;
        int count=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<l1;i++){
            if(nums[i]==x){
                count++;
                map.put(count,i);
            }
        }
        for(int i=0;i<l;i++){
            int occurenceNo =queries[i];
            if(map.containsKey(occurenceNo)){
                res[i]=map.get(occurenceNo);
            }
            else{
                res[i]=-1;
            }

        }
        return res;


    }
}