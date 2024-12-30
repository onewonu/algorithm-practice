## 조건에 맞게 수열 변환하기 2

### 문제 설명
정수 배열 `arr`가 주어집니다.  
`arr`의 각 원소에 대해 다음과 같은 작업을 반복합니다:
- 값이 50보다 크거나 같은 **짝수**라면 2로 나눕니다.
- 값이 50보다 작은 **홀수**라면 2를 곱하고 다시 1을 더합니다.

이 작업을 **x번 반복한 결과**인 배열을 `arr(x)`라고 할 때, `arr(x) = arr(x + 1)`인 `x`가 항상 존재합니다.  
이러한 `x` 중 **가장 작은 값**을 반환하세요.

단, 두 배열에 대한 "="는 두 배열의 크기가 같으며, 같은 인덱스의 원소가 각각 서로 같음을 의미합니다.

---

### 제한사항
- $1 \leq arr\text{의 길이} \leq 1,000,000$
- $1 \leq arr\text{의 원소의 값} \leq 100$

---

### 입출력 예

| `arr`                    | `result` |
|--------------------------|----------|
| `[1, 2, 3, 100, 99, 98]` | `5`      |

---

### 입출력 예 설명

#### 예제 #1
`arr`를 변환 작업을 반복하면 다음과 같습니다:

| 반복 횟수 | `arr`                     |
|-------|---------------------------|
| 0     | `[1, 2, 3, 100, 99, 98]`  |
| 1     | `[3, 2, 7, 50, 99, 49]`   |
| 2     | `[7, 2, 15, 25, 99, 99]`  |
| 3     | `[15, 2, 31, 51, 99, 99]` |
| 4     | `[31, 2, 63, 51, 99, 99]` |
| 5     | `[63, 2, 63, 51, 99, 99]` |
| 6     | `[63, 2, 63, 51, 99, 99]` |

이후로 `arr`가 변하지 않습니다.  
즉, `arr(5) = arr(6)`이므로 **5**를 반환합니다.
# 회고
### 핵심 요구사항
> 주어진 계산 규칙대로 배열을 처리하며, 배열이 더 이상 변화하지 않을 때까지 반복하는 것.
### 다른 풀이 방법: Stream API
```java
import java.util.Arrays;

public class Solution {
    public int solution(int[] arr) {
        int count = 0;

        while (true) {
            int[] newArr = Arrays.stream(arr)
                    .map(this::transformElement)
                    .toArray();
            
            if (Arrays.equals(arr, newArr)) break;
            arr = newArr;

            count++;
        }

        return count;
    }
    
    private int transformElement(int num) {
        if (num >= 50 && num % 2 == 0) {
            return num / 2;
        } else if (num < 50 && num % 2 == 1) {
            return (num * 2) + 1;
        } else {
            return num;
        }
    }
}
```