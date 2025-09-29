class Solution {
    public int[] leftRightDifference(int[] nums) {
        int len = nums.length;
        int[] result = new int[len];
        
        int leftSum = 0; 
        for(int i = 1; i < len; i++){
            leftSum += nums[i-1];
            result[i] = leftSum; 
        }

        int rightSum = 0;
        for(int i = len - 2; i >= 0; i--){
            rightSum += nums[i+1];
            result[i] = Math.abs(result[i] - rightSum);
        }

        return result;
    }
}