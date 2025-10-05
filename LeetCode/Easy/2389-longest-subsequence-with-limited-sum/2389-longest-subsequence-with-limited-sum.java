class Solution {
    public int[] answerQueries(int[] nums, int[] queries) {
        Arrays.sort(nums);
        
        int[] prefix = new int[nums.length + 1];
        for (int i = 0; i < nums.length; i++) {
            prefix[i + 1] = prefix[i] + nums[i];
        }
        
        int[] result = new int[queries.length];
        
        for (int i = 0; i < queries.length; i++) {
            for (int j = 0; j < prefix.length; j++) {
                if (queries[i] >= prefix[j]) {
                    result[i] = j;
                } else {
                    break;
                }
            }
        }
        
        return result;
    }
}