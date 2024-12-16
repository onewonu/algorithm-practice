## n개 간격의 원소들

### 문제 설명

정수 리스트 `num_list`와 정수 `n`이 주어질 때,  
`num_list`의 첫 번째 원소부터 마지막 원소까지 **n개 간격**으로 저장되어 있는 원소들을 차례로 담은 리스트를 반환하는 `solution` 함수를 작성하세요.

---

### 제한사항

- $5 \leq \text{num\_list의 길이} \leq 20$
- $1 \leq \text{num\_list의 원소} \leq 9$
- $1 \leq n \leq 4$

---

### 입출력 예

| num_list           | n | result    |
|--------------------|---|-----------|
| [4, 2, 6, 1, 7, 6] | 2 | [4, 6, 7] |
| [4, 2, 6, 1, 7, 6] | 4 | [4, 7]    |

---

### 입출력 예 설명

#### 예제 #1
- `[4, 2, 6, 1, 7, 6]`에서 **2개 간격**으로 저장된 원소들은 `[4, 6, 7]`입니다.

#### 예제 #2
- `[4, 2, 6, 1, 7, 6]`에서 **4개 간격**으로 저장된 원소들은 `[4, 7]`입니다.
# 회고
### 소수점 없는 정수 연산으로 올림 구현
> (num_list.length + n - 1) / n
-  n으로 나눌 때 남는 소수점 부분을 보완하기 위함
### 다른 풀이 방법: List
```java
import java.util.ArrayList;
import java.util.List;

public int[] solution(int[] num_list, int n) {
    List<Integer> resultList = new ArrayList<>();
    for (int i = 0; i < num_list.length; i += n) {
        resultList.add(num_list[i]);
    }
    return resultList.stream().mapToInt(Integer::intValue).toArray();
}
```
### 다른 풀이 방법: Stream API
```java
import java.util.stream.IntStream;

public int[] solution(int[] num_list, int n) {
    return IntStream.range(0, (num_list.length + n - 1) / n) 
                    .map(i -> num_list[i * n])            
                    .toArray();
}
```