# a와 b 출력하기
### 문제 설명
정수 a와 b가 주어집니다. 각 수를 입력받아 입출력 예와 같은 형식으로 출력하는 코드를 작성해 보세요.
### 제한사항
- -100,000 ≤ a, b ≤ 100,000
### 입출력 예
#### 입력 #1
> 4 5
#### 출력 #1
> a = 4  
> b = 5
# 회고
### Escape Sequence
- \n: newline (줄바꿈). 커서를 다음 줄로 이동.
- \t: tab (탭). 커서를 일정 간격만큼 오른쪽으로 이동.
- \\: backslash (역슬래시). 역슬래시 자체를 출력.
- \": double quote (큰따옴표). 문자열 안에서 큰따옴표를 출력.
- \r: carriage return (캐리지 리턴). 커서를 현재 줄의 맨 앞으로 이동.
- \b: backspace (백스페이스). 한 글자를 삭제.
### String formatting (printf())
printf 는 print formatted 의 축약형.
- %d: 정수 삽입 (decimal)
- %s: 문자열 삽입 (string)
- %f: 실수 삽입 (float)
- %c: 한 개의 문자 삽입 (char)
- %%: % 기호 자체 삽입
### Reference
[java 21 docs: nextInt()](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/Scanner.html#nextInt())  
[java 21 docs: Formatter](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/Formatter.html)  
[microsoft: Escape Sequence](https://learn.microsoft.com/ko-kr/cpp/c-language/escape-sequences?view=msvc-170)  