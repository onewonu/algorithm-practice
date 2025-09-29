class Solution {
    public int pivotInteger(int n) {
        if (n == 1) return 1;

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i + 1;
        }

        int total = 0;
        for (int num : arr) {
            total += num;
        }

        int left = 0;
        for (int num : arr) {
            left += num;
            int right = total - left + num;

            if (left == right) return num;
        }

        return -1;
    }
}