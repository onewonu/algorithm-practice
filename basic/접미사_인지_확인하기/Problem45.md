# 접미사인지 확인하기

### 문제 설명
어떤 문자열에 대해서 **접미사**는 특정 인덱스부터 시작하는 문자열을 의미합니다.  
예를 들어, `"banana"`의 모든 접미사는 다음과 같습니다:
- `"banana"`, `"anana"`, `"nana"`, `"ana"`, `"na"`, `"a"`

문자열 `my_string`과 `is_suffix`가 주어질 때, **`is_suffix`가 `my_string`의 접미사**라면 `1`을, 아니면 `0`을 return 하는 `solution` 함수를 작성하세요.

---

### 제한사항
- $1 \leq \text{my_string의 길이} \leq 100$
- $1 \leq \text{is_suffix의 길이} \leq 100$
- `my_string`과 `is_suffix`는 영소문자로만 이루어져 있습니다.

---

### 입출력 예

| my_string  | is_suffix   | result |
|------------|-------------|--------|
| `"banana"` | `"ana"`     | `1`    |
| `"banana"` | `"nan"`     | `0`    |
| `"banana"` | `"wxyz"`    | `0`    |
| `"banana"` | `"abanana"` | `0`    |

---

### 입출력 예 설명

#### 예제 1
- `is_suffix = "ana"`는 `my_string = "banana"`의 접미사에 포함되므로, `1`을 return 합니다.

#### 예제 2
- `is_suffix = "nan"`은 `my_string = "banana"`의 접미사가 아니므로, `0`을 return 합니다.

#### 예제 3
- `is_suffix = "wxyz"`는 `my_string = "banana"`의 접미사가 아니므로, `0`을 return 합니다.

#### 예제 4
- `is_suffix = "abanana"`는 `my_string = "banana"`보다 길기 때문에 접미사가 될 수 없습니다. 따라서, `0`을 return 합니다.
# 회고
### endsWith
> **Method Signature**  
> public boolean startsWith(String prefix)
```java
public boolean startsWith(String prefix) { return startsWith(prefix, 0); }
public boolean endsWith(String suffix) { return startsWith(suffix, length() - suffix.length()); }
```
- startsWith(String prefix)
    - 호출 문자열(this)의 0번 인덱스부터 시작해서 **prefix**와 비교.
    - 내부적으로 startsWith(String prefix, int toffset)를 호출하며, toffset은 항상 0.
- endsWith(String suffix)
    - 호출 문자열(this)의 끝부분에서 suffix.length()만큼의 문자열을 suffix와 비교.
    - 내부적으로 startsWith(String prefix, int toffset)를 호출하며, toffset은 length() - suffix.length().
### Reference
[java 21 docs: String.endsWith(String)](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html#endsWith(java.lang.String))