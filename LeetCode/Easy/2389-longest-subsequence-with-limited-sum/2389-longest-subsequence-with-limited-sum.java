class Solution {
    public int[] answerQueries(int[] nums, int[] queries) {
        int[] result = new int[queries.length];
        
        Arrays.sort(nums);
        
        int[] prefix = new int[nums.length + 1];
        for (int i = 0; i < nums.length; i++) {
            prefix[i + 1] = prefix[i] + nums[i];
        }
        
        for (int i = 0; i < queries.length; i++) {
            int left = 0;
            int right = prefix.length - 1;
            int answer = 0;

            while (left <= right) {
                int mid = left + (right - left) / 2;

                if (prefix[mid] <= queries[i]) {
                    answer = mid;
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }

            result[i] = answer;
        }

        return result;
    }
}