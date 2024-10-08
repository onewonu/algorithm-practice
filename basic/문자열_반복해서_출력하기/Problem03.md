# 문자열 반복해서 출력하기
### 문제 설명
문자열 str 과 정수 n이 주어집니다. str 이 n번 반복된 문자열을 만들어 출력하는 코드를 작성해 보세요.
### 제한사항
- 1 ≤ str 의 길이 ≤ 10
- 1 ≤ n ≤ 5
### 입출력 예
#### 입력 #1
> string 5
#### 출력 #1
> stringstringstringstringstring
# 회고
> IntStream.range(0, n).forEach(i -> System.out.print(str));

.range(0, n)
- 0부터 n-1까지의 정수를 생성하는 스트림을 만든다.

.forEach
- 해당 스트림의 각 요소를 실행.
### Reference
[java 21 docs: IntStream.range](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/stream/IntStream.html#range(int,int))  
[java 21 docs: IntStream.forEach](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/stream/IntStream.html#forEach(java.util.function.IntConsumer))
