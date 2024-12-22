package basic.수열과_구간_쿼리_1;

import java.util.Arrays;

public class Solution70 {
    public static void main(String[] args) {
        Solution70 solution = new Solution70();
        runTest(solution, new int[] { 0, 1, 2, 3, 4 }, new int[][]{ {0, 1}, {1, 2}, {2, 3} });
    }

    private static void runTest(Solution70 solution, int[] arr, int[][] queries) {
        int[] result = solution.solution(arr, queries);
        System.out.printf("solution(%s %s) = %s%n", Arrays.toString(arr), Arrays.deepToString(queries), Arrays.toString(result));
    }

    public int[] solution(int[] arr, int[][] queries) {
        for (int[] query : queries) {
            for (int j = query[0]; j < query[1] + 1; j++) {
                arr[j] += 1;
            }
        }

        return arr;
    }
}