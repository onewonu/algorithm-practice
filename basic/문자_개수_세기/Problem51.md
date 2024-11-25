# 문자 개수 세기

### 문제 설명
알파벳 대소문자로만 이루어진 문자열 `my_string`이 주어질 때, 다음 조건에 따라 문자열에서 각 문자의 개수를 세어 반환하는 함수 `solution`을 작성하세요:
- 'A'부터 'Z'까지의 알파벳 대문자 개수를 순서대로 세고,
- 'a'부터 'z'까지의 알파벳 소문자 개수를 순서대로 셉니다.

결과는 길이가 52인 정수 배열로 반환해야 합니다.

---

### 제한사항
- \( 1 \leq \text{my_string의 길이} \leq 1,000 \)

---

### 입출력 예

| my_string     | result                                                                                                                                                       |
|---------------|--------------------------------------------------------------------------------------------------------------------------------------------------------------|
| "Programmers" | [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 2, 0, 1, 0, 0, 3, 1, 0, 0, 0, 0, 0, 0, 0] |

---

### 입출력 예 설명

#### 예제 1
- 입력 문자열: "Programmers"
- 각 알파벳의 개수:
  - 대문자:
    - 'P'가 1개
  - 소문자:
    - 'a'가 1개
    - 'e'가 1개
    - 'g'가 1개
    - 'm'이 2개
    - 'o'가 1개
    - 'r'가 3개
    - 's'가 1개
- 결과 배열:
  \[
  [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 2, 0, 1, 0, 0, 3, 1, 0, 0, 0, 0, 0, 0, 0]
  \]
# 회고

### Reference
[ascii-code](https://www.ascii-code.com/)  
[java 21 docs: Character.isUpperCase(char)](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Character.html#isUpperCase(char))  
[java 21 docs: Character.isLowerCase(char)](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Character.html#isLowerCase(char))