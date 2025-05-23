## 두 수의 합

### 문제 설명
0 이상의 두 정수가 문자열 `a`, `b`로 주어질 때, $( a + b )$ 의 값을 문자열로 return 하는 `solution` 함수를 작성해 주세요.

---

### 제한사항
- $( 1 \leq \text{a의 길이} \leq 100,000 )$
- $( 1 \leq \text{b의 길이} \leq 100,000 )$
- `a`와 `b`는 숫자로만 이루어져 있습니다.
- `a`와 `b`는 정수 `0`이 아니라면 `0`으로 시작하지 않습니다.

---

### 입출력 예

| a                      | b                       | result                  |
|------------------------|-------------------------|-------------------------|
| "582"                  | "734"                   | "1316"                  |
| "18446744073709551615" | "287346502836570928366" | "305793246910280479981" |
| "0"                    | "0"                     | "0"                     |

---

### 입출력 예 설명

#### 예제 #1
- `a = "582"`, `b = "734"`이고 $( 582 + 734 = 1316 )$ 입니다.
- 따라서 `"1316"`을 return 합니다.

#### 예제 #2
- `a = "18446744073709551615"`, `b = "287346502836570928366"`이고 $( 18446744073709551615 + 287346502836570928366 = 305793246910280479981 )$ 입니다.
- 따라서 `"305793246910280479981"`을 return 합니다.

#### 예제 #3
- `a = "0"`, `b = "0"`이고 $( 0 + 0 = 0 )$ 입니다.
- 따라서 `"0"`을 return 합니다.
# 회고
### 두 숫자가 주어졌을 때, 그 합을 계산하는 것이지만 숫자 타입(int, long)의 한계를 초과하는 입력값을 처리
- int 
  - 32 bit (4 byte)
  - -2,147,483,648 ~ 2,147,483,647 ($2^{32}$)
  - $-2^{31}$ 에서  $2^{31} - 1$ 까지
- long
  - 32 bit (8 byte)
  - -9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807 ($2^{64}$)
  - $-2^{63}$ 에서  $2^{63} - 1$ 까지 
### 코드 및 로직 개선
- 고정된 방식의 repeat 사용법 개선
  - 문자열 길이를 맞추는 동작을 동적으로 처리하고, 코드 재사용성을 위해 메서드 분리
- 요소를 가져오는 부분에서 불필요한 조건문 제거
  - 불필요한 조건문을 제거하고 간결한 코드로 변경
  - charAt을 활용하여 자리 값을 바로 추출
- 최종 자리 올림(carry) 처리 추가
- 문자열 길이 맞추기 로직을 분리 
- 반복문 내부 가독성을 높임
### 다른 풀이 방법: BigInteger
```java
import java.math.BigInteger;

public String solution(String a, String b) {
    BigInteger numA = new BigInteger(a);
    BigInteger numB = new BigInteger(b);

    return numA.add(numB).toString();
}
```
### 다른 풀이 방법: 두개의 포인터
```java
public String solution(String a, String b) {
    StringBuilder result = new StringBuilder();
    int carry = 0;

    int i = a.length() - 1;
    int j = b.length() - 1;

    while (i >= 0 || j >= 0 || carry > 0) {
        int digitA = (i >= 0) ? a.charAt(i--) - '0' : 0;
        int digitB = (j >= 0) ? b.charAt(j--) - '0' : 0;

        int sum = digitA + digitB + carry;
        carry = sum / 10;
        result.append(sum % 10);
    }

    return result.reverse().toString();
}
```
### Reference 
[java 21 docs: String.repeat(int)](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html#repeat(int))
