# 수 조작하기 1
### 문제 설명
정수 `n`과 문자열 `control`이 주어집니다.  
`control`은 "w", "a", "s", "d"의 4개의 문자로 이루어져 있으며, `control`의 앞에서부터 순서대로 문자에 따라 `n`의 값을 바꿉니다.

- "w" : `n`이 1 커집니다.
- "s" : `n`이 1 작아집니다.
- "d" : `n`이 10 커집니다.
- "a" : `n`이 10 작아집니다.

위 규칙에 따라 `n`을 바꿨을 때 가장 마지막에 나오는 `n`의 값을 return 하는 solution 함수를 완성해 주세요.

### 제한사항
- -100,000 ≤ `n` ≤ 100,000
- 1 ≤ `control`의 길이 ≤ 100,000
- `control`은 알파벳 소문자 "w", "a", "s", "d"로 이루어진 문자열입니다.

### 입출력 예

| n   | control          | result |
|-----|------------------|--------|
| 0   | "wsdawsdassw"    | -1     |

### 입출력 예 설명
#### 입출력 예 #1
- 수 `n`은 `control`에 따라 다음과 같은 순서로 변하게 됩니다.
    - 0 → 1 → 0 → 10 → 0 → 1 → 0 → 10 → 0 → -1 → -2 → -1
- 따라서 -1을 return 합니다.
# 회고

| **특징**              | **기존 switch**                                                                                        | **새로운 switch (JDK 14 이상)**                                                   |
|---------------------|------------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------|
| **표현식(expression)** | - 반환값이 없었고, 값을 변경하려면 각 `case`마다 변수를 수정하는 **명령문(statement)** 방식으로 사용.                                 | - **표현식(expression)** 으로 사용 가능, 값을 반환하거나 바로 변수에 할당 가능.                       |
| **break 문의 제거**     | - `break`를 쓰지 않으면 **fall-through** 현상이 발생해 다음 `case`가 실행됨.  <br> - 각 `case`마다 `break`를 명시적으로 작성해야 함. | - `->` 기호로 **fall-through**를 방지. <br> - `break` 문 없이 명확하게 결과 반환 또는 명령 실행 가능. |
| **yield**           | - **`yield`** 없음.                                                                                    | - 여러 명령을 수행할 때 **`yield`** 를 사용하여 값을 반환할 수 있음.                               |

```java
private void test() {
    // JDK 14 이전
    int result = 0;
    switch (day) {
        case "MONDAY":
            result = 1;
            break;
        case "TUESDAY":
            result = 2;
            break;
        default:
            result = 0;
            break;
    }

    // JDK 14 이후
    int result = switch (day) {
        case "MONDAY" -> 1;
        case "TUESDAY" -> 2;
        default -> 0;
    };

    // 복잡한 연산의 경우
    int result = switch (operation) {
        case "ADD" -> {
            int sum = a + b;
            yield sum; 
        }
        case "SUBTRACT" -> a - b;
        default -> 0;
    };
}

```
### Reference
[java 21 docs: String.toCharArray()](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html#toCharArray())