```java
class Solution {
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {

        if(root1 == null) {
            return root2;
        }

        if(root2 == null) {
            return root1;
        }

        TreeNode newNode = new TreeNode();
        newNode.val = root1.val + root2.val;
        newNode.left = mergeTrees(root1.left, root2.left); 
        newNode.right = mergeTrees(root1.right, root2.right); 
        
        return newNode;
    }
}
```

- 두 트리의 동시 순회 및 병합
  - 같은 위치를 함께 방문
  - 병합 규칙
    - 둘 다 존재 → 값 합산
    - 한쪽만 존재 → 존재하는 노드 사용
    - 둘 다 없음 → null