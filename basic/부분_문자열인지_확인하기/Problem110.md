## 부분 문자열인지 확인하기

---

### 문제 설명
부분 문자열이란 문자열에서 **연속된 일부분**에 해당하는 문자열을 의미합니다. 예를 들어:
- 문자열 `"ana"`, `"ban"`, `"anana"`, `"banana"`, `"n"`는 모두 문자열 `"banana"`의 부분 문자열입니다.
- `"aaa"`, `"bnana"`, `"wxyz"`는 모두 `"banana"`의 부분 문자열이 아닙니다.

문자열 `my_string`과 `target`이 매개변수로 주어질 때, `target`이 문자열 `my_string`의 부분 문자열이라면 `1`을, 아니라면 `0`을 return 하는 `solution` 함수를 작성해 주세요.

---

### 제한사항
- $(1 \leq \text{my_string 의 길이} \leq 100)$
- `my_string`은 영소문자로만 이루어져 있습니다.
- $(1 \leq \text{target 의 길이} \leq 100)$
- `target`은 영소문자로만 이루어져 있습니다.

---

### 입출력 예

| my_string | target  | result |
|-----------|---------|--------|
| "banana"  | "ana"   | 1      |
| "banana"  | "wxyz"  | 0      |

---

### 입출력 예 설명

#### 예제 #1
- `"ana"`는 문자열 `"banana"`의 부분 문자열이므로, `1`을 return 합니다.

#### 예제 #2
- `"wxyz"`는 문자열 `"banana"`의 부분 문자열이 아니므로, `0`을 return 합니다.