```java
class Solution {
    public int countPartitions(int[] nums) {
        int count = 0;
        int leftSum = 0;        
        
        int totalSum = 0;
        for(int n : nums) {
            totalSum += n;
        }

        for (int i = 0; i < nums.length - 1; i++) {
            leftSum += nums[i];
            int rightSum = totalSum - leftSum;

            if ((leftSum - rightSum) % 2 == 0) count++;
        }

        return count;
    }
}
```

<br/>

- 기존 코드의 핵심: `rightSum = totalSum - leftSum`
  - $leftSum - rightSum$ 
  - $= leftSum - (totalSum - leftSum)$ 
  - $= 2*leftSum - totalSum$
    - 이 값이 짝수가 되려면, $2*leftSum - totalSum ≡ 0 (mod 2)$
      - $(2*leftSum) \, mod2 − totalSum \, mod2=0$
      - $(2*leftSum) \, mod2 = 0$ -> 2의 배수이기 때문에 항상 짝수 
      - $totalSum \, mod2=0$
        - $2*leftSum$ 는 항상 짝수이기 때문에 totalSum 이 짝수가 되어야 모든 파티션이 유효

<br/>

- 간단 정리
  - 짝수 − totalSum = 짝수
  - 짝수에서 무언가를 빼서 짝수가 되려면, 그 무언가도 짝수여야 함