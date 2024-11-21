# 세로 읽기

### 문제 설명
문자열 `my_string`과 두 정수 `m`, `c`가 주어집니다.  
`my_string`을 한 줄에 `m` 글자씩 가로로 적었을 때, **왼쪽부터 세로로 `c`번째 열에 적힌 글자들**을 문자열로 반환하는 `solution` 함수를 작성하세요.

---

### 제한사항
- `my_string`은 영소문자로 이루어져 있습니다.
- \( 1 \leq m \leq \text{my_string의 길이} \leq 1,000 \)
- `m`은 `my_string` 길이의 약수로만 주어집니다.
- \( 1 \leq c \leq m \)

---

### 입출력 예

| my_string                | m | c | result          |
|--------------------------|---|---|-----------------|
| `"ihrhbakrfpndopljhygc"` | 4 | 2 | `"happy"`       |
| `"programmers"`          | 1 | 1 | `"programmers"` |

---

### 입출력 예 설명

#### 예제 1
- `my_string = "ihrhbakrfpndopljhygc"`, `m = 4`, `c = 2`.
- `my_string`을 한 줄에 4글자씩 적으면 다음과 같습니다:

| 1열 | 2열 | 3열 | 4열 |
|----|----|----|----|
| i  | h  | r  | h  |
| b  | a  | k  | r  |
| f  | p  | n  | d  |
| o  | p  | l  | j  |
| h  | y  | g  | c  |

- `2열`의 글자: `"happy"`.
- 따라서 `"happy"`를 반환합니다.

#### 예제 2
- 예제 2번의 my_string 은 m이 1이므로 세로로 "programmers"를 적는 것과 같고 따라서 1열에 적힌 글자를 세로로 읽으면 programmers 입니다.  
따라서 "programmers"를 return 합니다.