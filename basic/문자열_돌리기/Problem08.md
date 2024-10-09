# 문자열 돌리기
### 문제 설명
문자열 str이 주어집니다.
문자열을 시계방향으로 90도 돌려서 아래 입출력 예와 같이 출력하는 코드를 작성해 보세요.
### 제한사항
- 1 ≤ str의 길이 ≤ 10
### 입출력 예
#### 입력 #1
> apple pen
#### 출력 #1
> abcde
#### 입력 #2
> Hello World!
#### 출력 #2
> a  
> b  
> c  
> d  
> e
# 회고
- String.charAt(int)
    - 문자열의 특정 인덱스 위치에 있는 문자를 반환.
### 다른 방법
> a.chars().mapToObj(c -> (char)c).forEach(System.out::println);
### Reference
[java 21 docs: String.charAt(int)](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html#charAt(int))  
[java 21 docs: mapToObj(IntFunction)](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/stream/IntStream.html#mapToObj(java.util.function.IntFunction))