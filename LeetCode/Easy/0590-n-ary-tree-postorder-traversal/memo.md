```java
class Solution {
    public List<Integer> postorder(Node root) {
        List<Integer> result = new ArrayList<>();
        helper(root, result);
        return result;
    }

    private void helper(Node node, List<Integer> result) {
        if(node == null) {
            return;
        }

        for(Node child : node.children) {
            helper(child, result);
        }
        
        result.add(node.val);
    }
}
```

- 후위 순회(Postorder Traversal)
  - 자식들을 모두 방문한 후, 마지막으로 부모를 방문
    - 왼쪽부터 모든 자식 노드 방문
    - 모든 자식 방문 완료 후 현재 노드 방문