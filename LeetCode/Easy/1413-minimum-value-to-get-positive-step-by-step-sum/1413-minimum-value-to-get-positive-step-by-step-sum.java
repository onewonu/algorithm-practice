class Solution {
    public int minStartValue(int[] nums) {
        int start = 1;

        while(true) {
            boolean isValid = true;
            int prefix = start;

            for (int num : nums) {
                prefix += num;
                if (prefix < 1) {
                    isValid = false;
                    break;
                }
            }

            if (isValid) {
                return start;
            }

            start++;
        }
    }
}