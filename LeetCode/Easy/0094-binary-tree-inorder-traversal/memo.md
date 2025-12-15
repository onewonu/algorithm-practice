```java
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        helper(root, result);
        return result;
    }

    private void helper(TreeNode node, List<Integer> result) {
        if(node == null) {
            return;
        }

        helper(node.left, result);

        result.add(node.val);

        helper(node.right, result);
    }
}
```

- 중위 순회(Inorder)
  - 왼쪽 자식만 처리한 후 부모 처리
  - 부모를 처리하고 나서 오른쪽 자식 처리