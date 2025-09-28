class Solution {
    public int subarraySum(int[] nums) {
        int len = nums.length;
        int result = 0;
        
        for (int i = 0; i < len; i++) {
            int start = Math.max(0, i - nums[i]);
            
            int sum = 0;
            for (int j = start; j <= i; j++) {
                sum += nums[j];
            }
            
            result += sum;
        }
        
        return result;
    }
}