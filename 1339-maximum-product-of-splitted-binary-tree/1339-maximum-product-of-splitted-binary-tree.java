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
    private long result,total;
    private int MOD = 1000000007;
    public int maxProduct(TreeNode root) {
        total = dfs(root);
        result = Long.MIN_VALUE;
        dfs(root);
        return (int) (result%MOD);
    }
    private long dfs(TreeNode node){
        long left_sum = node.left == null ? 0: dfs(node.left);
        long right_sum = node.right == null ? 0: dfs(node.right);
        long r1 = (total - left_sum)  *left_sum;
        long r2 = (total - right_sum)  *right_sum;
        result = Math.max(result,Math.max(r1,r2));
        return (left_sum+right_sum+node.val);
    }
}