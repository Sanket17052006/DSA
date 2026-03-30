// LC - 105 : https://leetcode.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/
//Can use Hashmap instead of Linear Search :|

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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        TreeNode res=tree(preorder,inorder,0,preorder.length-1);
        return res;
        
    }
    int k=0;
    TreeNode tree(int [] preorder,int[] inorder,int start,int end){
        if(start>end) return null;
        int val=preorder[k++];
        TreeNode node=new TreeNode(val);
        int newEnd=LinearSearch(inorder,val);
        node.left=tree(preorder,inorder,start,newEnd-1);
        node.right=tree(preorder,inorder,newEnd+1,end);
        return node;
    }
    int LinearSearch(int inorder[],int target){
        for(int i=0;i<inorder.length;i++){
            if(inorder[i]==target){
                return i;
            }
        }
        return -1;
    }

}