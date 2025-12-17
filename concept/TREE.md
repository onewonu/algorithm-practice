### Base
```java
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    
    TreeNode(int val) {
        this.val = val;
    }
}
```

<br/><br/>

### 깊이 우선 탐색 (DFS)
**루트에서 시작해 최대한 깊이 내려간 후 다시 올라오는 방식**

###### 전위 순회 (Preorder)
- root → left → right
- 트리 복사, 구조 출력
```java
void preorder(TreeNode root) {
    if (root == null) return;
    
    System.out.println(root.val);
    preorder(root.left);
    preorder(root.right);
}
```

<br/>

###### 중위 순회 (Inorder)
- left → root → right
- BST 에서 정렬된 순서로 값 얻기
```java
void inorder(TreeNode root) {
    if (root == null) return;
    
    inorder(root.left);
    System.out.println(root.val);
    inorder(root.right);
}
```

<br/>

###### 후위 순회 (Postorder)
- 순서: left → right → root
- 트리 삭제, 자식 정보를 먼저 처리
```java
void postorder(TreeNode root) {
    if (root == null) return;
    
    postorder(root.left);
    postorder(root.right);
    System.out.println(root.val);
}
```

<br/><br/>

### 너비 우선 탐색 (BFS)
**레벨별로 왼쪽에서 오른쪽으로 방문하는 방식**

###### 레벨 순서 순회 (Level-order)
- 같은 깊이의 노드들을 먼저 처리
- Queue 사용
- 최단 경로 찾기, 레벨별 처리
```java
void levelOrder(TreeNode root) {
    Queue<TreeNode> queue = new LinkedList<>();
    queue.offer(root);

    while (!queue.isEmpty()) {
        TreeNode node = queue.poll();
        System.out.println(node.val);

        if (node.left != null) queue.offer(node.left);
        if (node.right != null) queue.offer(node.right);
    }
}
```