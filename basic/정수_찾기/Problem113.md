## 정수 찾기

---

### 문제 설명
정수 리스트 `num_list`와 찾으려는 정수 `n`이 주어질 때,  
`num_list` 안에 `n`이 있으면 `1`, 없으면 `0`을 return 하도록 `solution` 함수를 완성해주세요.

---

### 제한사항
- $( 3 \leq \text{num_list 의 길이} \leq 100 )$
- $( 1 \leq \text{num_list 의 원소} \leq 100 )$
- $( 1 \leq n \leq 100 )$

---

### 입출력 예

| num_list             | n   | result |
|----------------------|-----|--------|
| [1, 2, 3, 4, 5]      | 3   | 1      |
| [15, 98, 23, 2, 15]  | 20  | 0      |

---

### 입출력 예 설명

#### 예제 #1
- 리스트 `[1, 2, 3, 4, 5]` 안에 `3`이 있으므로 `1`을 return 합니다.

#### 예제 #2
- 리스트 `[15, 98, 23, 2, 15]` 안에 `20`이 없으므로 `0`을 return 합니다.
# 회고
### 다른 풀이 방법: 이진 탐색 
```java
import java.util.Arrays;

public int solution(int[] num_list, int n) {
    Arrays.sort(num_list);
    return Arrays.binarySearch(num_list, n) >= 0 ? 1 : 0;
}
```
### 다른 풀이 방법: Stream API
```java
import java.util.Arrays;

public int solution(int[] num_list, int n) {
    return Arrays.stream(num_list).anyMatch(num -> num == n) ? 1 : 0;
}
```
### Reference
[java 21 docs: Arrays.binarySearch(int[],int)](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/Arrays.html#binarySearch(int[],int))