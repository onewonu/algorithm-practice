# n 번째 원소부터

## 문제 설명
정수 리스트 `num_list`와 정수 `n`이 주어질 때,  
**n 번째 원소부터 마지막 원소까지의 모든 원소를 담은 리스트**를 반환하는 함수를 작성하세요.

---

## 제한사항
- $2 \leq \text{num_list의 길이} \leq 30$
- $1 \leq \text{num_list의 원소} \leq 9$
- $1 \leq n \leq \text{num_list의 길이}$

---

## 입출력 예

| num_list        | n | result       |
|-----------------|---|--------------|
| [2, 1, 6]       | 3 | [6]          |
| [5, 2, 1, 7, 5] | 2 | [2, 1, 7, 5] |

---

## 입출력 예 설명

### 예제 #1
- `[2, 1, 6]`의 **세 번째 원소부터 마지막 원소까지**는 `[6]`입니다.

### 예제 #2
- `[5, 2, 1, 7, 5]`의 **두 번째 원소부터 마지막 원소까지**는 `[2, 1, 7, 5]`입니다.
# 회고
### 고정 배열
#### 초기화 인덱스
- 전체 크기: num_list.length
- 제거되는 원소의 개수: n - 1 (0번째부터 (n-2)번째까지)
- 결과 배열의 크기: num_list.length - (n - 1)
#### 반복문을 통한 값 할당
- 시작 인덱스: n - 1
- 반복문에서 현재 인덱스의 offset 을 더해 배열의 요소를 순차적으로 접근: (+ i)
### copyOfRange
- Arrays.copyOfRange(original, from, to)
  - original: 복사 대상이 되는 원본 배열.
  - from: 복사 시작 인덱스(포함).
  - to: 복사 끝 인덱스(포함되지 않음).
### Reference
[java 21 docs: Arrays.copyOfRange(int[],int,int)](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/Arrays.html#copyOfRange(int[],int,int))  