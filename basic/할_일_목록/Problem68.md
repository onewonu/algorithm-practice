## 할 일 목록

### 문제 설명
오늘 해야 할 일이 담긴 문자열 배열 `todo_list`와 각각의 일을 지금 마쳤는지를 나타내는 boolean 배열 `finished`가 매개변수로 주어질 때, `todo_list`에서 **아직 마치지 못한 일들**을 순서대로 담은 문자열 배열을 return하는 solution 함수를 작성하세요.

---

### 제한사항
- $1 \leq \text{todo_list의 길이} \leq 100$
- $2 \leq \text{todo_list의 원소의 길이} \leq 20$
- `todo_list`의 원소는 영소문자로만 이루어져 있습니다.
- `todo_list`의 원소는 모두 서로 다릅니다.
- `finished[i]`는 `true` 또는 `false`이며:
   - `true`: `todo_list[i]`를 마쳤음을 나타냅니다.
   - `false`: 아직 마치지 못했음을 나타냅니다.
- **아직 마치지 못한 일이 적어도 하나 존재합니다.**

---

### 입출력 예

| `todo_list`                                                  | `finished`                   | `result`                           |
|--------------------------------------------------------------|------------------------------|------------------------------------|
| `["problemsolving", "practiceguitar", "swim", "studygraph"]` | `[true, false, true, false]` | `["practiceguitar", "studygraph"]` |

---

### 입출력 예 설명

#### 예제 #1
- `todo_list`: `["problemsolving", "practiceguitar", "swim", "studygraph"]`
- `finished`: `[true, false, true, false]`

아직 마치지 못한 일들은:
- **"practiceguitar"** (index 1)
- **"studygraph"** (index 3)

따라서, `["practiceguitar", "studygraph"]`를 return 합니다.
# 회고
### 리스트
```java
public String[] solution(String[] todo_list, boolean[] finished) {
    List<String> unfinishedTasks = new ArrayList<>();

    for (int i = 0; i < todo_list.length; i++) {
        if (!finished[i]) {
            unfinishedTasks.add(todo_list[i]);
        }
    }

    return unfinishedTasks.toArray(new String[0]);
}
```
### Stream API
```java
import java.util.stream.IntStream;

public String[] solution(String[] todo_list, boolean[] finished) {
    return IntStream.range(0, todo_list.length)
        .filter(i -> !finished[i]) 
        .mapToObj(i -> todo_list[i]) 
        .toArray(String[]::new);
}
```