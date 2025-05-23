## l 로 만들기

---

### 문제 설명
알파벳 소문자로 이루어진 문자열 `myString`이 주어집니다.  
알파벳 순서에서 `"l"`보다 앞서는 모든 문자를 `"l"`로 바꾼 문자열을 return 하는 `solution` 함수를 완성해 주세요.

---

### 제한사항
- $1 \leq \text{myString의 길이} \leq 100,000$
- `myString`은 알파벳 소문자로만 이루어져 있습니다.

---

### 입출력 예

| myString       | result         |
|----------------|----------------|
| `"abcdevwxyz"` | `"lllllvwxyz"` |
| `"jjnnllkkmm"` | `"llnnllllmm"` |

---

### 입출력 예 설명

#### **예제 #1**
- 인덱스 **0 ~ 4**의 문자 `"a","b","c","d","e"`는 **"l"보다 앞서는 문자**이므로 `"l"`로 변경됩니다.
- 그 외의 문자는 **"l"보다 앞서지 않는 문자**이므로 유지됩니다.
- 따라서 `"lllllvwxyz"`을 return 합니다.

#### **예제 #2**
- 인덱스 **0, 1, 6, 7**의 문자 `"j","j","k","k"`는 **"l"보다 앞서는 문자**이므로 `"l"`로 변경됩니다.
- 그 외의 문자는 **"l"보다 앞서지 않는 문자**이므로 유지됩니다.
- 따라서 `"llnnllllmm"`을 return 합니다.
# 회고
### 다른 풀이 방법: replaceAll
```java
public String solution(String myString) {
    return myString.replaceAll("[a-k]", "l");
}
```