class Solution {
    public int subarraySum(int[] nums) {
        int len = nums.length;
        int result = 0;
        int[] prefix = new int[len + 1];

        for (int i = 0; i < len; i++) {
            prefix[i + 1] = prefix[i] + nums[i];
            
            int start = Math.max(0, i - nums[i]);
            result += prefix[i + 1] - prefix[start];
        }

        return result;
    }
}