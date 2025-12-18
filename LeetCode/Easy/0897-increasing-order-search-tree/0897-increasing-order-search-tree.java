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
    private TreeNode newRoot = null;
    private TreeNode prev = null;

    public TreeNode increasingBST(TreeNode root) {
        inorder(root);
        return newRoot;
    }

    private void inorder(TreeNode node) {
        if(node == null) {
            return;
        }

        inorder(node.left);

        node.left = null;

        if(newRoot == null) {
            newRoot = node;
        }

        if(prev != null) {
            prev.right = node;
        }

        prev = node;

        inorder(node.right);
    }
}