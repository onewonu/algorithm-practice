## 꼬리 문자열

---

### 문제 설명
문자열들이 담긴 리스트가 주어졌을 때, 모든 문자열들을 순서대로 합친 문자열을 **꼬리 문자열**이라고 합니다.  
꼬리 문자열을 만들 때 특정 문자열을 포함한 문자열은 제외시키려고 합니다.  
예를 들어:
- 문자열 리스트 `["abc", "def", "ghi"]`가 있고 문자열 `"ef"`를 포함한 문자열은 제외하고 꼬리 문자열을 만들면 `"abcghi"`가 됩니다.

문자열 리스트 `str_list`와 제외하려는 문자열 `ex`가 주어질 때,  
`str_list`에서 `ex`를 포함한 문자열을 제외하고 만든 꼬리 문자열을 return 하도록 `solution` 함수를 완성해주세요.

---

### 제한사항
- $(2 \leq \text{str_list 의 길이} \leq 10)$
- $(1 \leq \text{str_list 의 원소의 길이} \leq 10)$
- $(1 \leq \text{ex의 길이} \leq 5)$

---

### 입출력 예

| str_list               | ex    | result   |
|------------------------|-------|----------|
| ["abc", "def", "ghi"]  | "ef"  | "abcghi" |
| ["abc", "bbc", "cbc"]  | "c"   | ""       |

---

### 입출력 예 설명

#### 예제 #1
- 문자열 리스트 `["abc", "def", "ghi"]`에서 `"ef"`를 포함한 `"def"`를 제외하면 남는 문자열은 `"abcghi"`입니다.

#### 예제 #2
- 문자열 리스트 `["abc", "bbc", "cbc"]`의 모든 문자열이 `"c"`를 포함하므로 빈 문자열을 return 합니다.
# 회고
### 다른 풀이 방법: Stream API 
```java
public String solution(String[] str_list, String ex) {
    return Arrays.stream(str_list)
                 .filter(string -> !string.contains(ex))
                 .collect(Collectors.joining());
}
```