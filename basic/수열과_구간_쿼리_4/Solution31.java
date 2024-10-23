package basic.수열과_구간_쿼리_4;

import java.util.Arrays;

public class Solution31 {
    public static void main(String[] args) {
        Solution31 solution = new Solution31();
        runTest(solution, new int[]{0, 1, 2, 4, 3}, new int[][]{{0, 4, 1}, {0, 3, 2}, {0, 3, 3}});
    }

    private static void runTest(Solution31 solution, int[] arr, int[][] queries) {
        int[] result = solution.solution(arr, queries);
        System.out.printf("solution(%s, %s) = %s%n", Arrays.toString(arr), Arrays.deepToString(queries), Arrays.toString(result));
    }

    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = {};
        return answer;
    }
}