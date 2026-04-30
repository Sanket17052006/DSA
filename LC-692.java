// LC - 692 : https://leetcode.com/problems/top-k-frequent-words/

class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        List<String> res= new ArrayList<>();
        HashMap<String,Integer> map= new HashMap<>();
        for(String s: words){
            map.put(s,map.getOrDefault(s,0)+1);
        }
        PriorityQueue<String> q = new PriorityQueue<>((a, b) -> 
        map.get(a).equals(map.get(b)) ? b.compareTo(a) : map.get(a) - map.get(b));

        for (String s : map.keySet()) {
            q.offer(s);
            if (q.size() > k) q.poll();
        }
        while (!q.isEmpty()){
            res.add(q.poll());
        }
        Collections.reverse(res);
        return res;
    }
}