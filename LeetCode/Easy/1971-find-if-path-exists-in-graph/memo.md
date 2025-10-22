##### 인접 리스트로 이진 트리 표현

```java
class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }
        
        // 양방향 간선
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            graph.get(u).add(v);
            graph.get(v).add(u);
        }
        
        //...
    }
}
```

**edges = [[0,1], [1,2], [2,0]]**

**첫 번째 간선 [0,1] 처리:**
```
u=0, v=1
graph.get(0).add(1) → 0번째 리스트에 1 추가
graph.get(1).add(0) → 1번째 리스트에 0 추가

결과: graph = [[1], [0], []]
```

**두 번째 간선 [1,2] 처리:**
```
u=1, v=2  
graph.get(1).add(2) → 1번째 리스트에 2 추가
graph.get(2).add(1) → 2번째 리스트에 1 추가

결과: graph = [[1], [0,2], [1]]
```

**세 번째 간선 [2,0] 처리:**
```
u=2, v=0
graph.get(2).add(0) → 2번째 리스트에 0 추가  
graph.get(0).add(2) → 0번째 리스트에 2 추가

최종 결과: graph = [[1,2], [0,2], [1,0]]
```

<br/>

***

<br/>

##### 재귀 호출

###### 공통 패턴

```text
private returnType dfs(parameters) {
    // 1. 기저 조건
    if (종료조건) {
        return 결과;
    }

    // 2. 현재 작업 수행 
    
    // 3. 재귀 호출

    // 4. 결과 반환
    return 종합결과;
}
```

<br/>

###### 예시: 재귀 호출

```java
class Solution {
    public void printNumber(int n) {
        dfs(1, n);
    }
    
    private void dfs(int current, int limit) {
        if (current > limit) {
            return;
        }

        System.out.println(current + " ");
        
        dfs(current + 1, limit);
    }
}
```

<br/>

###### 예시: 이진 트리와 DFS

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
```text
이진 트리 생성
TreeNode root = new TreeNode(1);
root.left = new TreeNode(2);
root.right = new TreeNode(3);
root.left.left = new TreeNode(4);

트리 구조
      1
     / \
    2   3
   /
  4

메모리 상태
root 객체:           leftChild 객체:      rightChild 객체:
├─ val: 1           ├─ val: 2            ├─ val: 3
├─ left: ────────→  ├─ left: null        ├─ left: null
└─ right: ───────┐  └─ right: null       └─ right: null
                 │
                 └→ rightChild 객체 가리킨다
```

```java
class Solution {

    public boolean findValue(TreeNode root, int target) {
        return dfs(root, target);
    }

    private boolean dfs(TreeNode node, int target) {
        // 기저 조건: 빈 노드
        if (node == null) {
            return false;
        }

        // 기저 조건: 목표 값 발견
        if (node.val == target) {
            return true;
        }
        
        return dfs(node.left, target) || dfs(node.right, target);
    }
}
```






















