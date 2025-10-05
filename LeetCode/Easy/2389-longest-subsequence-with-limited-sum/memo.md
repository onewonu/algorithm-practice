```java
class Solution {
    public int[] answerQueries(int[] nums, int[] queries) {
        int[] result = new int[queries.length];
        
        Arrays.sort(nums);
        
        int[] prefix = new int[nums.length + 1];
        for (int i = 0; i < nums.length; i++) {
            prefix[i + 1] = prefix[i] + nums[i];
        }
        
        for (int i = 0; i < queries.length; i++) {
            int left = 0;
            int right = prefix.length - 1;
            int answer = 0;

            while (left <= right) {
                int mid = left + (right - left) / 2;

                if (prefix[mid] <= queries[i]) {
                    answer = mid;
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }

            result[i] = answer;
        }

        return result;
    }
}
```

- 핵심 조건 
  - prefix 배열은 정렬된 상태 (오름차순)
  - prefix[i] ≤ query인 최대 인덱스 i 를 찾아야 함
  - 이진 탐색으로 처리 가능

###### queries[0] = 3
```text
mid = 2

prefix[2] = 3
queries[0] = 3

if (3 <= 3)  // true
    answer = 2
    left = 2 + 1 = 3
```

```text
mid = 3

prefix[3] = 7
queries[0] = 3

if (7 <= 3)  // false
    right = 3 - 1 = 2
```

```text
종료 조건: left > right (3 > 2)
```

<br/>

###### queries[1] = 10
```text
mid = 2

prefix[2] = 3
queries[1] = 10

if (3 <= 10)  // true
    answer = 2
    left = 3
```

```text
mid = 4

prefix[4] = 12
queries[1] = 10

if (12 <= 10)  // false
    right = 3
```

```text
종료 조건: left > right (4 > 3)
```

<br/>

###### queries[2] = 21
```text
mid = 2

prefix[2] = 3
queries[2] = 21

if (3 <= 21)  // true
    answer = 2
    left = 3
```

```text
mid = 3

prefix[3] = 7
queries[2] = 21

if (7 <= 21)  // true
    answer = 3
    left = 4
```

```text
mid = 4

prefix[4] = 12
queries[2] = 21

if (12 <= 21)  // true
    answer = 4
    left = 5
```

```text
종료 조건: left > right (5 > 4)
```

<br/>
<br/>

- 오버플로우 방지: `int mid = left + (right - left) / 2` 
```java
int left = 2000000000;
int right = 2000000000;

// 방식 1
int mid = (left + right) / 2;
// left + right = 4,000,000,000
// int 최댓값 = 2,147,483,647을 초과 → 오버플로우 발생
// 음수가 되어버림

// 방식 2
int mid = left + (right - left) / 2;
// right - left = 0
// 0 / 2 = 0
// left + 0 = 2,000,000,000
```

