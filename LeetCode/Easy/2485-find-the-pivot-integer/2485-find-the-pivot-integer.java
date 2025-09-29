class Solution {
    public int pivotInteger(int n) {
        if (n == 1) return 1;

        int total = n * (n + 1) / 2;
        int left = 0;

        for (int i = 1; i <= n; i++) {
            left += i;
            int right = total - left + i;

            if (left == right) return i;
        }

        return -1;
    }
}