### 그림 확대

---

### 문제 설명
1 × 1 크기의 **픽셀(문자)**로 이루어진 직사각형 그림이 문자열 배열 `picture`로 주어집니다.  
이를 **가로 및 세로로 `k`배 확대**한 새로운 그림을 반환하는 `solution` 함수를 구현하세요.

---

### 제한사항
- $( 1 \leq \text{picture 의 길이} \leq 20 )$ (행 개수)
- $( 1 \leq \text{picture 의 원소 길이} \leq 20 )$ (각 행의 문자 개수)
- **모든 `picture`의 원소 길이는 동일**
- `picture`의 원소는 `'.'`(빈 공간)과 `'x'`(채워진 픽셀)로만 구성됨.
- $( 1 \leq k \leq 10 )$

---

### 입출력 예

| picture                                                                                       | k | result                                                                                                                                                                                                                                                                                                                 |
|-----------------------------------------------------------------------------------------------|---|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| `[".xx...xx.", "x..x.x..x", "x...x...x", ".x.....x.", "..x...x..", "...x.x...", "....x...."]` | 2 | `["..xxxx......xxxx..", "..xxxx......xxxx..", "xx....xx..xx....xx", "xx....xx..xx....xx", "xx......xx......xx", "xx......xx......xx", "..xx..........xx..", "..xx..........xx..", "....xx......xx....", "....xx......xx....", "......xx..xx......", "......xx..xx......", "........xx........", "........xx........"]` |
| `["x.x", ".x.", "x.x"]`                                                                       | 3 | `["xxx...xxx", "xxx...xxx", "xxx...xxx", "...xxx...", "...xxx...", "...xxx...", "xxx...xxx", "xxx...xxx", "xxx...xxx"]`                                                                                                                                                                                                |

---

### 입출력 예 설명

#### **예제 #1**
##### **입력 그림 (`k = 2`)**
```text
.xx...xx.
x..x.x..x
x...x...x
.x.....x.
..x...x..
...x.x...
....x....
```
##### **출력 그림**
```text
..xxxx......xxxx..
..xxxx......xxxx..
xx....xx..xx....xx
xx....xx..xx....xx
xx......xx......xx
xx......xx......xx
..xx..........xx..
..xx..........xx..
....xx......xx....
....xx......xx....
......xx..xx......
......xx..xx......
........xx........
........xx........
```
---
#### **예제 #2**
##### **입력 그림 (`k = 3`)**
```text
x.x
.x.
x.x
```
##### **출력 그림**
```text
xxx...xxx
xxx...xxx
xxx...xxx
...xxx...
...xxx...
...xxx...
xxx...xxx
xxx...xxx
xxx...xxx
```
# 회고
### 행 우선 인덱싱(Row-Major Indexing)
- 반환 배열은 1차원 배열이며, 2차원 구조처럼 활용하기 위해 인덱스를 계산
> answer[i * k + j] = row;
- i: 원래 2차원 구조에서 행(row) 인덱스
- k: 확대 배율(한 줄을 몇 번 반복할 것인지)
- j: 현재 행을 몇 번째로 복사하는지 (0부터 k-1까지 반복)
### 다른 풀이 방법: StringJoiner
```java
import java.util.StringJoiner;

public class Solution {
    public String[] solution(String[] picture, int k) {
        String[] answer = new String[picture.length * k];

        for (int i = 0; i < picture.length; i++) {
            StringJoiner expandedRow = new StringJoiner("");
            
            for (char c : picture[i].toCharArray()) {
                expandedRow.add(String.valueOf(c).repeat(k));
            }
            
            String row = expandedRow.toString();
            for (int j = 0; j < k; j++) {
                answer[i * k + j] = row;
            }
        }
        return answer;
    }
}
```
### 다른 풀이 방법: ArrayList
```java
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<String> solution(String[] picture, int k) {
        List<String> answer = new ArrayList<>();

        for (String row : picture) {
            String expandedRow = row.repeat(k);

            for (int j = 0; j < k; j++) {
                answer.add(expandedRow);
            }
        }
        return answer;
    }
}
```
### 다른 풀이 방법: Stream API
```java
import java.util.stream.IntStream;

public class Solution {
    public String[] solution(String[] picture, int k) {
        return IntStream.range(0, picture.length * k)
                .mapToObj(i -> picture[i / k]
                        .chars()
                        .mapToObj(c -> String.valueOf((char) c).repeat(k))
                        .reduce("", String::concat))
                .toArray(String[]::new);
    }
}
```
### Reference
[java 21 docs: String.repeat(int)](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html#repeat(int))