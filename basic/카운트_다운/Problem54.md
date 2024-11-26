# 카운트 다운

## 문제 설명
정수 `start_num`와 `end_num`가 주어질 때, `start_num`에서 `end_num`까지 1씩 감소하는 수들을 차례로 담은 리스트를 `return`하도록 `solution` 함수를 완성하세요.

## 제한사항
- \( 0 \leq \text{end_num} \leq \text{start_num} \leq 50 \)

## 입출력 예

| start_num | end_num | result                    |
|-----------|---------|---------------------------|
| 10        | 3       | [10, 9, 8, 7, 6, 5, 4, 3] |

## 입출력 예 설명
### 예제 #1
- 10부터 3까지 1씩 감소하는 수를 담은 리스트는 `[10, 9, 8, 7, 6, 5, 4, 3]`입니다.
# 회고
### 배열 초기화
- 연속된 범위 내 숫자의 개수: $(최댓값 - 최소값) + 1$
### 다른 풀이 방법: Stream
```java
public int[] solution(int start, int end) {
    return IntStream.rangeClosed(-start, -end).map(i -> -i).toArray();
}
```
- IntStream.rangeClosed(int startInclusive, int endInclusive)
  - 설명
    - 주어진 범위 내의 정수들을 포함하여 스트림을 생성하는 Java 스트림 API 의 메서드.
    - 생성된 스트림은 항상 **오름차순(작은 값 → 큰 값)** 으로 동작하며, startInclusive 가 endInclusive 보다 클 경우 빈 스트림을 반환한다.
  - 동작 원리 및 순서
    1. 범위 확인
       - 입력된 startInclusive 와 endInclusive 를 확인하여 범위가 유효한지 확인.
       - startInclusive <= endInclusive 가 참이면 정상적인 스트림 생성, 그렇지 않으면 빈 스트림 반환.
    2. 연속된 정수 생성
       - 범위 내 정수를 1씩 증가시키며 스트림에 데이터를 생성.
    3. 최적화된 연산
       - 스트림 생성 과정에서 **lazy evaluation(지연 평가)** 를 사용하여 필요한 데이터만 메모리에 로드.
- 음수 처리
    - IntStream.rangeClosed 는 오름차순 정수 범위만 생성 가능하므로, 감소하는 정수 범위를 생성하기 위해 음수 변환 방식을 활용한다.
    - 음수 변환으로 인해 감소 순서를 오름차순으로 변환한 후, 다시 양수로 복원하여 원래 순서를 얻을 수 있다.
    - 예를 들어, [10, 9, 8, 7, 6]과 같은 감소 배열을 생성하려면 [-10, -9, -8, -7, -6]을 오름차순으로 생성한 후 양수로 복원하는 방식이다.