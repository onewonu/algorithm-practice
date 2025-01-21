## 문자열 정수의 합

### 문제 설명
한 자리 정수로 이루어진 문자열 `num_str`이 주어질 때, 각 자리수의 합을 return 하도록 `solution` 함수를 완성해주세요.

---

### 제한사항
- $( 3 \leq \text{num_str 의 길이} \leq 100 )$

---

### 입출력 예

| num_str       | result |
|---------------|--------|
| "123456789"   | 45     |
| "1000000"     | 1      |

---

### 입출력 예 설명

#### 예제 #1
- 문자열 안의 모든 숫자를 더하면 45가 됩니다.

#### 예제 #2
- 문자열 안의 모든 숫자를 더하면 1이 됩니다.
# 회고
### 다른 풀이 방법: parseInt (제한 사항 위반)
```java
public int solution(String num_str) {
    int answer = 0;
    int parseInt = Integer.parseInt(num_str);
    while (parseInt > 0) {
        answer += parseInt % 10;
        parseInt = parseInt / 10;
    }

    return answer;
}
```
- 마지막 자리수를 더하고, 그 숫자를 제거하는 과정을 반복
- Integer.parseInt 의 한계
  - Integer.parseInt 는 최대 10자리 숫자까지만 처리 가능.
  - 10 자리 초과 시 NumberFormatException
### ASCII '0'
Java 에서 char 타입은 **문자의 ASCII 값(유니코드 값)** 을 저장한다.
#### 아스키 코드 값과 변환 계산식 표
| Character | ASCII Code | 계산식         | 변환 계산식    | 결과 |
|-----------|------------|-------------|-----------|----|
| `'0'`     | 48         | -           | -         | -  |
| `'1'`     | 49         | `'1' - '0'` | `49 - 48` | 1  |
| `'2'`     | 50         | `'2' - '0'` | `50 - 48` | 2  |
| `'3'`     | 51         | `'3' - '0'` | `51 - 48` | 3  |
| `'4'`     | 52         | `'4' - '0'` | `52 - 48` | 4  |
| `'5'`     | 53         | `'5' - '0'` | `53 - 48` | 5  |
| `'6'`     | 54         | `'6' - '0'` | `54 - 48` | 6  |
| `'7'`     | 55         | `'7' - '0'` | `55 - 48` | 7  |
| `'8'`     | 56         | `'8' - '0'` | `56 - 48` | 8  |
| `'9'`     | 57         | `'9' - '0'` | `57 - 48` | 9  |

### 다른 풀이 방법: Stream API
```java
public int solution(String num_str) {
    return num_str.chars().map(c -> c - '0').sum();
}
```
### 다른 풀이 방법: split, parseInt
```java
public int solution(String num_str) {
    int answer = 0;
    for (String digit : num_str.split("")) {
        answer += Integer.parseInt(digit);
    }
    return answer;
}
```