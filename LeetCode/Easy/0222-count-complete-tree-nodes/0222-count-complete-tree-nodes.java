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
    public int countNodes(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int leftCount = calculateLeftHeight(root);
        int rightCount = calculateRightHeight(root);

        int count = 1;

        if (leftCount == rightCount) {
            return (int) Math.pow(2, leftCount) - 1;
        } else {
            count += countNodes(root.left);
            count += countNodes(root.right);
        }

        return count;
    }

    private int calculateLeftHeight(TreeNode node) {
        int count = 0;
        while (node != null) {
            node = node.left;
            count++;
        }
        return count;
    }

    private int calculateRightHeight(TreeNode node) {
        int count = 0;
        while (node != null) {
            node = node.right;
            count++;
        }
        return count;
    }
}

/**
    TreeNode currentLeftNode = root;
    int leftCount = 0;

    while (currentLeftNode != null) {
        currentLeftNode = currentLeftNode.left;
        leftCount++;
    }

    TreeNode currentRightNode = root;
    int rightCount = 0;

    while (currentRightNode != null) {
        currentRightNode = currentRightNode.right;
        rightCount++;
    }
*/