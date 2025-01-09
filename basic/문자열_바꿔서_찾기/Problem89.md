## 문자열 바꿔서 찾기

### 문제 설명
문자 `"A"`와 `"B"`로 이루어진 문자열 `myString`과 `pat`가 주어집니다.  
`myString`의 `"A"`를 `"B"`로, `"B"`를 `"A"`로 바꾼 문자열의 연속하는 부분 문자열 중 `pat`이 있으면 `1`을, 아니면 `0`을 return 하는 `solution` 함수를 완성하세요.

---

### 제한사항
- $1 \leq \text{myString의 길이} \leq 100$
- $1 \leq \text{pat의 길이} \leq 10$
- `myString`과 `pat`는 문자 `"A"`와 `"B"`로만 이루어진 문자열입니다.

---

### 입출력 예

| myString  | pat      | result |
|-----------|----------|--------|
| `"ABBAA"` | `"AABB"` | `1`    |
| `"ABAB"`  | `"ABAB"` | `0`    |

---

### 입출력 예 설명

#### 예제 #1
- `"ABBAA"`에서 `"A"`와 `"B"`를 서로 바꾸면 `"BAABB"`입니다.
- 여기에는 부분 문자열 `"AABB"`가 있기 때문에 `1`을 return 합니다.

#### 예제 #2
- `"ABAB"`에서 `"A"`와 `"B"`를 서로 바꾸면 `"BABA"`입니다.
- 여기에는 부분 문자열 `"BABA"`가 없기 때문에 `0`을 return 합니다.
# 회고
### 다른 풀이 방법: replace
```java
public int solution(String myString, String pat) {
    String transformed = myString.replace('A', 'X')
                                 .replace('B', 'A')
                                 .replace('X', 'B');
    return transformed.contains(pat) ? 1 : 0;
}
```
**임시 저장 문자: 변환 중 중복 처리를 방지하기 위해.**
- ex) "ABBAA"
  1. 'A' → 'B': 결과 = "BBBAA"
  2. 'B' → 'A': 결과 = "AAAAA"
- ex) "ABBAA"
  1. 'A' → 'X': 결과 = "XBBXX"
  2. 'B' → 'A': 결과 = "XAAXX"
  3. 'X' → 'B': 결과 = "BAABB"
### Reference
[java 21 docs: contains(CharSequence)](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html#contains(java.lang.CharSequence))
[java 21 docs: CharSequence](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/CharSequence.html)
[java 21 docs: replace(char,char)](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html#replace(char,char))