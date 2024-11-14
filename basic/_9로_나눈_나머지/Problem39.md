# 9로 나눈 나머지

### 문제 설명
음이 아닌 정수를 9로 나눈 나머지는 그 정수의 각 자리 숫자의 합을 9로 나눈 나머지와 같다는 것이 알려져 있습니다. 이 사실을 이용하여 음이 아닌 정수가 문자열 `number`로 주어질 때, 이 정수를 9로 나눈 나머지를 return 하는 `solution` 함수를 작성해주세요.

### 제한사항
- 1 ≤ `number`의 길이 ≤ 100,000
- `number`의 원소는 숫자로만 이루어져 있습니다.
- `number`는 정수 0이 아니라면 숫자 '0'으로 시작하지 않습니다.

### 입출력 예

| number                 | result |
|------------------------|--------|
| "123"                  | 6      |
| "78720646226947352489" | 2      |

### 입출력 예 설명

#### 입출력 예 #1
- 예제 1번의 `number`는 123으로, 각 자리 숫자의 합은 6입니다. 6을 9로 나눈 나머지는 6이고, 실제로 123 = 9 × 13 + 6이므로 6을 return 합니다.

#### 입출력 예 #2
- 예제 2번의 `number`는 78720646226947352489로, 각 자리 숫자의 합은 101입니다. 101을 9로 나눈 나머지는 2이고, 실제로 78720646226947352489 = 9 × 8746738469660816943 + 2이므로 2를 return 합니다.
# 회고
### ASCII
일반적으로 문자 '0'부터 '9'까지의 char 값은 ASCII 코드로 표현되기 때문에, 문자 '0'을 빼서 숫자로 변환할 수 있다.
### Stream
```java
public int solution(String number) {
    return number.chars().map(c -> c - '0').sum() % 9;
}
```
### Reference
[java 21 docs: String.toCharArray()](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html#toCharArray())  