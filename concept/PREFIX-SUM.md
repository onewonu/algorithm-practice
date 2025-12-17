### 개념
**배열의 처음부터 각 인덱스까지의 누적된 합을 미리 계산해두어, 특정 구간의 합을 O(1)에 구하는 기법**

<br/>

### 누적합 배열
- 원본 배열: arr = [1, 2, 3, 4, 5]
- 누적합 배열: prefix = [1, 3, 6, 10, 15]
- prefix[i] = arr[0] + arr[1] + ... + arr[i]

<br/>

### 구간 합 공식
- [L, R] 구간의 합 = prefix[R] - prefix[L-1]
  - prefix[R]   = [0~R]까지 전체 합
  - prefix[L-1] = [0~L-1]까지 합
    - prefix[R] - prefix[L-1] = [L~R]만의 합

<br/>

### 예제 
```java
public int[] buildPrefixSum(int[] arr) {
    int[] prefix = new int[arr.length];
    
    prefix[0] = arr[0];
    
    for (int i = 1; i < arr.length; i++) {
        prefix[i] = prefix[i-1] + arr[i];
    }
    
    return prefix;
}
```
```java
public int getRangeSum(int[] prefix, int L, int R) {
    if (L == 0) {
        return prefix[R];
    }
    
    return prefix[R] - prefix[L-1];
}
```
```java
public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4, 5};
    int[] prefix = buildPrefixSum(arr);  // prefix = [1, 3, 6, 10, 15]
    
    System.out.println(getRangeSum(prefix, 1, 3)); // 9 (2+3+4)
    System.out.println(getRangeSum(prefix, 2, 4)); // 12 (3+4+5)
    System.out.println(getRangeSum(prefix, 0, 2)); // 6 (1+2+3)
}
```