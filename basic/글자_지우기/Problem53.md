# 글자 지우기

## 문제 설명
문자열 `my_string`과 정수 배열 `indices`가 주어질 때, `my_string`에서 `indices`의 원소에 해당하는 인덱스의 글자를 **제거하고 남은 문자열을 이어붙인 결과**를 반환하는 `solution` 함수를 작성하세요.

---

## 제한사항
- \( 1 \leq \text{indices의 길이} < \text{my_string의 길이} \leq 100 \)
- `my_string`은 **영소문자**로만 이루어져 있습니다.
- \( 0 \leq \text{indices의 원소} < \text{my_string의 길이} \)
- `indices`의 원소는 모두 서로 다릅니다.

---

## 입출력 예

| my_string             | indices                      | result        |
|-----------------------|------------------------------|---------------|
| "apporoograpemmemprs" | [1, 16, 6, 15, 0, 10, 11, 3] | "programmers" |

---

## 입출력 예 설명

### **예제 1**
`my_string`의 각 글자의 인덱스를 다음과 같이 나타냅니다:

| index | 0 | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 | 10 | 11 | 12 | 13 | 14 | 15 | 16 | 17 | 18 |
|-------|---|---|---|---|---|---|---|---|---|---|----|----|----|----|----|----|----|----|----|
| 글자    | a | p | p | o | r | o | o | g | r | a | p  | e  | m  | m  | e  | m  | p  | r  | s  |

- `indices` = [1, 16, 6, 15, 0, 10, 11, 3]
- **제거해야 할 인덱스의 글자**: [a, p, o, o, p, e, m, m].
- 남은 글자들을 이어 붙이면 **"programmers"**가 됩니다.

```plaintext
result: "programmers"
```
# 회고
### Set
> 중복된 요소를 허용하지 않고, 순서와 상관없이 고유한 요소들을 저장하는 자료구조.  
### Set 의 구현 클래스
#### HashSet
- 내부적으로 해시 테이블을 기반으로 동작
- 요소의 순서를 보장하지 않음
- 삽입, 삭제, 탐색이 평균적으로 $O(1)$ 의 시간 복잡도를 가짐
#### LinkedHashSet
- HashSet 의 특성
- 삽입 순서 유지
#### TreeSet
- 내부적으로 이진 검색 트리 기반
- 요소를 정렬된 상태로 유지
- - 삽입, 삭제, 탐색이 $O(log n)$ 의 시간 복잡도를 가짐
#### EnumSet
- Enum 타입 전용 
- 내부적으로 비트 벡터를 사용하여 최적화
- 상수 순서 보장
### Set 구현체 선택
| 고려 사항            | 구현체           |
|------------------|---------------|
| 중복제거, 순서 상관 없음   | HashSet       |
| 중복 제거, 삽입 순서 유지  | LinkedHashSet |
| 중복 제거, 정렬된 상태 유지 | TreeSet       |
| Enum 타입          | EnumSet       |
### Reference
[java 21 docs: util.Set](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/Set.html)  
[java 21 docs: util.HashSet](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/HashSet.html)  
[java 21 docs: util.LinkedHashSet](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/LinkedHashSet.html)  
[java 21 docs: ]()