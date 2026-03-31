// LC - 129 : https://leetcode.com/problems/sum-root-to-leaf-numbers/description/

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
    int max=0;
    public int sumNumbers(TreeNode root) {
        solve(root,0);
        return max;
    }
    void solve(TreeNode root,int sum){
        if(root==null){
            return;
        }
        sum= sum*10 + root.val;
        
        if(root.left==null && root.right==null){
            max += sum;
        }
        solve(root.left,sum);
        solve(root.right,sum);
    }
}