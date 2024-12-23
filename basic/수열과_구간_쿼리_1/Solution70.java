package basic.수열과_구간_쿼리_1;

import java.util.Arrays;

public class Solution70 {
    public static void main(String[] args) {
        Solution70 solution = new Solution70();
        runTest(solution, new int[] { 0, 1, 2, 3, 4 }, new int[][]{ {0, 1}, {0, 1}, {1, 2}, {2, 3} });
        runTest(solution, new int[] { 0, 1, 2, 3, 4 }, new int[][]{ {0, 1}, {1, 2}, {2, 3} });
    }

    private static void runTest(Solution70 solution, int[] arr, int[][] queries) {
        int[] result = solution.solution(arr, queries);
        System.out.printf("solution(%s %s) = %s%n", Arrays.toString(arr), Arrays.deepToString(queries), Arrays.toString(result));
    }

    public int[] solution(int[] arr, int[][] queries) {
        int[] diff = new int[arr.length + 1];

        for (int[] query : queries) {
            int start = query[0];
            int end = query[1];
            diff[start] += 1;
            if (end + 1 < diff.length) diff[end + 1] -= 1;
        }

        int current = 0;
        for (int i = 0; i < arr.length; i++) {
            current += diff[i];
            arr[i] += current;
        }

        return arr;
    }
}