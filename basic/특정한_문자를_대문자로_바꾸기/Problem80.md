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
# 회고
### replace()
#### replace(CharSequence target, CharSequence replacement)
- isLatin1()를 통해 최적화된 Latin1 또는 UTF16 방식으로 처리.
- 길이가 1인 경우 replace(char, char)를 호출하여 단일 문자로 처리.
```java
public String solution(String my_string, String alp) {
    return my_string.replace(alp, alp.toUpperCase());
}

public String replace(CharSequence target, CharSequence replacement) {
  String trgtStr = target.toString();
  String replStr = replacement.toString();
  //...
}
```
#### replace(char oldChar, char newChar)
- 문자열의 char 배열(value)을 직접 탐색하여 대체를 수행.
```java
public String solution(String my_string, String alp) {
    char target = alp.charAt(0); 
    return my_string.replace(target, Character.toUpperCase(target));
}

public String replace(char oldChar, char newChar) {
  if (oldChar != newChar) {
    String ret = isLatin1() ? StringLatin1.replace(value, oldChar, newChar)
            : StringUTF16.replace(value, oldChar, newChar);
    if (ret != null) {
      return ret;
    }
  }
  return this;
}
```