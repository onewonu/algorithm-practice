# 문자열 뒤집기

### 문제 설명
문자열 `my_string`과 정수 `s`, `e`가 매개변수로 주어질 때,  
`my_string`에서 **인덱스 `s`부터 인덱스 `e`까지를 뒤집은 문자열**을 return 하는 `solution` 함수를 작성하세요.

---

### 제한사항
- `my_string`은 숫자와 알파벳으로만 이루어져 있습니다.
- \(1 \leq \text{my_string의 길이} \leq 1,000\)
- \(0 \leq s \leq e < \text{my_string의 길이}\)

---

### 입출력 예

| my_string           | s   | e    | result              |
|---------------------|-----|------|---------------------|
| `"Progra21Sremm3"`  | `6` | `12` | `"ProgrammerS123"`  |
| `"Stanley1yelnatS"` | `4` | `10` | `"Stanley1yelnatS"` |

---

### 입출력 예 설명

#### 예제 1
- `my_string = "Progra21Sremm3"`, `s = 6`, `e = 12`.
- `my_string`의 인덱스 6부터 12까지를 뒤집은 결과는 `"ProgrammerS123"`입니다.

#### 예제 2
- `my_string = "Stanley1yelnatS"`, `s = 4`, `e = 10`.
- 뒤집은 구간의 결과가 원래 문자열과 동일하므로 `"Stanley1yelnatS"`를 반환합니다.
# 회고
### Solution01: temp(원본 문자열에서 범위 뒤집기)
```java
public String solution(String my_string, int s, int e) {
    char[] charArray = my_string.toCharArray();
    while (s < e) {
        char temp = charArray[s];
        charArray[s] = charArray[e];
        charArray[e] = temp;
        s++;
        e--;
    }

    return new String(charArray);
}
```
- 문자열을 **문자 배열(char[])**로 변환한 뒤, 지정된 범위(s에서 e)의 문자를 양 끝에서부터 교환하여 뒤집는다.
- 뒤집기가 완료된 배열을 다시 문자열로 변환하여 반환.
### Solution02: substring(int, int), StringBuilder
```java
public String solution(String my_string, int s, int e) {
    String before = my_string.substring(0, s);
    String after = my_string.substring(e + 1);
    
    String substring = my_string.substring(s, e + 1);
    StringBuilder reverse = new StringBuilder(substring).reverse();
    
    return before + reverse + after;
}
```
substring 메서드를 사용하여 문자열을 3부분으로 나눈다음 합쳐 반환.
1.	뒤집기 전의 부분 (before).
2.	뒤집을 범위 (substring).
3.	뒤집기 후의 부분 (after).
### Reference
[java 21 docs: ]()