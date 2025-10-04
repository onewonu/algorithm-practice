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