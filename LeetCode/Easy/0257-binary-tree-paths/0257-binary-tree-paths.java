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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList<>();
        List<Integer> path = new ArrayList<>();

        dfs(root, path, result);

        return result;
    }

    private void dfs(TreeNode node, List<Integer> path, List<String> result) {
        if (node == null) {
            return;
        }

        path.add(node.val);

        if (node.left == null && node.right == null) {
            List<String> strPath = new ArrayList<>();
            for (int val : path) {
                strPath.add(String.valueOf(val));
            }

            result.add(String.join("->", strPath));
            
        } else {
            dfs(node.left, path, result);
            dfs(node.right, path, result);
        }
        
        path.remove(path.size() - 1); 
    }
}