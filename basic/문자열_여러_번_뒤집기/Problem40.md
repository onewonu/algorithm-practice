# 문자열 여러 번 뒤집기

### 문제 설명
문자열 `my_string`과 이차원 정수 배열 `queries`가 매개변수로 주어집니다. `queries`의 원소는 `[s, e]` 형태로, `my_string`의 인덱스 `s`부터 인덱스 `e`까지를 뒤집으라는 의미입니다. `my_string`에 `queries`의 명령을 순서대로 처리한 후의 문자열을 return 하는 `solution` 함수를 작성해 주세요.

### 제한사항
- `my_string`은 영소문자로만 이루어져 있습니다.
- 1 ≤ `my_string`의 길이 ≤ 1,000
- `queries`의 원소는 `[s, e]`의 형태로 `0 ≤ s ≤ e < my_string`의 길이를 만족합니다.
- 1 ≤ `queries`의 길이 ≤ 1,000

### 입출력 예

| my_string     | queries                           | result        |
|---------------|-----------------------------------|---------------|
| "rermgorpsam" | [[2, 3], [0, 7], [5, 9], [6, 10]] | "programmers" |

### 입출력 예 설명

#### 예제 1
- 초기 `my_string`은 `"rermgorpsam"`입니다.
- 주어진 `queries`를 순서대로 처리하면 다음과 같습니다.

| queries | my_string     |
|---------|---------------|
| 초기 상태   | "rermgorpsam" |
| [2, 3]  | "remrgorpsam" |
| [0, 7]  | "progrmersam" |
| [5, 9]  | "prograsremm" |
| [6, 10] | "programmers" |

- 따라서 최종 결과는 `"programmers"`입니다.
# 회고
### 문자열 구간 뒤집기
> 예제 1: "remrgorpsam" -> [0, 7] | "progrmersam"

예제를 통해 유추할 수 있듯이, `[0, 7]`, `[1, 6]`, `[1, 5]`... 의 형태로 문자열을 뒤집고 있다. 이는 **구간 반전** 이라는 작업이 각 쿼리의 범위에 따라 순차적으로 이루어지고 있음을 보여준다.
### StringBuilder
```java
public String solution(String my_string, int[][] queries) {
    StringBuilder sb = new StringBuilder(my_string);

    for (int[] query : queries) {
        int start = query[0];
        int end = query[1] + 1;
        
        String reversedPart = new StringBuilder(sb.substring(start, end)).reverse().toString();
        sb.replace(start, end, reversedPart);
    }

    return sb.toString();
}
```
[java 21 docs: String.toCharArray()](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html#toCharArray())  
[java 21 docs: StringBuilder.substring(int,int)](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/StringBuilder.html#substring(int,int))  
[java 21 docs: StringBuilder.reverse()](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/StringBuilder.html#reverse())  
[java 21 docs: StringBuilder.replace(int,int,java.lang.String)](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/StringBuilder.html#replace(int,int,java.lang.String))