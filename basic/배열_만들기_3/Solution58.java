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
        int firstStart = intervals[0][0];
        int firstEnd = intervals[0][1];
        int firstSize = firstEnd - firstStart + 1;

        int secondStart = intervals[1][0];
        int secondEnd = intervals[1][1];
        int secondSize = secondEnd - secondStart + 1;

        int[] answer = new int[firstSize + secondSize];
        System.arraycopy(arr, firstStart, answer, 0, firstSize);
        System.arraycopy(arr, secondStart, answer, firstSize, secondSize);

        return answer;
    }
}
