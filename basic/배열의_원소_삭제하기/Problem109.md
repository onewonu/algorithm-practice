## 배열의 원소 삭제하기

---

### 문제 설명
정수 배열 `arr`과 `delete_list`가 있습니다. `arr`의 원소 중 `delete_list`의 원소를 모두 삭제하고 남은 원소들은 기존의 `arr`에 있던 순서를 유지한 배열을 return 하는 `solution` 함수를 작성해 주세요.

---

### 제한사항
- $(1 \leq \text{arr 의 길이} \leq 100)$
- $(1 \leq \text{arr 의 원소} \leq 1,000)$
- `arr`의 원소는 모두 서로 다릅니다.
- $(1 \leq \text{delete_list 의 길이} \leq 100)$
- $(1 \leq \text{delete_list 의 원소} \leq 1,000)$
- `delete_list`의 원소는 모두 서로 다릅니다.

---

### 입출력 예

| arr                       | delete_list                 | result                 |
|---------------------------|-----------------------------|------------------------|
| [293, 1000, 395, 678, 94] | [94, 777, 104, 1000, 1, 12] | [293, 395, 678]        |
| [110, 66, 439, 785, 1]    | [377, 823, 119, 43]         | [110, 66, 439, 785, 1] |

---

### 입출력 예 설명

#### 예제 #1
- 예제 1번의 `arr`의 원소 중 `1000`과 `94`가 `delete_list`에 있으므로 이 두 원소를 삭제한 `[293, 395, 678]`을 return 합니다.

#### 예제 #2
- 예제 2번의 `arr`의 원소 중 `delete_list`에 있는 원소는 없습니다. 따라서 `arr` 그대로인 `[110, 66, 439, 785, 1]`을 return 합니다.
# 회고
### 다른 풀이 방법: 이진 탐색
```java
public int[] solution(int[] arr, int[] delete_list) {
    int[] result = new int[arr.length];
    int index = 0;

    Arrays.sort(delete_list);

    for (int num : arr) {
        if (Arrays.binarySearch(delete_list, num) < 0) {
            result[index++] = num;
        }
    }

    return Arrays.copyOf(result, index);
}
```
***이진 탐색은 정렬된 배열에서 값을 찾는 효율적인 방법, 삭제 리스트를 먼저 정렬한 후, 각 값을 이진 탐색으로 확인**
- Arrays.binarySearch
  - 값이 배열에 없을 경우, 그 값이 정렬된 배열에서 삽입될 위치를 음수 값으로 반환
