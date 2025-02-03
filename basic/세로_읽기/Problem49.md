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
# 회고
### 01 2차원 배열
```java
public String solution(String my_string, int m, int c) {
    int row = my_string.length() / m;
    int col = m;

    if (my_string.length() == row) return my_string;

    String[][] myStrings = new String[row][col];
    for (int i = 0; i < row; i++) {
        for (int j = 0; j < col; j++) {
            myStrings[i][j] = String.valueOf(my_string.charAt(i * col + j));
        }
    }

    StringBuilder builder = new StringBuilder();
    for (int i = 0; i < row; i++) builder.append(myStrings[i][c - 1]);
    return builder.toString();
}
```
### 02 논리적 2차원 배열
```java
public String solution(String my_string, int m, int c) {
    int row = my_string.length() / m;
    StringBuilder builder = new StringBuilder();
    
    for (int i = 0; i < row; i++) {
        int index = i * m + (c - 1);
        builder.append(my_string.charAt(index));
    }

    return builder.toString();
}
```
- 2차원 배열에서 특정 위치의 데이터를 1차원 배열로 변환
    - 1차원 인덱스 = (행 번호 × 한 행의 열 개수) + 열 번호
### i * m + (c - 1)
- i * m → i번째 행의 시작 위치를 찾음
- c - 1 → 해당 행에서 c번째 열의 문자를 가져오기 위해 열 위치를 찾음