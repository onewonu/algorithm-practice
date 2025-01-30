## 날짜 비교하기

---

### 문제 설명
정수 배열 `date1`과 `date2`가 주어집니다.  
각 배열은 `[year, month, day]` 형태로 날짜를 나타냅니다.

- `date1`이 `date2`보다 **앞서는 날짜**라면 `1`을 반환.
- 그렇지 않다면 `0`을 반환.

---

### 제한사항
- `date1.length == date2.length == 3`
- $( 0 \leq \text{year} \leq 10,000 )$
- $( 1 \leq \text{month} \leq 12 )$
- `day`는 `month`에 따라 가능한 날짜로 주어집니다.

---

### 입출력 예

| date1          | date2          | result |
|----------------|----------------|--------|
| [2021, 12, 28] | [2021, 12, 29] | 1      |
| [1024, 10, 24] | [1024, 10, 24] | 0      |

---

### 입출력 예 설명

#### 예제 #1
- `date1 = [2021, 12, 28]`, `date2 = [2021, 12, 29]`
- `date1`이 `date2`보다 하루 앞서므로 `1`을 반환.

#### 예제 #2
- `date1 = [1024, 10, 24]`, `date2 = [1024, 10, 24]`
- 두 날짜가 동일하므로 `0`을 반환.
# 회고
### 다른 풀이 방법: 명시적 조건
```java
public int solution(int[] date1, int[] date2) {
    if (date1[0] < date2[0]) {
        return 1;
    } else if (date1[0] > date2[0]) {
        return 0;
    } else if (date1[1] < date2[1]) {
        return 1;
    } else if (date1[1] > date2[1]) {
        return 0;
    } else if (date1[2] < date2[2]) {
        return 1;
    } else if (date1[2] > date2[2]) {
        return 0;
    }
    
    return 0;
}
```
### 다른 풀이 방법: LocalDate
```java
import java.time.LocalDate;

public int solution(int[] date1, int[] date2) {
    LocalDate d1 = LocalDate.of(date1[0], date1[1], date1[2]);
    LocalDate d2 = LocalDate.of(date2[0], date2[1], date2[2]);
    return d1.isBefore(d2) ? 1 : 0;
}
```