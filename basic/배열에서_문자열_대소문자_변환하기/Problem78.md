## 배열에서 문자열 대소문자 변환하기

### 문제 설명
문자열 배열 `strArr`가 주어집니다.  
모든 원소가 알파벳으로만 이루어져 있을 때:
- 배열에서 **홀수번째 인덱스**의 문자열은 모든 문자를 **대문자**로 변환합니다.
- 배열에서 **짝수번째 인덱스**의 문자열은 모든 문자를 **소문자**로 변환합니다.

변환된 문자열 배열을 반환하는 `solution` 함수를 완성하세요.

---

### 제한사항
- $1 \leq \text{strArr의 길이} \leq 20$
- $1 \leq \text{strArr의 원소의 길이} \leq 20$
- `strArr`의 원소는 알파벳으로 이루어진 문자열입니다.

---

### 입출력 예

| `strArr`                    | `result`                    |
|-----------------------------|-----------------------------|
| `["AAA","BBB","CCC","DDD"]` | `["aaa","BBB","ccc","DDD"]` |
| `["aBc","AbC"]`             | `["abc","ABC"]`             |

---

### 입출력 예 설명

#### 예제 #1
- `strArr[0]`과 `strArr[2]`는 **짝수번째 인덱스**의 문자열이므로 모두 소문자로 변환합니다: `"aaa"`와 `"ccc"`.
- `strArr[1]`과 `strArr[3]`는 **홀수번째 인덱스**의 문자열이므로 모두 대문자로 변환합니다: `"BBB"`와 `"DDD"`.  
  따라서 `["aaa","BBB","ccc","DDD"]`를 반환합니다.

#### 예제 #2
- `strArr[0]`은 **짝수번째 인덱스**의 문자열이므로 소문자로 변환합니다: `"abc"`.
- `strArr[1]`은 **홀수번째 인덱스**의 문자열이므로 대문자로 변환합니다: `"ABC"`.  
  따라서 `["abc","ABC"]`를 반환합니다.
# 회고
### 다른 풀이 방법: Stream API
```java
import java.util.stream.IntStream;

public String[] solution(String[] strArr) {
    return IntStream.range(0, strArr.length)
            .mapToObj(i -> i % 2 == 1 ? strArr[i].toUpperCase() : strArr[i].toLowerCase())
            .toArray(String[]::new);
}
```