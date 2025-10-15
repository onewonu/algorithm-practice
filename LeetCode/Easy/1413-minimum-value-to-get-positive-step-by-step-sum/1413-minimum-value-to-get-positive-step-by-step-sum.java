class Solution {
    public int minStartValue(int[] nums) {
        int startValue = 1;

        while (true) {
            int sum = startValue;
            boolean isValid = true;

            for (int num : nums) {
                sum += num;
                if (sum < 1) {
                    isValid = false;
                    break;
                }
            }

            if (isValid) {
                return startValue;
            }

            startValue++;
        }
    }
}