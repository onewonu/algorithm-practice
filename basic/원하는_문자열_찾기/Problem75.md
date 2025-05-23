## 원하는 문자열 찾기

### 문제 설명
알파벳으로 이루어진 문자열 `myString`과 `pat`이 주어집니다.  
`myString`의 연속된 부분 문자열 중 `pat`이 존재하면 **1**을, 그렇지 않으면 **0**을 반환하는 함수를 작성하세요.

단, **알파벳 대소문자는 구분하지 않습니다.**

---

### 제한사항
- $1 \leq \text{myString의 길이} \leq 100,000$
- $1 \leq \text{pat의 길이} \leq 300$
- `myString`과 `pat`은 모두 알파벳으로 이루어진 문자열입니다.

---

### 입출력 예

| `myString`  | `pat`   | `return` |
|-------------|---------|----------|
| "AbCdEfG"   | "aBc"   | 1        |
| "aaAA"      | "aaaaa" | 0        |

---

### 입출력 예 설명

#### 예제 #1
- `myString = "AbCdEfG"`의 0~2번 인덱스의 문자열은 `"AbC"`이며, 이는 `pat = "aBc"`와 같습니다.  
  대소문자를 구분하지 않으므로 **1**을 반환합니다.

#### 예제 #2
- `myString = "aaAA"`의 길이가 `pat = "aaaaa"`보다 짧기 때문에 부분 문자열 중 같은 문자열이 존재할 수 없습니다.  
  따라서 **0**을 반환합니다.
# 회고
### Reference
[java 21 docs: String.contains()](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html#contains(java.lang.CharSequence))
