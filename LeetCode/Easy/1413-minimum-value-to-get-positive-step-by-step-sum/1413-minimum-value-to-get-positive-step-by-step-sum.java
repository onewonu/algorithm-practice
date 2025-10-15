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