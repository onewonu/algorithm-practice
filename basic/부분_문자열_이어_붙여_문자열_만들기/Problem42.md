# 부분 문자열 이어 붙여 문자열 만들기

### 문제 설명
길이가 같은 문자열 배열 `my_strings`와 이차원 정수 배열 `parts`가 매개변수로 주어집니다. 
`parts[i]`는 `[s, e]` 형태로, `my_strings[i]`의 **인덱스 `s`부터 인덱스 `e`까지의 부분 문자열**을 의미합니다. 
각 `my_strings`의 원소에서 `parts`에 해당하는 부분 문자열을 순서대로 이어 붙인 문자열을 return 하는 `solution` 함수를 작성하세요.

### 제한사항
- $1 \leq \text{my_strings의 길이} = \text{parts의 길이} \leq 100$
- $1 \leq \text{my_strings의 원소의 길이} \leq 100$
- `parts[i]`를 $[s, e]$라 할 때:
    - $0 \leq s \leq e < \text{my_strings[i]의 길이}$

### 입출력 예

| my_strings                                              | parts                              | result          |
|---------------------------------------------------------|------------------------------------|-----------------|
| `["progressive", "hamburger", "hammer", "ahocorasick"]` | `[[0, 4], [1, 2], [3, 5], [7, 7]]` | `"programmers"` |

### 입출력 예 설명

#### 예제 1
입력 데이터를 보기 좋게 정리하면 다음과 같습니다:

| i | my_strings[i]   | parts[i] | 부분 문자열    |
|---|-----------------|----------|-----------|
| 0 | `"progressive"` | `[0, 4]` | `"progr"` |
| 1 | `"hamburger"`   | `[1, 2]` | `"am"`    |
| 2 | `"hammer"`      | `[3, 5]` | `"mer"`   |
| 3 | `"ahocorasick"` | `[7, 7]` | `"s"`     |

- 각 `parts[i]`에 해당하는 부분 문자열을 추출하고, 이를 순서대로 이어 붙이면 `"programmers"`가 됩니다.

결과적으로 `"programmers"`를 return 합니다.