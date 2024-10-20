# 마지막 두 원소
### 문제 설명
정수 리스트 `num_list`가 주어질 때,  
마지막 원소가 그전 원소보다 크면 마지막 원소에서 그전 원소를 뺀 값을,  
마지막 원소가 그전 원소보다 크지 않다면 마지막 원소를 두 배한 값을 추가하여 return 하도록 solution 함수를 완성해 주세요.

### 제한사항
- 2 ≤ `num_list`의 길이 ≤ 10
- 1 ≤ `num_list`의 원소 ≤ 9

### 입출력 예

| num_list           | result                |
|--------------------|-----------------------|
| [2, 1, 6]          | [2, 1, 6, 5]          |
| [5, 2, 1, 7, 5]    | [5, 2, 1, 7, 5, 10]   |

### 입출력 예 설명
#### 입출력 예 #1
- 마지막 원소인 6이 그전 원소인 1보다 크기 때문에 `6 - 1`인 5를 추가해 return 합니다.

#### 입출력 예 #2
- 마지막 원소인 5가 그전 원소인 7보다 크지 않기 때문에 5의 두 배인 `10`을 추가해 return 합니다.
# 회고
ArrayList 와 같은 동적 배열 구조를 사용할 경우 크기를 자유롭게 조정할 수 있지만, int[]는 고정 크기 배열이므로 직접 크기를 변경할 수 없다.  
그래서 추가되는 요소의 크기만큼 정적으로 새로운 배열을 생성한 후 기존 배열의 요소들을 복사한 뒤, 새로운 요소를 추가.
### Reference
[java 21 docs: System.arraycopy(Object,int,Object,int,int)](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/System.html#arraycopy(java.lang.Object,int,java.lang.Object,int,int))