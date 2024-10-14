# 더 크게 합치기
### 문제 설명
연산 ⊕는 두 정수에 대한 연산으로 두 정수를 붙여서 쓴 값을 반환합니다. 예를 들면 다음과 같습니다.

12 ⊕ 3 = 123  
3 ⊕ 12 = 312

양의 정수 a와 b가 주어졌을 때, a ⊕ b와 b ⊕ a 중 더 큰 값을 return 하는 solution 함수를 완성해 주세요. 단, a ⊕ b와 b ⊕ a가 같다면 a ⊕ b를 return 합니다.
### 제한사항
- 1 ≤ a, b < 10,000
### 입출력 예

| a  | b  | result |
|----|----|--------|
| 9  | 91 | 991    |
| 89 | 8  | 898    |

### 입출력 예 설명
#### 입출력 예 #1
- a ⊕ b = 991 이고, b ⊕ a = 919 입니다. 둘 중 더 큰 값은 991 이므로 991을 return 합니다.
#### 입출력 예 #2
- a ⊕ b = 898 이고, b ⊕ a = 889 입니다. 둘 중 더 큰 값은 898 이므로 898을 return 합니다.
# 회고
자바에서는 덧셈 연산을 수행할 때 피연산자 중 하나라도 문자열이면, 나머지 정수나 다른 피연산자도 문자열로 자동 변환된다. (String.valueOf() 메서드를 내부적으로 호출하여 처리.)   
### Reference
[java 21 docs: Integer.parseInt(String)](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Integer.html#parseInt(java.lang.String))  
[java 21 docs: Math.max(int, int)](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Math.html#max(int,int))