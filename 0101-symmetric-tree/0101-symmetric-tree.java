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
    public boolean isSymmetric(TreeNode root) {
        if(root==null){
            return true;
        }
        return ismirror(root.left,root.right);
    }
    boolean ismirror(TreeNode lroot,TreeNode rroot){
        if(lroot==null && rroot==null) return true;
        if(lroot==null || rroot==null||lroot.val!=rroot.val) return false;
        return ismirror(lroot.left,rroot.right) && ismirror(lroot.right,rroot.left);
    }
}