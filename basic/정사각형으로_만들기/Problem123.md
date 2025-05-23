## 정사각형으로 만들기

---

### 문제 설명
이차원 정수 배열 `arr`이 매개변수로 주어집니다.
- **행의 수가 열의 수보다 크다면**, **각 행의 끝에 `0`을 추가**하여 정사각형 배열을 만듭니다.
- **열의 수가 행의 수보다 크다면**, **각 열의 끝에 `0`을 추가**하여 정사각형 배열을 만듭니다.

변환된 `arr`를 반환하는 `solution` 함수를 구현하세요.

---

### 제한사항
- $1 \leq \text{arr 의 길이} \leq 100$
- $1 \leq \text{arr 의 원소의 길이} \leq 100$
- `arr`의 모든 원소의 길이는 같습니다.
- $1 \leq \text{arr 의  원소의 원소} \leq 1,000$

---

### 입출력 예

| arr                                                                               | result                                                                                        |
|-----------------------------------------------------------------------------------|-----------------------------------------------------------------------------------------------|
| `[[572, 22, 37],`<br>`[287, 726, 384],`<br>`[85, 137, 292],`<br>`[487, 13, 876]]` | `[[572, 22, 37, 0],`<br>`[287, 726, 384, 0],`<br>`[85, 137, 292, 0],`<br>`[487, 13, 876, 0]]` |
| `[[57, 192, 534, 2],`<br>`[9, 345, 192, 999]]`                                    | `[[57, 192, 534, 2],`<br>`[9, 345, 192, 999],`<br>`[0, 0, 0, 0],`<br>`[0, 0, 0, 0]]`          |
| `[[1, 2],`<br>`[3, 4]]`                                                           | `[[1, 2],`<br>`[3, 4]]`                                                                       |

---

### 입출력 예 설명

#### 예제 #1
- `arr`의 행의 수: `4`, 열의 수: `3`
- **행의 수가 더 크므로**, **각 행의 끝에 `0`을 추가**
- 결과:
  ```plaintext
  [[572, 22, 37, 0],
   [287, 726, 384, 0],
   [85, 137, 292, 0],
   [487, 13, 876, 0]]
  ```
#### 예제 #2
- arr 의 행의 수: 2, 열의 수: 4
- 열의 수가 더 크므로, 각 열의 끝에 0을 추가
- 결과:
  ```plaintext
  [[57, 192, 534, 2],
  [9, 345, 192, 999],
  [0, 0, 0, 0],
  [0, 0, 0, 0]]
  ```
#### 예제 #3
- arr 의 행의 수: 2, 열의 수: 2
- 이미 정사각형이므로 그대로 반환
- 결과:
 ```plaintext
  [[1, 2],
 [3, 4]]
  ```
# 회고
### 정사각형(n × n) 배열로 변환 
- 행과 열중 더 큰값을 사용해 초기화
### System.arraycopy
**arraycopy(Object src, int srcPos, Object dest, int destPos, int length)**
- src: 소스 배열
- srcPos: 소스 배열의 시작 위치
- dest: 대상 배열
- destPos: 목적지 데이터의 시작 위치
- length: 복사할 배열 요소의 개수