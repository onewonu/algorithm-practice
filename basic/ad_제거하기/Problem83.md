## ad 제거하기

### 문제 설명
문자열 배열 `strArr`가 주어집니다. 배열 내의 문자열 중 `"ad"`라는 부분 문자열을 포함하고 있는 모든 문자열을 제거하고, 남은 문자열을 순서를 유지하여 배열로 반환하는 `solution` 함수를 완성하세요.

---

### 제한사항
- $1 \leq \text{strArr의 길이} \leq 1,000$
- $1 \leq \text{strArr의 원소의 길이} \leq 20$
- `strArr`의 원소는 **알파벳 소문자**로 이루어진 문자열입니다.

---

### 입출력 예

| strArr                          | result                          |
|---------------------------------|---------------------------------|
| `["and","notad","abcd"]`        | `["and","abcd"]`                |
| `["there","are","no","a","ds"]` | `["there","are","no","a","ds"]` |

---

### 입출력 예 설명

#### 예제 #1
- 1번 인덱스의 문자열 `"notad"`는 부분 문자열로 `"ad"`를 포함하고 있습니다.  
  따라서 해당 문자열을 제거하고 나머지는 순서를 유지하여 `["and","abcd"]`를 반환합니다.

#### 예제 #2
- `"ad"`가 부분 문자열로 포함된 문자열이 없으므로, 원래 배열을 그대로 반환합니다.

---

### 문제 해결
- 주어진 문자열 배열을 순회하며 각 문자열이 `"ad"`를 포함하지 않을 경우만 새로운 배열에 추가합니다.
# 회고 
### Stream API
```java
public String[] solution(String[] strArr) {
    return Arrays.stream(strArr)
                 .filter(s -> !s.contains("ad"))
                 .toArray(String[]::new);
}
```
### 배열 덮어 쓰기
```java
public String[] solution(String[] strArr) {
  int index = 0;
  for (String string : strArr) {
      if (!string.contains("ad")) {
          strArr[index++] = string;
      }
  }
  return Arrays.copyOf(strArr, index);
}
```
- 배열 내부에서 조건에 맞는 요소만 “앞으로 덮어쓰기”를 통해 남긴다.
- 새로운 배열을 생성하지 않아 공간 복잡도가 $O(1)$
- 반복 종료 후 유효한 요소만 포함된 배열을 반환하기 위해 Arrays.copyOf 사용.

  | 순서 | 현재 요소   | 조건 검사                         | 덮어쓰기                  | 배열 상태                    | index |
  |----|---------|-------------------------------|-----------------------|--------------------------|-------|
  | 1  | "and"   | "and".contains("ad") → false  | "and"을 strArr[0]에 저장  | ["and", "notad", "abcd"] | 1     |
  | 2  | "notad" | "notad".contains("ad") → true | 건너뜀                   | ["and", "notad", "abcd"] | 1     |
  | 3  | "abcd"  | "abcd".contains("ad") → false | "abcd"을 strArr[1]에 저장 | ["and", "abcd", "abcd"]  | 2     |