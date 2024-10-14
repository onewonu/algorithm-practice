# 홀짝에 따라 다른 값 반환하기
### 문제 설명
양의 정수 n이 매개변수로 주어질 때, n이 홀수라면 n 이하의 홀수인 모든 양의 정수의 합을 return 하고 n이 짝수라면 n 이하의 짝수인 모든 양의 정수의 제곱의 합을 return 하는 solution 함수를 작성해 주세요.

### 제한사항
- 1 ≤ n ≤ 100
### 입출력 예

| n  | result |
|----|--------|
| 7  | 16     |
| 10 | 220    |

### 입출력 예 설명
#### 입출력 예 #1
- 예제 1번의 n은 7로 홀수입니다. 7 이하의 모든 양의 홀수는 1, 3, 5, 7이고 이들의 합인 1 + 3 + 5 + 7 = 16을 return 합니다.
#### 입출력 예 #2
- 예제 2번의 n은 10으로 짝수입니다. 10 이하의 모든 양의 짝수는 2, 4, 6, 8, 10이고 이들의 제곱의 합인 22 + 42 + 62 + 82 + 102 = 4 + 16 + 36 + 64 + 100 = 220을 return 합니다.
# 회고
### 기존 반복문을 대체할 방법
#### 01 Stream API 를 사용하는 방법
```java
public int solution(int n) {
        if (n % 2 == 1) {
            return IntStream.rangeClosed(1, n)
                            .filter(i -> i % 2 == 1)
                            .sum();
        } else {
            return IntStream.rangeClosed(1, n)
                            .filter(i -> i % 2 == 0)
                            .map(i -> i * i) 
                            .sum();
        }
    }
```
#### 02 재귀 방식으로 구현
```java
public int solution(int n) {
    if (n % 2 == 1) {
        return sumOddNumbers(n, 1);
    } else {
        return sumEvenSquares(n, 2);
    }
}

private int sumOddNumbers(int n, int current) {
    if (current > n) { return 0; }
    return current + sumOddNumbers(n, current + 2);
}

private int sumEvenSquares(int n, int current) {
    if (current > n) { return 0; }
    return (current * current) + sumEvenSquares(n, current + 2);
}
```
n = 7
- 재귀 호출 과정:
1. sumOddNumbers(7, 1) → current = 1 → sumOddNumbers(7, 3)
2. sumOddNumbers(7, 3) → current = 3 → sumOddNumbers(7, 5)
3. sumOddNumbers(7, 5) → current = 5 → sumOddNumbers(7, 7)
4. sumOddNumbers(7, 7) → current = 7 → sumOddNumbers(7, 9)
5. sumOddNumbers(7, 9) → current = 9 (종료 조건: 9 > 7, 반환 0)
- 반환 과정:
1. sumOddNumbers(7, 9) → return 0
2. sumOddNumbers(7, 7) → 7 + 0 = 7 -> return 7
3. sumOddNumbers(7, 5) → 5 + 7 = 12 -> return 12
4. sumOddNumbers(7, 3) → 3 + 12 = 15 -> return 15
5. sumOddNumbers(7, 1) → 1 + 15 = 16 -> return 16

결과: 16
### Reference
[java 21 docs: IntStream.rangeClosed(int, int)](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/stream/IntStream.html#rangeClosed(int,int))      
[java 21 docs: IntStream.filter(IntPredicate](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/stream/IntStream.html#filter(java.util.function.IntPredicate))  
[java 21 docs: IntStream.sum](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/stream/IntStream.html#sum())