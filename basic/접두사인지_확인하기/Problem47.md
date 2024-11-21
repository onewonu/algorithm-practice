# 접두사인지 확인하기

### 문제 설명
어떤 문자열에 대해서 **접두사**는 특정 인덱스까지의 문자열을 의미합니다.  
예를 들어, `"banana"`의 모든 접두사는 `"b"`, `"ba"`, `"ban"`, `"bana"`, `"banan"`, `"banana"`입니다.

문자열 `my_string`과 `is_prefix`가 주어질 때:
- `is_prefix`가 `my_string`의 접두사라면 `1`을 반환.
- 그렇지 않다면 `0`을 반환하는 `solution` 함수를 작성하세요.

---

### 제한사항
- \(1 \leq \text{my_string의 길이} \leq 100\)
- \(1 \leq \text{is_prefix의 길이} \leq 100\)
- `my_string`과 `is_prefix`는 영소문자로만 이루어져 있습니다.

---

### 입출력 예

| my_string  | is_prefix   | result |
|------------|-------------|--------|
| `"banana"` | `"ban"`     | `1`    |
| `"banana"` | `"nan"`     | `0`    |
| `"banana"` | `"abcd"`    | `0`    |
| `"banana"` | `"bananan"` | `0`    |

---

### 입출력 예 설명

#### 예제 1
- `"ban"`은 `"banana"`의 접두사이므로 `1`을 반환합니다.

#### 예제 2
- `"nan"`은 `"banana"`의 접두사가 아니므로 `0`을 반환합니다.

#### 예제 3
- `"abcd"`는 `"banana"`의 접두사가 아니므로 `0`을 반환합니다.

#### 예제 4
- `"bananan"`은 `"banana"`보다 길기 때문에 접두사가 될 수 없으므로 `0`을 반환합니다.