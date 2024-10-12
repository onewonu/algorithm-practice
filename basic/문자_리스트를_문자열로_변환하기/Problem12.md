# 문자 리스트를 문자열로 변환하기
### 문제 설명
문자들이 담겨있는 배열 arr 가 주어집니다. arr 의 원소들을 순서대로 이어 붙인 문자열을 return 하는 solution 함수를 작성해 주세요.
### 제한사항
- 1 ≤ arr 의 길이 ≤ 200  
  -- arr 의 원소는 전부 알파벳 소문자로 이루어진 길이가 1인 문자열입니다.
### 입출력 예

| arr           | result |
|---------------|--------|
| ["a","b","c"] | "abc"  |

# 회고
문자들이 담긴 리스트(배열)를 순서대로 이어 붙여 하나의 문자열로 변환.
- join
  - 문자열 배열이나 컬렉션의 요소들을 구분자와 함께 하나의 문자열로 결합.
### Reference
[java 21 docs: String.join](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html#join(java.lang.CharSequence,java.lang.Iterable))