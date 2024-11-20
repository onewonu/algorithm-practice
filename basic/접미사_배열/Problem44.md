# 접미사 배열

### 문제 설명
어떤 문자열에 대해서 **접미사**는 특정 인덱스부터 시작하는 문자열을 의미합니다.  
예를 들어, `"banana"`의 모든 접미사는 다음과 같습니다:
- `"banana"`, `"anana"`, `"nana"`, `"ana"`, `"na"`, `"a"`

문자열 `my_string`이 매개변수로 주어질 때, `my_string`의 모든 접미사를 **사전순으로 정렬**한 문자열 배열을 return 하는 `solution` 함수를 작성하세요.

---

### 제한사항
- `my_string`은 알파벳 소문자로만 이루어져 있습니다.
- $1 \leq \text{my_string의 길이} \leq 100$

---

### 입출력 예

| my_string       | result                                                                                                           |
|-----------------|------------------------------------------------------------------------------------------------------------------|
| `"banana"`      | `["a", "ana", "anana", "banana", "na", "nana"]`                                                                  |
| `"programmers"` | `["ammers", "ers", "grammers", "mers", "mmers", "ogrammers", "programmers", "rammers", "rogrammers", "rs", "s"]` |

---

### 입출력 예 설명

#### 예제 1
- 입력 문자열: `"banana"`
- 모든 접미사: `"banana"`, `"anana"`, `"nana"`, `"ana"`, `"na"`, `"a"`
- 사전순 정렬 결과: `["a", "ana", "anana", "banana", "na", "nana"]`

#### 예제 2
- 입력 문자열: `"programmers"`
- 모든 접미사: `"programmers"`, `"rogrammers"`, `"ogrammers"`, `"grammers"`, `"rammers"`, `"ammers"`, `"mmers"`, `"mers"`, `"ers"`, `"rs"`, `"s"`
- 사전순 정렬 결과: `["ammers", "ers", "grammers", "mers", "mmers", "ogrammers", "programmers", "rammers", "rogrammers", "rs", "s"]`
# 회고
### substring()
**주어진 문자열에서 index 위치부터 끝까지의 문자열을 반환한다.**
- 동일한 사용방법
  - substring(i, my_string.length())
  - substring(i)
# Reference
[java 21 docs: String.substring(int)](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html#substring(int))  
[java 21 docs: Arrays.sort(Object[])](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/Arrays.html#sort(java.lang.Object[]))