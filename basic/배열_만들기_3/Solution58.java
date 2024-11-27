package basic.배열_만들기_3;

import java.util.Arrays;

public class Solution58 {
    public static void main(String[] args) {
        Solution58 solution = new Solution58();
        runTest(solution, new int[] {1, 2, 3, 4, 5}, new int[][]{{1, 3}, {0, 4}});
    }

    private static void runTest(Solution58 solution, int[] arr, int[][] intervals) {
        int[] result = solution.solution(arr, intervals);
        System.out.printf("solution(%s %s) = %s%n", Arrays.toString(arr), Arrays.deepToString(intervals), Arrays.toString(result));
    }

    public int[] solution(int[] arr, int[][] intervals) {
        int[] answer = {};
        return answer;
    }
}
