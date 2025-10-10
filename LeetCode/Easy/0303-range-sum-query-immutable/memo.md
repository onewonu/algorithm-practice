```java
class NumArray {

    private int[] prefix;

    public NumArray(int[] nums) {
        prefix = new int[nums.length + 1];
        for (int i = 0; i < nums.length; i++) {
            prefix[i + 1] = prefix[i] + nums[i]; 
        }
    }
    
    public int sumRange(int left, int right) {
        return prefix[right + 1] - prefix[left];
    }
}
```

<br/>

###### sumRange(2, 5)

```text
nums = [-2, 0, 3, -5, 2, -1]
        ↑   ↑   ↑   ↑   ↑   ↑
       [0] [1] [2] [3] [4] [5]

목표: nums[2] + nums[3] + nums[4] + nums[5]
```
- prefix[right + 1]
  - 누적합 배열 특성상 prefix[i]는 nums[i-1]까지의 합 
  - 따라서 nums[5]까지 포함하려면 prefix[6] 필요

<br/>

- prefix[left]
  - prefix[2]는 nums[1]까지의 합 (nums[2] 미포함)

<br/>

```text
prefix[6] - prefix[2]
= (nums[0] + nums[1] + nums[2] + nums[3] + nums[4] + nums[5]) - (nums[0] + nums[1])
= nums[2] + nums[3] + nums[4] + nums[5]
```

```text
prefix[6] = [0][1][2][3][4][5]
prefix[2] = [0][1]            
────────────────────────────────
결과      =       [2][3][4][5] 
```