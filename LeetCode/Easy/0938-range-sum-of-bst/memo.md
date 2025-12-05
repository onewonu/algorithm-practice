```java
class Solution {
    public int rangeSumBST(TreeNode root, int low, int high) {
        int sum = 0;

        if (root == null) {
            return 0;
        }

        if (root.val > high) {
            sum += rangeSumBST(root.left, low, high);
        } else if (root.val < low) {
            sum += rangeSumBST(root.right, low, high);
        } else {
            sum += root.val;
            sum += rangeSumBST(root.left, low, high);
            sum += rangeSumBST(root.right, low, high);
        }

        return sum;
    }
}
```

###### BST (Binary Search Tree, 이진 탐색 트리)
- 각 노드의 왼쪽 서브트리에 있는 모든 노드는 현재 노드보다 작은 값
- 각 노드의 오른쪽 서브트리에 있는 모든 노드는 현재 노드보다 큰 값

<br/>

###### 전체 흐름
- null 체크
- 범위보다 작으면 → 오른쪽만 탐색
- 범위보다 크면 → 왼쪽만
- 범위 안이면 → 현재값 + 양쪽 모두 탐색
    - (전제: BTS)범위를 벗어난 방향은 탐색할 필요 없고, 반대 방향에만 답이 있을 수 있다
