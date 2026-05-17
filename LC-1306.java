// LC - 1306 : https://leetcode.com/problems/jump-game-iii/

class Solution {
    public boolean canReach(int[] arr, int start) {
        int l=arr.length;;
        int[] visited=new int[l];
        Queue<Integer> q= new ArrayDeque<>();
        q.offer(start);
        while(!q.isEmpty()){
            int a=q.poll();
            if(a>=l||a<0||visited[a]==1) continue;
            if(arr[a]==0) return true;
            visited[a]=1;
            q.offer(a+arr[a]);
            q.offer(a-arr[a]); 
        }
        return false;

    }
}