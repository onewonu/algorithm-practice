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