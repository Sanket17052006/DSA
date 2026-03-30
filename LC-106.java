// LC - 106 : https://leetcode.com/problems/construct-binary-tree-from-inorder-and-postorder-traversal/

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int k;
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<inorder.length;i++){
            map.put(inorder[i],i);
        }
        k=inorder.length-1;
        TreeNode res=tree(postorder,map,0,postorder.length-1);
        return res;
    }
    TreeNode tree(int [] postorder,HashMap<Integer,Integer> map,int start,int end){
        if(start>end) return null;
        int val=postorder[k--];
        TreeNode node=new TreeNode(val);
        int index=map.get(val);
        
        node.right=tree(postorder,map,index+1,end);
        node.left=tree(postorder,map,start,index-1);
        return node;
    }
    
}