# 리스트 자르기

## 문제 설명
정수 `n`과 정수 3개가 담긴 리스트 `slicer`, 그리고 정수 여러 개가 담긴 리스트 `num_list`가 주어집니다.  
`slicer`에 담긴 정수를 차례대로 `a`, `b`, `c`라고 할 때, `n`에 따라 다음과 같이 `num_list`를 슬라이싱합니다:

1. `n = 1` : `num_list`의 **0번 인덱스부터 `b`번 인덱스까지**
2. `n = 2` : `num_list`의 **`a`번 인덱스부터 마지막 인덱스까지**
3. `n = 3` : `num_list`의 **`a`번 인덱스부터 `b`번 인덱스까지**
4. `n = 4` : `num_list`의 **`a`번 인덱스부터 `b`번 인덱스까지 `c` 간격으로**

슬라이싱 결과를 반환합니다.

---

## 제한사항
- `n`은 1, 2, 3, 4 중 하나입니다.
- `slicer`의 길이 = 3
    - `slicer`에 담긴 정수를 차례대로 `a`, `b`, `c`라고 할 때:
        - $( 0 \leq a \leq b \leq \text{num_list의 길이} - 1 )$
        - $( 1 \leq c \leq 3 )$
- $( 5 \leq \text{num_list의 길이} \leq 30 )$
- $( 0 \leq \text{num_list의 원소} \leq 100 )$

---

## 입출력 예

| n | slicer    | num_list                    | result          |
|---|-----------|-----------------------------|-----------------|
| 3 | [1, 5, 2] | [1, 2, 3, 4, 5, 6, 7, 8, 9] | [2, 3, 4, 5, 6] |
| 4 | [1, 5, 2] | [1, 2, 3, 4, 5, 6, 7, 8, 9] | [2, 4, 6]       |

---

## 입출력 예 설명

### 입출력 예 #1
- `n = 3`, `slicer = [1, 5, 2]`
- `num_list`에서 **1번 인덱스부터 5번 인덱스까지** 자르면 `[2, 3, 4, 5, 6]`이 됩니다.

### 입출력 예 #2
- `n = 4`, `slicer = [1, 5, 2]`
- `num_list`에서 **1번 인덱스부터 5번 인덱스까지 2개 간격**으로 자르면 `[2, 4, 6]`이 됩니다.
# 회고
### 간격이 존재하는 배열 초기화
#### Length of range
$$
\text{Length of range} = endIndex - startIndex + 1 
$$
***
#### Elements by interval
$$
\text{Elements by interval} = \text{Length of range} / \text{intervalIndex} 
$$
- 정수 나누기 연산은 항상 내림 연산을 수행.
  - ex) $(5 - 1 + 1) / 2 = 2.5$
- 슬라이싱 작업에서는 마지막 부분 요소도 포함되어 소수점이 발생하는 경우 올림 해야한다.  
  - $\text{요소 개수} = \frac{\text{범위 길이} + (\text{intervalIndex} - 1)}{\text{intervalIndex}}$
*** 
#### 적용
$$
\frac{(\text{endIndex} - \text{startIndex} + 1) + (\text{intervalIndex} - 1)}{\text{intervalIndex}} 
$$
***
#### 정리
$$
\frac{\text{endIndex} - \text{startIndex} + \text{intervalIndex}}{\text{intervalIndex}}
$$
### 다른 방법: Stream API
```java
import java.util.stream.IntStream;

public int[] solution(int n, int[] slicer, int[] num_list) {
    int[] sliceParams = getSliceParams(n, slicer, num_list);
    int start = sliceParams[0];
    int end = sliceParams[1];
    int step = sliceParams[2];

    return IntStream.rangeClosed(start, end)
            .filter(i -> (i - start) % step == 0)
            .map(i -> num_list[i])
            .toArray();
}
```
- (i - start) % step == 0
  - i와 start 의 차이가 step 으로 나누어떨어지는지 확인.
  - step 간격으로 인덱스를 선택하려는 목적.

```
ex)
- 입력
  - start = 1, end = 9, step = 2
  - IntStream.rangeClosed(start, end) → [1, 2, 3, 4, 5, 6, 7, 8, 9]
- 동작
  - 1 - 1 % 2 = 0 % 2 = 0 → 선택됨
  - 2 - 1 % 2 = 1 % 2 ≠ 0 → 제외됨
  - 3 - 1 % 2 = 2 % 2 = 0 → 선택됨
  - …
  - 9 - 1 % 2 = 8 % 2 = 0 → 선택됨
```
     
     
     
                               
     