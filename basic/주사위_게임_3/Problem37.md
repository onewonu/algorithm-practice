# 주사위 게임 3

### 문제 설명
1부터 6까지 숫자가 적힌 주사위가 네 개 있습니다. 네 주사위를 굴렸을 때 나온 숫자에 따라 다음과 같은 점수를 얻습니다.

1. 네 주사위에서 나온 숫자가 모두 `p`로 같다면 1111 × `p`점을 얻습니다.
2. 세 주사위에서 나온 숫자가 `p`로 같고 나머지 다른 주사위에서 나온 숫자가 `q`(`p ≠ q`)라면 \((10 × p + q)^2\) 점을 얻습니다.
3. 주사위가 두 개씩 같은 값이 나오고, 나온 숫자를 각각 `p`, `q`(`p ≠ q`)라고 한다면 \((p + q) × |p - q|\)점을 얻습니다.
4. 어느 두 주사위에서 나온 숫자가 `p`로 같고 나머지 두 주사위에서 나온 숫자가 각각 `p`와 다른 `q`, `r`(`q ≠ r`)이라면 `q × r`점을 얻습니다.
5. 네 주사위에 적힌 숫자가 모두 다르다면 나온 숫자 중 가장 작은 숫자 만큼의 점수를 얻습니다.

네 주사위를 굴렸을 때 나온 숫자가 정수 매개변수 `a`, `b`, `c`, `d`로 주어질 때, 얻는 점수를 return 하는 `solution` 함수를 작성해 주세요.

### 제한사항
- `a`, `b`, `c`, `d`는 1 이상 6 이하의 정수입니다.

### 입출력 예

| a  | b  | c  | d  | result |
|----|----|----|----|--------|
| 2  | 2  | 2  | 2  | 2222   |
| 4  | 1  | 4  | 4  | 1681   |
| 6  | 3  | 3  | 6  | 27     |
| 2  | 5  | 2  | 6  | 30     |
| 6  | 4  | 2  | 5  | 2      |

### 입출력 예 설명

#### 입출력 예 #1
예제 1번에서 네 주사위 숫자가 모두 2로 같으므로 \(1111 × 2 = 2222\)점을 얻습니다. 따라서 `2222`를 return 합니다.

#### 입출력 예 #2
예제 2번에서 세 주사위에서 나온 숫자가 4로 같고 나머지 다른 주사위에서 나온 숫자가 1이므로 \((10 × 4 + 1)^2 = 41^2 = 1681\)점을 얻습니다. 따라서 `1681`을 return 합니다.

#### 입출력 예 #3
예제 3번에서 `a`, `d`는 6으로, `b`, `c`는 3으로 각각 같으므로 \((6 + 3) × |6 - 3| = 9 × 3 = 27\)점을 얻습니다. 따라서 `27`을 return 합니다.

#### 입출력 예 #4
예제 4번에서 두 주사위에서 2가 나오고 나머지 다른 두 주사위에서 각각 5, 6이 나왔으므로 \(5 × 6 = 30\)점을 얻습니다. 따라서 `30`을 return 합니다.

