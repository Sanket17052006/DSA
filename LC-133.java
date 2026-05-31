// LC - 133 : https://leetcode.com/problems/clone-graph/

/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    public Node cloneGraph(Node node) {
        if(node == null) return null;
        HashMap<Node, Node> map=new HashMap<>();
        return dfs(node,map);
    }
    private Node dfs(Node root, HashMap<Node,Node> map){
        if(map.containsKey(root)){
            return map.get(root);
        }
        Node temp= new Node(root.val);
        map.put(root,temp);
        for(Node i : root.neighbors){
            temp.neighbors.add(dfs(i,map));
        }
        return temp;
    }
}