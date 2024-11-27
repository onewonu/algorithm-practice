# 배열 만들기 3

## 문제 설명
정수 배열 `arr`와 2개의 구간이 담긴 배열 `intervals`가 주어집니다.

- `intervals`는 항상 `[[a1, b1], [a2, b2]]`의 형태로 주어지며 각 구간은 닫힌 구간입니다.
- **닫힌 구간**은 양 끝값과 그 사이의 값을 모두 포함하는 구간을 의미합니다.
- 배열 `arr`의 첫 번째 구간에 해당하는 배열과 두 번째 구간에 해당하는 배열을 **앞뒤로 붙여** 새로운 배열을 만들어 반환하세요.

---

## 제한사항
- $1 \leq arr \text{의 길이} \leq 100,000$
- $1 \leq arr \text{의 원소} < 100$
- $1 \leq a1 \leq b1 < \text{arr의 길이}$
- $1 \leq a2 \leq b2 < \text{arr의 길이}$

---

## 입출력 예

| `arr`             | `intervals`        | `result`                   |
|-------------------|--------------------|----------------------------|
| `[1, 2, 3, 4, 5]` | `[[1, 3], [0, 4]]` | `[2, 3, 4, 1, 2, 3, 4, 5]` |

---

## 입출력 예 설명

### 입출력 예 #1
1. 첫 번째 구간 `[1, 3]`에 해당하는 배열은 `[2, 3, 4]`입니다.
2. 두 번째 구간 `[0, 4]`에 해당하는 배열은 `[1, 2, 3, 4, 5]`입니다.
3. 두 배열을 앞뒤로 붙이면 `[2, 3, 4, 1, 2, 3, 4, 5]`가 됩니다.
# 회고
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