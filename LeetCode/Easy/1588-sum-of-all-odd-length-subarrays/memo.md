```java
class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int len = arr.length;
        
        int oddarr[] = new int[(len + 1) / 2];
        int index = 0;
        for (int i = 1; i <= len; i += 2) {
            oddarr[index] = i;
            index++;
        }

        int sum = 0;
        int partSum = 0;
        for (int odd : oddarr) {
            for (int i = 0; i <= len - odd; i++) {
                for (int j = i; j < i + odd; j++) {
                    partSum += arr[j];
                }
                
                sum += partSum;
                partSum = 0;
            }
        }

        return sum;
    }
}
```

- ***new int[(len + 1) / 2]***
  - 홀수 길이들을 저장할 배열 초기화
  - (len + 1) / 2
    - 정수 나눗셈의 소수점 버림 특성을 이용한 보정값 적용  
      - len = 1: 홀수 → 1개, (1+1)/2 = 1  
      - len = 2: 홀수 → 1개, (2+1)/2 = 1 (정수나눗셈)    
      - len = 3: 홀수 → 1,3 → 2개, (3+1)/2 = 2  
      - len = 4: 홀수 → 1,3 → 2개, (4+1)/2 = 2  
      - len = 5: 홀수 → 1,3,5 → 3개, (5+1)/2 = 3  

<br/>

- ***for (int odd : oddarr) {***
  - 홀수 길이별 반복

<br/>

- ***for (int i = 0; i <= len - odd; i++) {***
  - 해당 길이로 만들 수 있는 모든 시작위치 탐색
  - 종료 조건: i <= len - odd
    - 시작 위치 i에서 길이 odd인 부분 배열이 배열 범위를 벗어나지 않도록 제한

<br/>

- ***for (int j = i; j < i + odd; j++) {***
  - 시작위치 i부터 길이 odd 만큼 실제 부분배열 원소들 합산

<br/>
<br/>
<br/>

```java
class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int sum = 0;
        int len = arr.length;
        
        for (int i = 0; i < len; i++) {
            int left = i + 1;        
            int right = len - i;       
            int total = left * right; 
            
            int oddCount = (total + 1) / 2;
            
            sum += arr[i] * oddCount;
        }
        
        return sum;
    }
}
```
- 배열: [1, 4, 2, 5, 3]
- 특정 인덱스 i를 포함하는 부분개열의 총 개수: $total = (i + 1) × (n - i)$

<br/>

- left = i + 1;
  - 인덱스 i를 포함하면서, 시작점으로 가능한 인덱스들
  - 인덱스 2를 포함하는 부분배열의 시작점들
    - 인덱스 0에서 시작: [1,4,2], [1,4,2,5], [1,4,2,5,3]
    - 인덱스 1에서 시작: [4,2], [4,2,5], [4,2,5,3]
    - 인덱스 2에서 시작: [2], [2,5], [2,5,3]
      - 가능한 시작점: 0, 1, 2 → 총 3개 = i + 1 = 2 + 1

<br/>

- right = len - i;
  - 인덱스 i를 포함하면서, 끝점으로 가능한 인덱스들
  - 인덱스 2를 포함하는 부분배열의 끝점들
    - 인덱스 2에서 끝: [1,4,2], [4,2], [2]
    - 인덱스 3에서 끝: [1,4,2,5], [4,2,5], [2,5]
    - 인덱스 4에서 끝: [1,4,2,5,3], [4,2,5,3], [2,5,3]
      - 가능한 끝점: 2, 3, 4 → 총 3개 = n - i = 5 - 2

<br/>

- total = left * right;
  - 전체 경우의 수

<br/>

- oddCount = (total + 1) / 2;
  - 홀수 길이 부분배열의 개수
  - 부분배열 길이의 분포 패턴
    - 길이 1: 1개
    - 길이 2: 2개  
    - 길이 3: 3개
    - 길이 4: 2개
    - 길이 5: 1개
      - 패턴: 1, 2, 3, 2, 1 
      - total이 홀수일 때: 홀수 길이가 1개 더 많음 (total = 9 → 홀수 5개, 짝수 4개)
      - total이 짝수일 때: 홀수와 짝수 개수가 같음 (total이 짝수일 때: 홀수와 짝수 개수가 같음)