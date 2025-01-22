## 전국 대회 선발 고사

### 문제 설명
0번부터 \( n-1 \)번까지 \( n \)명의 학생 중 3명을 선발하는 전국 대회 선발 고사를 보았습니다. 
등수가 높은 3명을 선발해야 하지만, 개인 사정으로 전국 대회에 참여하지 못하는 학생들이 있어 참여가 가능한 학생 중 등수가 높은 3명을 선발하기로 했습니다.

각 학생들의 선발 고사 등수를 담은 정수 배열 `rank`와 전국 대회 참여 가능 여부가 담긴 boolean 배열 `attendance`가 매개변수로 주어집니다.
전국 대회에 선발된 학생 번호들을 등수가 높은 순서대로 각각 \( a, b, c \)번이라고 할 때 $( 10000 \times a + 100 \times b + c)$ 를 return 하는 `solution` 함수를 작성해 주세요.

---

### 제한사항
- $( 3 \leq \text{rank 의 길이} = \text{attendance 의 길이} \leq 100)$
- `rank[i]`는 \( i \)번 학생의 선발 고사 등수를 의미합니다.
- `rank`의 원소는 1부터 \( n \)까지의 정수로 모두 서로 다릅니다.
- `attendance[i]`는 \( i \)번 학생의 전국 대회 참석 가능 여부를 나타냅니다.
  - `true`: 참석 가능
  - `false`: 참석 불가능
- `attendance`의 원소 중 적어도 3개는 `true`입니다.

---

### 입출력 예

| rank                    | attendance                                      | result  |
|-------------------------|-------------------------------------------------|---------|
| `[3, 7, 2, 5, 4, 6, 1]` | `[false, true, true, true, true, false, false]` | `20403` |
| `[1, 2, 3]`             | `[true, true, true]`                            | `102`   |
| `[6, 1, 5, 2, 3, 4]`    | `[true, false, true, false, false, true]`       | `50200` |

---

### 입출력 예 설명

#### 예제 #1
- 예제 1번에서 1등은 6번 학생이지만 전국 대회에 참석 불가능하므로 넘어갑니다.
- 2등은 2번 학생이고 전국 대회에 참석 가능하므로 1순위로 선발됩니다.
- 3등은 0번 학생이고 전국 대회에 참석 불가능 하므로 넘어갑니다.
- 4등과 5등은 각각 4번, 3번 학생이고 두 학생 모두 전국 대회에 참석 가능하므로 각각 2순위, 3순위로 선발됩니다.
- 3명을 선발하였으므로 6등과 7등은 확인하지 않아도 됩니다.
- 따라서 $( 10000 \times 2 + 100 \times 4 + 3 = 20403)$ 을 return 합니다.

#### 예제 #2
- 예제 2번에서 1, 2, 3등은 각각 0번, 1번, 2번 학생이고 세 학생 모두 전국 대회에 참석 가능하므로 각각 1순위, 2순위, 3순위로 선발됩니다.
- 따라서 $( 10000 \times 0 + 100 \times 1 + 2 = 102)$ 를 return 합니다.

#### 예제 #3
- 예제 3번에서 1, 2, 3등은 각각 1번, 3번, 4번 학생이지만 세 학생 모두 전국 대회에 참석 불가능합니다.
- 다음으로 4, 5, 6등은 각각 5번, 2번, 0번 학생이고 세 학생 모두 전국 대회에 참석 가능하므로 각각 1순위, 2순위, 3순위로 선발됩니다.
- 따라서 $( 10000 \times 5 + 100 \times 2 + 0 = 50200)$ 을 return 합니다.
# 회고
### 문제 설명
- 등수: 참석 가능한 학생 중 등수가 높은 3명을 선발. (오름차순)
- 학생번호: 선발된 학생 번호를 사용해 계산식을 적용해 반환.
### 다른 풀이 방법: PriorityQueue(우선순위 큐)
```java
import java.util.Comparator;
import java.util.Objects;
import java.util.PriorityQueue;

public class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        PriorityQueue<int[]> queue = new PriorityQueue<>(Comparator.comparingInt(a -> a[0]));

        for (int i = 0; i < rank.length; i++) {
            if (attendance[i]) {
                queue.offer(new int[] {rank[i], i});
            }
        }
        
        int a = Objects.requireNonNull(queue.poll())[1];
        int b = Objects.requireNonNull(queue.poll())[1];
        int c = Objects.requireNonNull(queue.poll())[1];
        return 10000 * a + 100 * b + c;
    }
}
```
#### Comparator.comparingInt
- Comparator 는 Java 에서 객체를 정렬할 기준을 제공하는 인터페이스.
- comparingInt 는 숫자 데이터를 정렬하는 데 사용.
#### (a -> a[0])
- a는 list 의 요소(즉, int[] 배열) 중 하나를 나타낸다.
- a[0]은 해당 배열의 첫 번째 요소(예: 등수)를 반환.
- Comparator 는 이 반환값을 기준으로 리스트를 정렬.
### 다른 풀이 방법: TreeSet
```java
import java.util.TreeSet;

public class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        TreeSet<int[]> set = new TreeSet<>((a, b) -> {
            if (a[0] == b[0]) return a[1] - b[1];
            return a[0] - b[0];
        });

        for (int i = 0; i < rank.length; i++) {
            if (attendance[i]) {
                set.add(new int[] {rank[i], i});
            }
        }
        
        int[] first = set.pollFirst();
        int[] second = set.pollFirst();
        int[] third = set.pollFirst();
        assert first != null;
        assert second != null;
        assert third != null;
        return 10000 * first[1] + 100 * second[1] + third[1];
    }
}
```
### 다른 풀이 방법: 배열 + Stream API 를 통한 정렬 
```java
import java.util.*;
import java.util.stream.Collectors;

public class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        List<int[]> eligible = new ArrayList<>();
        for (int i = 0; i < rank.length; i++) {
            if (attendance[i]) {
                eligible.add(new int[] {rank[i], i});
            }
        }
        
        List<int[]> sorted = eligible.stream()
            .sorted(Comparator.comparingInt(a -> a[0]))
            .toList();
        
        int a = sorted.get(0)[1];
        int b = sorted.get(1)[1];
        int c = sorted.get(2)[1];
        return 10000 * a + 100 * b + c;
    }
}
```