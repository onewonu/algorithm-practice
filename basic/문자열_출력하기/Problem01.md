# 문자열 출력하기
### 문제 설명
문자열 str 이 주어질 때, str 을 출력하는 코드를 작성해 보세요.
### 제한사항
- 1 ≤ str 의 길이 ≤ 1,000,000  
- str 에는 공백이 없으며, 첫째 줄에 한 줄로만 주어집니다.
### 입출력 예
#### 입력 #1  
> HelloWorld!
#### 출력 #1
> HelloWorld!
# 회고
제한 사항에 공백이 없다고 제시 되었음으로 nextLine() 대신 next() 사용.
- next(): 공백을 기준으로 입력을 끊어서 단어 단위로 반환.
- nextLine(): 공백도 포함되며, 줄바꿈(엔터) 전까지의 입력, 한 줄 전체를 반환.  
### Reference
[java 21 docs: next()](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/Scanner.html#next())  
[java 21 docs: nextLine()](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/Scanner.html#nextLine())