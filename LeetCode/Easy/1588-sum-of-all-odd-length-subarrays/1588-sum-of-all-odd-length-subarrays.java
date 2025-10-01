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