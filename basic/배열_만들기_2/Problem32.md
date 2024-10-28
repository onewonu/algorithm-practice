# 배열 만들기 2
### 문제 설명
정수 `l`과 `r`이 주어졌을 때, `l` 이상 `r` 이하의 정수 중에서 숫자 "0"과 "5"로만 이루어진 모든 정수를 오름차순으로 저장한 배열을 return 하는 solution 함수를 완성해 주세요.

만약 그러한 정수가 없다면, -1이 담긴 배열을 return 합니다.

### 제한사항
- 1 ≤ `l` ≤ `r` ≤ 1,000,000

### 입출력 예

| l   | r   | result                                       |
|-----|-----|----------------------------------------------|
| 5   | 555 | [5, 50, 55, 500, 505, 550, 555]              |
| 10  | 20  | [-1]                                         |

### 입출력 예 설명
#### 입출력 예 #1
- `5` 이상 `555` 이하의 0과 5로만 이루어진 정수는 다음과 같습니다:
    - 5, 50, 55, 500, 505, 550, 555
- 따라서 `[5, 50, 55, 500, 505, 550, 555]`를 return 합니다.

#### 입출력 예 #2
- `10` 이상 `20` 이하이면서 0과 5로만 이루어진 정수는 존재하지 않습니다.
- 따라서 `[-1]`을 return 합니다.
# 회고
### 01 직접 검증
1. l부터 r 까지의 숫자를 순회하면서 각 숫자가 0과 5로만 이루어져 있는지 확인.
2. 숫자를 10으로 나누며 자릿수를 나눠서, 각 자릿수가 0 또는 5인지 확인.
3. 만족하는 숫자는 리스트에 추가하고, 조건을 만족하는 숫자가 하나도 없다면 -1을 반환.
### 02 이진수 변환을 통해 특정 숫자 패턴을 생성
정수를 1부터 지정된 숫자까지 이진수 패턴으로 변환하고, 이를 기반으로 특정 규칙에 따라 지정한 숫자 패턴을 생성한 뒤, 입력된 범위 [l, r] 내의 숫자만 결과로 반환한다.
#### 비트에 따라 반복문 제한
- **2 bit**: $2^2 = 4$
- **3 bit**: $2^3 = 8$
- **4 bit**: $2^4 = 16$
- **5 bit**: $2^5 = 32$
- **6 bit**: $2^6 = 64$
- **7 bit**: $2^7 = 128$
- **8 bit**: $2^8 = 256$  
...
### Reference
[java 21 docs: ArrayList](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/ArrayList.html)    
[java 21 docs: util.List.isEmpty()](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/List.html#isEmpty())  
[java 21 docs: Integer.parseInt(java.lang.CharSequence,int,int,int)](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Integer.html#parseInt(java.lang.CharSequence,int,int,int))  
[java 21 docs: Integer.toBinaryString(int)](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Integer.html#toBinaryString(int))    
[java 21 docs: Stream.mapToInt(java.util.function.ToIntFunction)](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/stream/Stream.html#mapToInt(java.util.function.ToIntFunction))