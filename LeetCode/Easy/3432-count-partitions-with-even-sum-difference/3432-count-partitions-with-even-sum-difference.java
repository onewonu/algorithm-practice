class Solution {
    public int countPartitions(int[] nums) {
        int totalSum = 0;
        for (int n : nums) {
            totalSum += n;
        }
        
        if (totalSum % 2 == 0) {
            return nums.length - 1;
        } else {
            return 0;
        }
    }
}