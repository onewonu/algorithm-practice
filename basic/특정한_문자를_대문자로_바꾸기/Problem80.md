## 특정한 문자를 대문자로 바꾸기

### 문제 설명
영소문자로 이루어진 문자열 `my_string`과 영소문자 1글자로 이루어진 문자열 `alp`가 매개변수로 주어질 때, `my_string`에서 `alp`에 해당하는 모든 글자를 대문자로 바꾼 문자열을 return 하는 `solution` 함수를 작성해 주세요.

---

### 제한사항
- $1 \leq \text{my_string의 길이} \leq 1,000$

---

### 입출력 예

| my_string     | alp | result        |
|---------------|-----|---------------|
| "programmers" | "p" | "Programmers" |
| "lowercase"   | "x" | "lowercase"   |

---

### 입출력 예 설명

#### 예제 #1
- `my_string`이 "programmers"이고, `alp`가 "p"이므로 "p"를 대문자인 "P"로 변환한 "Programmers"를 return 합니다.

#### 예제 #2
- `alp`가 "x"이지만, `my_string`에 "x"는 없습니다. 따라서 "lowercase"를 그대로 return 합니다.