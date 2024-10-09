# 대소문자_바꿔서_출력하기
### 문제 설명
영어 알파벳으로 이루어진 문자열 str 이 주어집니다. 각 알파벳을 대문자는 소문자로 소문자는 대문자로 변환해서 출력하는 코드를 작성해 보세요.
### 제한사항
- 1 ≤ str 의 길이 ≤ 20
  - str 은 알파벳으로 이루어진 문자열입니다.
### 입출력 예
#### 입력 #1
> aBcDeFg
#### 출력 #1
> AbCdEfG
# 회고
### 01
- StringBuilder
  - 문자열을 효율적으로 조작할 수 있도록 돕는 클래스. 내부적으로 변경 가능한 버퍼를 유지하므로, 문자열을 계속해서 연결하거나 수정할 때 새로운 객체를 생성하지 않고도 작업이 가능.
- String.charAt(int)
  - 문자열의 특정 인덱스 위치에 있는 문자를 반환.
- Character 
  - 문자와 관련된 다양한 유틸리티 메소드를 제공.
### 02
- chars()
  - 문자열을 문자 스트림으로 변환. 즉, 문자열의 각 문자를 하나씩 처리할 수 있는 스트림 객체를 반환. 
  - 이 스트림은 각 문자를 int 값으로 처리하는 IntStream 을 반환하는데, char 는 사실상 작은 정수로, 그 ASCII 값을 스트림으로 처리하는 것
- forEach(c -> ...)
  - 스트림에서 제공하는 종단 연산 중 하나로, 스트림의 각 요소에 대해 지정한 동작을 수행.
### Reference
[java 21 docs: StringBuilder](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/StringBuilder.html)  
[java 21 docs: String.charAt(int)](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html#charAt(int))  
[java 21 docs: Character](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Character.html)  

[java 21 docs: String.chars()](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html#chars())    
[java 21 docs: IntStream.forEach](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/stream/IntStream.html#forEach(java.util.function.IntConsumer))