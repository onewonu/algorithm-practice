## 1로 만들기

### 문제 설명
정수가 있을 때, 다음 규칙에 따라 1로 만듭니다:
1. **짝수**: 반으로 나눕니다.
2. **홀수**: 1을 뺀 뒤 반으로 나눕니다.
3. 반복하여 마지막에는 1이 됩니다.

리스트 `num_list`에 담긴 정수들을 모두 1로 만들기 위해 필요한 나누기 연산의 총 횟수를 반환하는 함수를 작성하세요.

---

### 제한사항
- $3 \leq \text{num_list의 길이} \leq 15$
- $1 \leq \text{num_list의 원소} \leq 30$

---

### 입출력 예

| num_list             | result |
|----------------------|--------|
| `[12, 4, 15, 1, 14]` | `11`   |

---

### 입출력 예 설명

#### 예제 #1
각 숫자에 대해 1로 만들기 위해 필요한 연산의 횟수는 다음과 같습니다:
- `12`: $12 \to 6 \to 3 \to 1$ (**3번**)
- `4`: $4 \to 2 \to 1$ (**2번**)
- `15`: $15 \to 7 \to 3 \to 1$ (**3번**)
- `1`: (**0번**)
- `14`: $14 \to 7 \to 3 \to 1$ (**3번**)

총 연산 횟수: $3 + 2 + 3 + 0 + 3 = 11$  
따라서 `11`을 반환합니다.
# 회고
### 재귀 함수(Recursive Function)
- 구조
  - 종료 조건(Base Case)
  - 재귀 호출(Recursive Case)
- 실행 과정
  - 각 함수 호출은 스택 메모리에 적재된다.
  - 상위 호출이 종료되려면 하위 호출이 종료되어야 한다.
- 고려 사항
  - 명확한 종료 조건 설정
  - 깊은 재귀 호출로 인해 스택 메모리 초과 
  - 너무 큰 입력은 반복문으로 리펙토링
#### 재귀 함수(Recursive Function): 팩토리얼
```java
public int factorial(int n) {
    if (n == 1) return 1;
    return n * factorial(n - 1);
}
```
#### 재귀 함수(Recursive Function): 피보나치 수열
_0 과 1 로 시작, 이전 두 숫자의 합으로 이루어진 수열._
```java
public int fibonacci(int n) {
    if (n == 0) return 0; 
    if (n == 1) return 1;
    return fibonacci(n - 1) + fibonacci(n - 2);
}
```
#### 재귀 함수(Recursive Function): 이진 탐색
```java
public int binarySearch(int[] arr, int target, int start, int end) {
    if (start > end) return -1;
    int mid = (start + end) / 2;
    if (arr[mid] == target) return mid;
    if (arr[mid] > target) return binarySearch(arr, target, start, mid - 1);
    return binarySearch(arr, target, mid + 1, end);
}
```