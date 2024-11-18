# 문자열의 뒤의 n글자

### 문제 설명
문자열 `my_string`과 정수 `n`이 매개변수로 주어질 때, **`my_string`의 뒤의 `n`글자**로 이루어진 문자열을 return 하는 `solution` 함수를 작성해 주세요.

---

### 제한사항
- `my_string`은 숫자와 알파벳으로 이루어져 있습니다.
- $1 \leq \text{my_string의 길이} \leq 1,000$
- $1 \leq n \leq \text{my_string의 길이}$

---

### 입출력 예

| my_string          | n    | result          |
|--------------------|------|-----------------|
| `"ProgrammerS123"` | `11` | `"grammerS123"` |
| `"He110W0r1d"`     | `5`  | `"W0r1d"`       |

---

### 입출력 예 설명

#### 예제 1
- 입력 문자열: `"ProgrammerS123"`, 길이: `14`
- 뒤의 `11`글자: `"grammerS123"`
- 따라서 `"grammerS123"`을 return 합니다.

#### 예제 2
- 입력 문자열: `"He110W0r1d"`, 길이: `10`
- 뒤의 `5`글자: `"W0r1d"`
- 따라서 `"W0r1d"`을 return 합니다.
# 회고
### 다른 방법: StringBuilder
```java
public String solution(String my_string, int n) {
    StringBuilder builder = new StringBuilder();

    for (int i = my_string.length() - n; i < my_string.length(); i++) {
        builder.append(my_string.charAt(i));
    }

    return builder.toString();
}
```
### Reference
[java 21 docs: String.substring(int)](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html#substring(int))