## 0 떼기

### 문제 설명
정수로 이루어진 문자열 `n_str`이 주어질 때, `n_str`의 가장 왼쪽에 처음으로 등장하는 0들을 뗀 문자열을 return 하도록 `solution` 함수를 완성해주세요.

---

### 제한사항
- $( 2 \leq \text{n_str 의 길이} \leq 10 )$
- `n_str`이 "0"으로만 이루어진 경우는 없습니다.

---

### 입출력 예

| n_str     | result   |
|-----------|----------|
| "0010"    | "10"     |
| "854020"  | "854020" |

---

### 입출력 예 설명

#### 예제 #1
- `"0010"`의 가장 왼쪽에 연속으로 등장하는 `"0"`을 모두 제거하면 `"10"`이 됩니다.

#### 예제 #2
- `"854020"`은 가장 왼쪽에 0이 없으므로 `"854020"`을 return 합니다.
# 회고
### 다른 풀이 방법: 정규식
```java
public String solution(String n_str) {
    return n_str.replaceFirst("^0+", "");
}
```
- ^ : 문자열의 시작
- 0+ : 하나 이상의 연속된 '0'
### 다른 풀이 방법: (숫자) 형변환 과정에서 앞의 0 제거되는 특성 활용
```java
public String solution(String n_str) {
    return String.valueOf(Integer.parseInt(n_str));
}
```
### Reference
[java 21 docs: String.replaceFirst(String)](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html#replaceFirst(java.lang.String,java.lang.String))