#### 입출력 예 #5
예제 5번에서 네 주사위 숫자가 모두 다르고 나온 숫자 중 가장 작은 숫자가 2이므로 `2`점을 얻습니다. 따라서 `2`를 return 합니다.
# 회고 
### 해결 순서
#### 01 요구사항 분석
##### 핵심 요구사항
- 주사위 **네 개의 값이 가지는 패턴을 제시된 조건으로 분기** 하는 것. 
##### 조건에 따른 수행식
1. 모든 주사위가 같은 숫자 -> $1111 * p$
2. 세 주사위가 같은 숫자이고(p), 나머지 하나가 다른 숫자(q) -> $(10 * p * q)^2$
3. 두 주사위씩 같은 숫자가 두 쌍 -> $(p + q) * |p - q|$
4. 어느 두 주사위만 같은 숫자가 나오고, 나머지 두 주사위가 각각 다른 숫자(q, r) -> q * r
5. 네 주사위 모두 다른 숫자 -> 가장 작은 숫자
#### 02 구현 방식
##### HashMap
###### 특징
- 키-값 구조.
- 삽입, 삭제, 조회 시 $O(1)$ 의 시간복잡도.
- 키가 중복되지 않음.
- null 키, null 값을 허용(단, null 키는 하나만 저장할 수 있으며, 여러 개의 null 값을 가질 수 있다.)
- 비동기적 구조를 가져, 여러 스레드에서 동시에 접근하면 동기화 문제가 발생할 수 있다. 멀티스레드 환경에서는 ConcurrentHashMap 을 사용.
- 순서를 보장하지 않는다.(순서가 중요한 경우 LinkedHashMap, TreeMap 고려할 수 있다.)
- 내부적으로 해시 함수를 사용하여 키를 해싱하고, 이를 통해 저장 위치를 결정한다.
###### 활용-1
```java
public int solution(int a, int b, int c, int d) {
    
    int[] dice = {a, b, c, d};
    HashMap<Integer, Integer> countDice = new HashMap<>();
    
    for (int number : dice) countDice.put(number, countDice.getOrDefault(number, 0) + 1);

    /**
     * solution(2, 2, 2, 2)
     * {2=4}

     * solution(4, 1, 4, 4)
     * {1=1, 4=3}

     * solution(6, 3, 3, 6)
     * {3=2, 6=2}

     * solution(2, 5, 2, 6)
     * {2=2, 5=1, 6=1}

     * solution(6, 4, 2, 5)
     * {2=1, 4=1, 5=1, 6=1}
     */
}
```
- key: 주사위에서 나온 각 숫자. 네 개의 인수에서 나온 값 중 유일한 값만 각 키로 저장.
- value: Key 가 배열 dice 에서 나온 횟수.
###### 활용-2
```java
public int solution(int a, int b, int c, int d) {
    // ...
    
    if (countDice.size() == 1) {
        // 모든 주사위가 같은 경우
        
    } else if (countDice.size() == 2) {
        if (countDice.containsValue(3)) {
            // 세 개가 같은 숫자, 나머지 하나가 다른 경우
            
        } else {
            // 두 개씩 같은 숫자가 두 쌍인 경우
        }
        
    } else if (countDice.size() == 3) {
        // 한 숫자가 두 번, 나머지 두 숫자가 각각 한 번씩인 경우
        
    } else if (countDice.size() == 4) {
        // 네 숫자가 모두 다른 경우
    }
}
```
- countDice.size() 만으로 모든 조건을 잡을 수 없다.
  - countDice.size() == 2일 때, _세 개가 같은 숫자이고 나머지 하나가 다른 경우_ 와 _두 개씩 같은 두 숫자 조합이 있는 경우_ 로 나뉠 수 있다.
    - solution(4, 1, 4, 4) -> {1=1, 4=3} 
    - solution(6, 3, 3, 6) -> {3=2, 6=2}
###### 활용-3
```java
public int solution(int a, int b, int c, int d) {
    // ...
    
    for (Integer key : countDice.keySet()) {
        if (countDice.get(key) == 3) p = key; // 3회 등장한 숫자를 p에 할당
        else q = key; // 1회 또는 2회 등장한 숫자를 q에 할당
    }
    
    if (countDice.containsValue(3)) return (int) Math.pow((10 * p + q), 2);
    else return (p + q) * Math.abs(p - q);
}
```
### Reference
[java 21 docs: util.HashMap](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/HashMap.html)  
[java 21 docs: Map.getOrDefault(Object, V)](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/Map.html#getOrDefault(java.lang.Object,V))  
[java 21 docs: Map.keySet()](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/Map.html#keySet())  
[java 21 docs: Map.containsValue(Object)](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/Map.html#containsValue(java.lang.Object))  
[java 21 docs: Math.pow(double,double)](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Math.html#pow(double,double))
[java 21 docs: Math.abs(int)](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Math.html#abs(int))