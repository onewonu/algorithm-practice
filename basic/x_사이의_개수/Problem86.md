## x 사이의 개수

### 문제 설명
문자열 `myString`이 주어집니다. `myString`을 문자 `"x"`를 기준으로 나눴을 때 나눠진 문자열 각각의 길이를 순서대로 저장한 배열을 return 하는 `solution` 함수를 완성해 주세요.

---

### 제한사항
- $1 \leq \text{myString의 길이} \leq 100,000$
- `myString`은 알파벳 소문자로 이루어진 문자열입니다.

---

### 입출력 예

| myString         | result               |
|------------------|----------------------|
| `"oxooxoxxox"`   | `[1, 2, 1, 0, 1, 0]` |
| `"xabcxdefxghi"` | `[0, 3, 3, 3]`       |

---

### 입출력 예 설명

#### 예제 #1
- `"x"`를 기준으로 문자열을 나누면 `["o", "oo", "o", "", "o", ""]`가 됩니다.
- 각각의 길이로 배열을 만들면 `[1, 2, 1, 0, 1, 0]`입니다.
- 따라서 `[1, 2, 1, 0, 1, 0]`을 return 합니다.

#### 예제 #2
- `"x"`를 기준으로 문자열을 나누면 `["", "abc", "def", "ghi"]`가 됩니다.
- 각각의 길이로 배열을 만들면 `[0, 3, 3, 3]`입니다.
- 따라서 `[0, 3, 3, 3]`을 return 합니다.
# 회고
### 문자열 끝에 "x"가 있는 경우
```java
public int[] solution(String myString) {
    String[] xes = myString.split("x");
    int[] answer = new int[xes.length];

    for (int i = 0; i < xes.length; i++) {
        answer[i] = xes[i].length();
    }

    return answer;
}
```
- 입력 값 "oxooxoxxox" 에 대해 ["o", "oo", "o", "", "o"]가 반환.
- 문자열 끝에 "x"가 있는 경우 마지막 빈 문자열이 누락.
- 뒤쪽의 빈 문자열도 포함하기 위해 **split(regex, -1);**
### 다른 풀이 방법: Stream API
```java
import java.util.Arrays;

public int[] solution(String myString) {
    return Arrays.stream(myString.split("x", -1))
            .mapToInt(String::length)
            .toArray();
}
```
### Reference
[java 21 docs: split(String)](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html#split(java.lang.String))  
[java 21 docs: split(String, int)](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html#split(java.lang.String,int))
