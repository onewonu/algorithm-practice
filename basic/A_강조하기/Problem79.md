## A 강조하기

### 문제 설명
문자열 `myString`이 주어집니다.  
`myString`에서 알파벳 `"a"`가 등장하면 전부 `"A"`로 변환하고,  
`"A"`가 아닌 모든 대문자 알파벳은 소문자 알파벳으로 변환하여 반환하는  
`solution` 함수를 완성하세요.

---

### 제한사항
- $1 \leq \text{myString의 길이} \leq 20$
- `myString`은 알파벳으로 이루어진 문자열입니다.

---

### 입출력 예

| myString             | result               |
|----------------------|----------------------|
| `"abstract algebra"` | `"AbstrAct AlgebrA"` |
| `"PrOgRaMmErS"`      | `"progrAmmers"`      |

---

### 입출력 예 설명

#### 예제 #1
- 0번, 5번, 9번, 15번 인덱스의 `"a"`는 소문자이므로 전부 대문자 `"A"`로 변환됩니다.
- 다른 문자들은 모두 `"a"`가 아닌 소문자이므로 변하지 않습니다.
- 결과적으로 `"AbstrAct AlgebrA"`가 반환됩니다.

#### 예제 #2
- `"PrOgRaMmErS"`:
  - 0번, 2번, 4번, 6번, 8번, 10번 인덱스의 문자들은 `"A"`가 아닌 대문자이므로 모두 소문자로 변환됩니다.
  - 5번 인덱스의 `"a"`는 소문자이므로 대문자 `"A"`로 변환됩니다.
  - 다른 문자들은 모두 `"a"`가 아닌 소문자이므로 변하지 않습니다.
- 결과적으로 `"progrAmmers"`가 반환됩니다.
# 회고
### 요구사항 정리
- "A" 가 아닌 모든 대문자 알파벳은 소문자 알파벳으로 변환.
- "a" 가 등장하면 전부 "A" 로 변환.
  - 해당 요구사항을 먼저 충족 시키는 것 보다, 모든 문자를 소문자로 변환.
### Reference
[java 21 docs: String.replace(char,char)](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html#replace(char,char))