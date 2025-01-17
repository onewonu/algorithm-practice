## 문자열 묶기

### 문제 설명
문자열 배열 `strArr`이 주어집니다. `strArr`의 원소들을 길이가 같은 문자열들끼리 그룹으로 묶었을 때 **가장 개수가 많은 그룹의 크기**를 return 하는 `solution` 함수를 완성해 주세요.

---

### 제한사항
- $1 \leq \text{strArr의 길이} \leq 100,000$
- $1 \leq \text{strArr의 원소의 길이} \leq 30$
- `strArr`의 원소들은 알파벳 소문자로 이루어진 문자열입니다.

---

### 입출력 예

| strArr                      | result |
|-----------------------------|--------|
| `["a","bc","d","efg","hi"]` | 2      |

---

### 입출력 예 설명

#### 예제 #1
- 각 문자열들을 길이에 맞게 그룹으로 묶으면 다음과 같습니다:

  | 문자열 길이 | 문자열 목록        | 개수 |
  |--------|---------------|----|
  | 1      | `["a","d"]`   | 2  |
  | 2      | `["bc","hi"]` | 2  |
  | 3      | `["efg"]`     | 1  |

- **개수의 최댓값은 2**이므로 2를 return 합니다.
# 회고
### 기존 풀이 방법: 데이터 그룹화에 집중 
```java
public int solution(String[] strArr) {
      HashMap<Integer, List<String>> hashMap = new HashMap<>();
      for (String str : strArr) {
          int length = str.length();
          hashMap.putIfAbsent(length, new ArrayList<>());
          hashMap.get(length).add(str);
      }

      int maxSize = 0;
      for (Map.Entry<Integer, List<String>> entry : hashMap.entrySet()) {
          int currentSize = entry.getValue().size();

          if (currentSize > maxSize) {
              maxSize = currentSize;
          }
      }

      return maxSize;
  }
```
- putIfAbsent(K, V): 키가 존재하지 않을 때에만 값을 추가. 즉, 해당 키가 이미 존재하면 아무 작업도 하지 않고, 키가 없을 경우에만 새로운 키-값 쌍을 추가.
### 기본 풀이 방법 개선: 
```java
public int solution(String[] strArr) {
    Map<Integer, Integer> lengthCount = new HashMap<>();

    for (String str : strArr) {
        int length = str.length();
        lengthCount.put(
                length
                , lengthCount.getOrDefault(length, 0) + 1
        );
    }

    int maxSize = 0;
    for (int count : lengthCount.values()) {
        maxSize = Math.max(maxSize, count);
    }
    return maxSize;
}
```
- lengthCount.getOrDefault(length, 0)
  - length 라는 키가 lengthCount 맵에 이미 존재하면, 해당 키의 현재 값을 반환
  - length 라는 키가 존재하지 않으면, 대신 기본값(0)을 반환
#### 개선점
- 문자열 리스트를 생성하고 관리하는 작업은 현재 문제의 요구사항(가장 큰 그룹 크기 계산)과는 직접적인 관련이 없다.
- HashMap<Integer, List<String>> 에 비해 HashMap<Integer, Integer> 는 문자열 개수만 저장.
### 다른 풀이 방법: 고정 배열
```java
public int solution(String[] strArr) {
    int[] counts = new int[31];
    
    for (String str : strArr) {
        counts[str.length()]++;
    }

    int maxSize = 0;
    for (int count : counts) {
        maxSize = Math.max(maxSize, count);
    }

    return maxSize;
}
```
### 다른 풀이 방법: Stream API
```java
public int solution(String[] strArr) {
    return Arrays.stream(strArr)
            .collect(Collectors.groupingBy(String::length, Collectors.counting()))
            .values()
            .stream()
            .max(Long::compare)
            .orElse(0L)
            .intValue();
}
```
### Reference
[java 21 docs: HashMap](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/HashMap.html)  
[java 21 docs: HashMap.getOrDefault(Object, V)](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/Map.html#getOrDefault(java.lang.Object,V))  
[java 21 docs: HashMap.putIfAbsent(K,V)](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/Map.html#putIfAbsent(K,V))  
[java 21 docs: Collectors.groupingBy(Function, Collector)](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/stream/Collectors.html#groupingBy(java.util.function.Function,java.util.stream.Collector))  