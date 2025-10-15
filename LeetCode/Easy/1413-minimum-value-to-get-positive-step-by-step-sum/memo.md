```java
class Solution {
    public int minStartValue(int[] nums) {
        int prefixSum = 0;
        int minPrefixSum = 0;

        for (int num : nums) {
            prefixSum += num;
            minPrefixSum = Math.min(minPrefixSum, prefixSum);
        }

        return 1 - minPrefixSum;
    }
}
```

<br/>

###### 가장 최악의 순간을 찾아 해당 조건을 만족하는 최소 시작값 계산

```text
nums = [-3, 2, -3, 4, 2]

prefixSum = 0 + (-3) = -3,  minPrefixSum = -3
prefixSum = -3 + 2 = -1,    minPrefixSum = -3
prefixSum = -1 + (-3) = -4, minPrefixSum = -4  -> 최악의 지점
prefixSum = -4 + 4 = 0,     minPrefixSum = -4
prefixSum = 0 + 2 = 2,      minPrefixSum = -4
```

```text
startValue + minPrefixSum >= 1
-> 시작 값에서, 가장 낮게 떨어지는 지점에서도 최소 1이상을 유지 해야함
```
```text
정리
startValue >= 1 - minPrefixSum
```