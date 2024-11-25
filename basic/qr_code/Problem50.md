# QR Code

### 문제 설명
두 정수 `q`, `r`과 문자열 `code`가 주어질 때, `code`의 각 인덱스를 `q`로 나누었을 때 나머지가 `r`인 위치의 문자를 앞에서부터 순서대로 이어 붙인 문자열을 return 하는 `solution` 함수를 작성해 주세요.

---

### 제한사항
- \( 0 \leq r < q \leq 20 \)
- \( r < \text{code의 길이} \leq 1,000 \)
- `code`는 영소문자로만 이루어져 있습니다.

---

### 입출력 예

| q  | r  | code                | result         |
|----|----|---------------------|----------------|
| 3  | 1  | "qjnwezgrpirldywt"  | "jerry"        |
| 1  | 0  | "programmers"       | "programmers"  |

---

### 입출력 예 설명

#### **예제 1**
- 입력: \( q = 3, r = 1, \text{code} = "qjnwezgrpirldywt" \)
- 인덱스와 그 값을 `q`로 나눈 나머지:

  | index | 0 | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 | 10 | 11 | 12 | 13 | 14 | 15 |
  |-------|---|---|---|---|---|---|---|---|---|---|----|----|----|----|----|----|
  | code  | q | j | n | w | e | z | g | r | p | i | r  | l  | d  | y  | w  | t  |
  | 나머지   | 0 | 1 | 2 | 0 | 1 | 2 | 0 | 1 | 2 | 0 | 1  | 2  | 0  | 1  | 2  | 0  |

- 나머지가 `1`인 문자들을 추출하면 "jerry"입니다.

#### **예제 2**
- 입력: \( q = 1, r = 0, \text{code} = "programmers" \)
- 인덱스와 그 값을 `q`로 나눈 나머지:

  | index | 0 | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 | 10 |
  |-------|---|---|---|---|---|---|---|---|---|---|----|
  | code  | p | r | o | g | r | a | m | m | e | r | s  |
  | 나머지   | 0 | 0 | 0 | 0 | 0 | 0 | 0 | 0 | 0 | 0 | 0  |

- 나머지가 `0`인 모든 문자를 추출하면 "programmers"입니다.
# 회고 
### 01 조건 명시
```java
public String solution(int q, int r, String code) {
    StringBuilder answer = new StringBuilder();
    for (int i = 0; i < code.length(); i++) {
        if (i % q == r) answer.append(code.charAt(i));
    }
    
    return answer.toString();
}
```
### 02 조건 제거 후 반복문에서 조건 처리
```java
public String solution(int q, int r, String code) {
    StringBuilder answer = new StringBuilder();
    for (int i = r; i < code.length(); i += q) answer.append(code.charAt(i));
    return answer.toString();
}
```
- if (i % q == r)
  - i를 q로 나누었을 때, 나머지가 r인 인덱스만 처리하겠다는 뜻.

**if (i % q == r) 조건을 매번 검사하지 않으려면, 루프 자체가 조건을 만족하는 인덱스만 순회해야한다.**
- for (int i = r; i < code.length(); i += q)
  - 루프의 시작점: 나머지가 r인 첫 번째 인덱스에서 시작.
  - 루프의 증가량: q씩 증가하여 항상 나머지가 r인 인덱스만 순회.