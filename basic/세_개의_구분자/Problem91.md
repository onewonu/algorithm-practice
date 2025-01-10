## 세 개의 구분자

### 문제 설명
임의의 문자열이 주어졌을 때 문자 `"a"`, `"b"`, `"c"`를 구분자로 사용해 문자열을 나누고자 합니다.

예를 들어 주어진 문자열이 `"baconlettucetomato"`라면 나눠진 문자열 목록은 `["onlettu", "etom", "to"]`가 됩니다.

문자열 `myStr`이 주어졌을 때 위 예시와 같이 `"a"`, `"b"`, `"c"`를 사용해 나눠진 문자열을 순서대로 저장한 배열을 return 하는 `solution` 함수를 완성해 주세요.

단, 두 구분자 사이에 다른 문자가 없을 경우에는 아무것도 저장하지 않으며, return할 배열이 빈 배열이라면 `["EMPTY"]`를 return 합니다.

---

### 제한사항
- $1 \leq \text{myStr의 길이} \leq 1,000,000$
- `myStr`은 알파벳 소문자로 이루어진 문자열입니다.

---

### 입출력 예

| myStr                  | result                      |
|------------------------|-----------------------------|
| `"baconlettucetomato"` | `["onlettu", "etom", "to"]` |
| `"abcd"`               | `["d"]`                     |
| `"cabab"`              | `["EMPTY"]`                 |

---

### 입출력 예 설명

#### 예제 #1
- 문제 설명의 예시와 같습니다.

#### 예제 #2
- `"c"` 이전에는 `"a"`, `"b"`, `"c"` 이외의 문자가 없습니다.
- `"c"` 이후에 문자열 `"d"`가 있으므로 `"d"`를 저장합니다.
- 따라서 `["d"]`를 return 합니다.

#### 예제 #3
- `"a"`, `"b"`, `"c"` 이외의 문자가 존재하지 않습니다.
- 따라서 저장할 문자열이 없습니다.
- 따라서 `["EMPTY"]`를 return 합니다.
# 회고
### 다른 풀이 방법: StringBuilder, indexOf
```java
public String[] solution(String myStr) {
    List<String> list = new ArrayList<>();
    StringBuilder builder = new StringBuilder();

    for (char c : myStr.toCharArray()) {
        if ("abc".indexOf(c) != -1) {
            if (builder.length() > 0) {
                list.add(builder.toString());
                builder.setLength(0);
            }
        } else {
            builder.append(c);
        }
    }

    if (builder.length() > 0) {
        list.add(builder.toString());
    }

    if (list.isEmpty()) {
        return new String[]{"EMPTY"};
    } else {
        return list.toArray(new String[0]);
    }
}
```
- 문자열을 직접 탐색하며 “abc”를 기준으로 나눔.
- 구분자가 등장하면 현재까지 저장된 문자열을 리스트에 추가.
### 다른 풀이 방법: split, regex (현재 풀이)
```java
 public String[] solution(String myStr) {
    String[] split = myStr.split("[abc]+");
    List<String> resultList = new ArrayList<>();

    for (String part : split) {
        if (!part.isEmpty()) {
            resultList.add(part);
        }
    }

    if (resultList.isEmpty()) {
        return new String[]{"EMPTY"};
    } else {
        return resultList.toArray(new String[0]);
    }
}
```
- "a", "b", "c"를 정규식 [abc]+로 표현.
- it 메서드로 문자열을 나눈 뒤 빈 문자열을 제거.

| 기호    | 설명                                 |
|-------|------------------------------------|
| `.`   | 임의의 한 문자 (줄바꿈 제외)                  |
| `*`   | 앞의 패턴이 0회 이상 반복                    |
| `+`   | 앞의 패턴이 1회 이상 반복                    |
| `?`   | 앞의 패턴이 0회 또는 1회 존재                 |
| `[]`  | 문자 집합: 대괄호 안에 있는 문자 중 하나와 매칭       |
| `[^]` | 부정 문자 집합: 대괄호 안에 없는 문자와 매칭         |
| `()`  | 그룹화: 특정 패턴을 그룹화하여 캡처 또는 연산 우선순위 조정 |
| `\`   | 이스케이프 문자: 메타 문자를 일반 문자로 취급         |
| `^`   | 문자열의 시작                            |
| `$`   | 문자열의 끝                             |

### 다른 풀이 방법: Stream API
```java
public String[] solution(String myStr) {
    String[] result = Arrays.stream(myStr.split("[abc]+"))
            .filter(part -> !part.isEmpty())
            .toArray(String[]::new);
    
    if (result.length == 0) {
        return new String[]{"EMPTY"};
    }
    return result;
}
```