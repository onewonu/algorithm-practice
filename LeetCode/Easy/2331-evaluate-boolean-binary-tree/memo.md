```java
class Solution {
    public boolean evaluateTree(TreeNode root) {

        if(root.left == null && root.right == null) {
            return root.val == 1; 
        }

        boolean left = evaluateTree(root.left);
        boolean right = evaluateTree(root.right);

        if(root.val == 2) {
            return left || right;
        } else if(root.val == 3) {
            return left && right;
        }

        return false;
    }   
}
```

- Input: root = [2,1,3,null,null,0,1]

1. evaluateTree(root) - 값 2 (OR)
   - 리프 노드 아님 (자식 있음)
   - 왼쪽 자식 평가 필요 → evaluateTree(left) 호출
   - 오른쪽 자식 평가 필요 → evaluateTree(right) 호출
2. evaluateTree(left) - 값 1
   - 리프 노드 (자식 없음)
   - root.val == 1 → True 반환
3. evaluateTree(right) - 값 3 (AND)
   - 리프 노드 아님 (자식 있음)
   - 왼쪽 자식 평가 필요 → evaluateTree(left) 호출
   - 오른쪽 자식 평가 필요 → evaluateTree(right) 호출
4. evaluateTree(left) - 값 0
   - 리프 노드
   - root.val == 0 → False 반환
5. evaluateTree(right) - 값 1
   - 리프 노드
   - root.val == 1 → True 반환
6. 3번 노드 계산
   - left = False, right = True
   - root.val == 3 (AND)
   - False && True → False 반환
7. 루트 노드 계산
   - left = True (2단계 결과)
   - right = False (6단계 결과)
   - root.val == 2 (OR)
   - True || False → True 반환