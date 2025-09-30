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