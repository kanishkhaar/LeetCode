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
    public TreeNode subtreeWithAllDeepest(TreeNode root) {
        return dfs(root).node;
    }

    class Pair {
        int depth;
        TreeNode node;
        Pair(int d, TreeNode n) {
            depth = d;
            node = n;
        }
    }

    private Pair dfs(TreeNode root) {
        if (root == null)
            return new Pair(0, null);

        Pair left = dfs(root.left);
        Pair right = dfs(root.right);

        if (left.depth > right.depth)
            return new Pair(left.depth + 1, left.node);
        if (right.depth > left.depth)
            return new Pair(right.depth + 1, right.node);

        return new Pair(left.depth + 1, root);
    }
}