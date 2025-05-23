## 문자열을 정수로 변환하기

### 문제 설명
숫자로만 이루어진 문자열 `n_str`이 주어질 때, `n_str`을 정수로 변환하여 return 하도록 `solution` 함수를 완성해주세요.

---

### 제한사항
- $( 1 \leq \text{n_str 의 길이} \leq 5 )$
- `n_str`은 0부터 9까지의 정수 문자로만 이루어져 있습니다.

---

### 입출력 예

| n_str   | result |
|---------|--------|
| "10"    | 10     |
| "8542"  | 8542   |

---

### 입출력 예 설명

#### 예제 #1
- `"10"`을 정수로 바꾸면 10입니다.

#### 예제 #2
- `"8542"`를 정수로 바꾸면 8542입니다.
# 회고
### 다른 풀이 방법: charAt 과 (ASCII '0')
```java
public int solution(String n_str) {
    int result = 0;
    
    for (int i = 0; i < n_str.length(); i++) {
        result = result * 10 + (n_str.charAt(i) - '0');
    }
    
    return result;
}
```
### Reference 
[문자열 정수의 합](../문자열_정수의_합/Problem104.md)