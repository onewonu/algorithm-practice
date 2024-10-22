package basic.수열과_구간_쿼리_3;

import java.util.Arrays;

public class Solution29 {
    public static void main(String[] args) {
        Solution29 solution = new Solution29();
        runTest(solution, new int[]{0, 1, 2, 3, 4}, new int[][]{{0, 3}, {1, 2}, {1, 4}});
    }

    private static void runTest(Solution29 solution, int[] arr, int[][] queries) {
        int[] result = solution.solution(arr, queries);
        System.out.printf("solution(%s, %s) = %s%n", Arrays.toString(arr), Arrays.deepToString(queries), Arrays.toString(result));
    }

    public int[] solution(int[] arr, int[][] queries) {

        for (int[] query : queries) {
            int i = query[0];
            int j = query[1];

            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        return arr;
    }
}