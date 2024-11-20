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
> public boolean endsWith(String suffix)
- 현재 문자열의 길이(this.length())가 접미사 길이(suffix.length())보다 짧으면 **false**를 반환.
- 접미사 길이만큼 문자열의 끝부분을 **substring 또는 startsWith**로 비교.
### Reference
[java 21 docs: String.endsWith(String)](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html#endsWith(java.lang.String))