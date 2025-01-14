## 빈 배열에 추가, 삭제하기

### 문제 설명
아무 원소도 들어있지 않은 빈 배열 `X`가 있습니다. 길이가 같은 정수 배열 `arr`과 boolean 배열 `flag`가 매개변수로 주어질 때, `flag`를 차례대로 순회하며 `flag[i]`가 `true`라면 `X`의 뒤에 `arr[i]`를 `arr[i] × 2` 번 추가하고, `flag[i]`가 `false`라면 `X`에서 마지막 `arr[i]`개의 원소를 제거한 뒤 `X`를 return 하는 `solution` 함수를 작성해 주세요.

---

### 제한사항
- $1 \leq \text{arr의 길이} = \text{flag의 길이} \leq 100$
- `arr`의 모든 원소는 $1$ 이상 $9$ 이하의 정수입니다.
- 현재 `X`의 길이보다 더 많은 원소를 빼는 입력은 주어지지 않습니다.

---

### 입출력 예

| arr               | flag                                | result                     |
|-------------------|-------------------------------------|----------------------------|
| `[3, 2, 4, 1, 3]` | `[true, false, true, false, false]` | `[3, 3, 3, 3, 4, 4, 4, 4]` |

---

### 입출력 예 설명

#### 예제 #1
예제 1번에서 `X`의 변화를 표로 나타내면 다음과 같습니다.

| i | flag[i] | arr[i] | X                                      |
|---|---------|--------|----------------------------------------|
|   |         |        | `[]`                                   |
| 0 | true    | 3      | `[3, 3, 3, 3, 3, 3]`                   |
| 1 | false   | 2      | `[3, 3, 3, 3]`                         |
| 2 | true    | 4      | `[3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 4]` |
| 3 | false   | 1      | `[3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4]`    |
| 4 | false   | 3      | `[3, 3, 3, 3, 4, 4, 4, 4]`             |

따라서 `[3, 3, 3, 3, 4, 4, 4, 4]`를 return 합니다.
# 회고
### 리스트의 마지막 arr[i]개의 요소 삭제
- 리스트에서 특정 값(예: 3)이 위치한 마지막 부분을 제거하는 것이 아닌, 리스트의 뒤쪽부터 개수(arr[i])를 기준으로 제거하는 것을 요구
### ArrayList.remove
**remove(int index): 인덱스를 지정하여 삭제**
- 리스트에서 지정된 인덱스의 요소를 삭제.
- 삭제된 요소 뒤의 모든 요소는 한 칸 앞으로 이동.
- 인덱스가 리스트의 크기를 벗어나면 IndexOutOfBoundsException 발생.

**remove(Object o): 객체의 값을 기준으로 삭제**
- 리스트에서 지정된 객체와 동일한 첫 번째 요소를 삭제.
- 객체의 equals() 메서드로 비교하여 동일한 값을 찾는다.
- 삭제된 요소 뒤의 모든 요소는 한 칸 앞으로 이동.
- 삭제 성공 시 true, 실패 시 false.
# Reference
[java 21 docs: ArrayList.remove(int)](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/ArrayList.html#remove(int))
[java 21 docs: ArrayList.remove(Object)](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/ArrayList.html#remove(java.lang.Object))