// LC - 599 : https://leetcode.com/problems/minimum-index-sum-of-two-lists/

class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        HashMap<String , Integer> map = new HashMap<>();
        int l1 = list1.length;
        int l2= list2.length;
        for(int i=0;i<l1;i++){
            map.put(list1[i],i);
        }
        int min = Integer.MAX_VALUE;
        List<String> list = new ArrayList<>(); 

        for(int i=0;i<l2;i++)
        {
            if(map.containsKey(list2[i]) && (map.get(list2[i]) + i ) <= min)
            {
                if(min > (map.get(list2[i]) + i))
                {
                    list.clear();
                    min = map.get(list2[i])+i;
                }
                list.add(list2[i]);
                }
        }
        return list.toArray(new String[0]);
        
    }
}