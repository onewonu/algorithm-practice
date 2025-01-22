## 뒤에서 5등 위로

### 문제 설명
정수로 이루어진 리스트 `num_list`가 주어집니다. `num_list`에서 **가장 작은 5개의 수를 제외한 수들**을 오름차순으로 담은 리스트를 return하도록 `solution` 함수를 완성해주세요.

---

### 제한사항
- $6 \leq \text{num_list의 길이} \leq 30$
- $1 \leq \text{num_list의 원소} \leq 100$

---

### 입출력 예

| num_list                                 | result                 |
|------------------------------------------|------------------------|
| `[12, 4, 15, 46, 38, 1, 14, 56, 32, 10]` | `[15, 32, 38, 46, 56]` |

---

### 입출력 예 설명

#### 예제 #1
- `[12, 4, 15, 46, 38, 1, 14, 56, 32, 10]`를 **정렬**하면 `[1, 4, 10, 12, 14, 15, 32, 38, 46, 56]`이 됩니다.
- 정렬된 리스트에서 **앞의 5개를 제외한 나머지**를 고르면 `[15, 32, 38, 46, 56]`이 됩니다.
# 회고
### 다른 풀이 방법: PriorityQueue
```java
import java.util.*;

public class Solution {
    public int[] solution(int[] num_list) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int num : num_list) {
            minHeap.add(num);
        }
        
        for (int i = 0; i < 5; i++) {
            minHeap.poll();
        }
        
        int[] result = new int[minHeap.size()];
        int index = 0;
        while (!minHeap.isEmpty()) {
            result[index++] = minHeap.poll();
        }

        return result;
    }
}
```
- 가장 우선순위가 높은 요소를 효율적으로 추출할 수 있는 데이터 구조.
- 정렬을 유지하면서 삽입, 삭제를 처리.
- Heap 자료구조를 기반으로 구현.
#### 동작 
- Add(삽입)
  - $O(\log n)$
  - 새 데이터를 추가하면 트리를 재구성하여 힙 속성을 유지.
- Poll(삭제)
  - $O(\log n)$
  - 최상단(최소값 또는 최대값)을 제거한 후, 나머지 데이터를 재구성하여 힙 속성을 유지
- Peek(최상위 요소 접근)
  - $O(1)$
  - 내부적으로 정렬된 리스트가 아니라, 필요할 때만 우선순위에 따라 데이터를 제공
### 다른 풀이 방법: 선택 정렬
```java
import java.util.Arrays;

public class Solution {
    public int[] solution(int[] num_list) {
        for (int i = 0; i < num_list.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < num_list.length; j++) {
                if (num_list[j] < num_list[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = num_list[i];
            num_list[i] = num_list[minIndex];
            num_list[minIndex] = temp;
        }
        
        return Arrays.copyOfRange(num_list, 5, num_list.length);
    }
}
```
- 가장 작은 값(또는 가장 큰 값)을 찾아 배열의 앞쪽부터 차례대로 정렬
- 정렬이 끝날 때마다 배열의 앞부부은 정렬된 상태가 된다.
- 시간 복잡도: $O(n^2)$
- 공간 복잡도: $O(1)$
#### 동작
- 최소값 찾기: 현재 범위에서 가장 작은 값을 탐색
- 스왑: 찾은 최소값을 해당 범위의 첫 번째 위치로 이동
- 반복: 정렬된 부분을 제와하고 나머지 배열에 대해 '최소값 찾기', '스왑' 을 반복
### 다른 풀이 방법: Stream API
```java
import java.util.Arrays;

public class Solution {
    public int[] solution(int[] num_list) {
        return Arrays.stream(num_list)
                .sorted()
                .skip(5)
                .toArray();
    }
}
```
### Reference
[java 21 docs: PriorityQueue](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/PriorityQueue.html)