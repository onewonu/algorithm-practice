## 문자열이 몇 번 등장하는지 세기

### 문제 설명
문자열 `myString`과 `pat`이 주어집니다. `myString`에서 `pat`이 등장하는 횟수를 return 하는 solution 함수를 완성해 주세요.

---

### 제한사항
- $1 \leq \text{myString의 길이} \leq 1000$
- $1 \leq \text{pat의 길이} \leq 10$

---

### 입출력 예

| `myString` | `pat`   | `result` |
|------------|---------|----------|
| `"banana"` | `"ana"` | `2`      |
| `"aaaa"`   | `"aa"`  | `3`      |

---

### 입출력 예 설명

#### 예제 #1
- `"banana"`에서:
  1. 1~3번 인덱스에서 `"ana"`가 한 번 등장.
  2. 3~5번 인덱스에서 `"ana"`가 또 한 번 등장.
- 총 두 번 등장하므로 `2`를 반환합니다.

#### 예제 #2
- `"aaaa"`에서:
  1. 0~2번 인덱스에서 `"aa"`가 한 번 등장.
  2. 1~3번 인덱스에서 `"aa"`가 또 한 번 등장.
  3. 2~4번 인덱스에서 `"aa"`가 또 한 번 등장.
- 총 세 번 등장하므로 `3`을 반환합니다.
# 회고
### indexOf(String str, int fromIndex)
- fromIndex 이후부터 문자열을 탐색.
- 찾는 문자열이 시작되는 첫 번째 인덱스를 반환.
- 특정 문자열이 없는 경우 -1을 반환.
### 다른 사람의 풀이: substring
```java
public int solution(String myString, String pat) {
    int cnt = 0;
    for (int i = 0; i < myString.length(); i++) {
        if (myString.substring(i).startsWith(pat)) {
            cnt++;
        }
    }
    return cnt;
}
```
- for 루프를 사용하여 문자열의 각 인덱스부터 시작하는 부분 문자열 생성, 각 부분 문자열이 pat 로 시작하는지 확인.
- 반복 마다 substring 을 호출하여 새로운 문자열을 생성하기 때문에 문자열의 길이에 따라 메모리 사용량이 증가할 수 있다.
### Reference 
[java 21 docs: String.indexOf(int, int)](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html#indexOf(int,int))