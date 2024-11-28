# 2의 영역

## 문제 설명
정수 배열 `arr`가 주어집니다. 이 배열에서 숫자 2가 모두 포함된 **가장 작은 연속된 부분 배열**을 찾아 반환하는 함수 `solution`을 작성하세요.

만약 배열에 숫자 2가 없다면 `[-1]`을 반환합니다.

---

## 제한사항
- $1 \leq \text{arr의 길이} \leq 100,000$
- $1 \leq \text{arr의 원소} \leq 10$

---

## 입출력 예
| arr                       | result              |
|---------------------------|---------------------|
| [1, 2, 1, 4, 5, 2, 9]     | [2, 1, 4, 5, 2]     |
| [1, 2, 1]                 | [2]                 |
| [1, 1, 1]                 | [-1]                |
| [1, 2, 1, 2, 1, 10, 2, 1] | [2, 1, 2, 1, 10, 2] |

---

## 입출력 예 설명
### 예제 1
- 배열 `arr`에서 2가 있는 인덱스는 **1번**과 **5번**입니다.
- 이 인덱스를 포함한 가장 작은 연속된 부분 배열은 `[2, 1, 4, 5, 2]`입니다.

### 예제 2
- 배열 `arr`에서 2는 한 번만 등장하므로 `[2]`를 반환합니다.

### 예제 3
- 배열 `arr`에 2가 없으므로 `[-1]`을 반환합니다.

### 예제 4
- 배열 `arr`에서 2가 있는 인덱스는 **1번**, **3번**, **6번**입니다.
- 이 인덱스를 포함한 가장 작은 연속된 부분 배열은 `[2, 1, 2, 1, 10, 2]`입니다.
# 회고
### 첫번째 할당 후 재할당 하지 않도록 처리
- 초기값을 불가능한 값으로 설정하고, 해당 값일 떄만 새로운 값이 으로 갱신 되도록 조건문을 작성.
### Length of range
$$
\text{Length of range} = endIndex - startIndex + 1
$$
### arraycopy(Object src, int srcPos, Object dest, int destPos, int length)
- src: 소스 배열
- srcPos: 소스 배열의 시작 위치
- dest: 대상 배열
- destPos: 목적지 데이터의 시작 위치
- length: 복사할 배열 요소의 개수
### Reference
[java 21 docs: System.arraycopy(Object,int,Object,int,int)](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/System.html#arraycopy(java.lang.Object,int,java.lang.Object,int,int))