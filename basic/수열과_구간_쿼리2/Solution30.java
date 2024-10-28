package basic.수열과_구간_쿼리2;

import java.util.Arrays;

public class Solution30 {
    public static void main(String[] args) {
        Solution30 solution = new Solution30();
        runTest(solution, new int[]{0, 1, 2, 4, 3}, new int[][]{{0, 4, 2}, {0, 3, 2}, {0, 2, 2}});
    }

    private static void runTest(Solution30 solution, int[] arr, int[][] queries) {
        int[] result = solution.solution(arr, queries);
        System.out.printf("solution(%s, %s) = %s%n", Arrays.toString(arr), Arrays.deepToString(queries), Arrays.toString(result));
    }

    public int[] solution(int[] arr, int[][] queries) {

        int[] answer = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {
            int minVal = -1;

            int s = queries[i][0];
            int e = queries[i][1];
            int k = queries[i][2];

            for (int j = s; j <= e; j++) {
                if (arr[j] > k) {
                    if (minVal == -1 || minVal > arr[j]) {
                        minVal = arr[j];
                    }
                }
            }

            answer[i] = minVal;
        }

        return answer;
    }
}