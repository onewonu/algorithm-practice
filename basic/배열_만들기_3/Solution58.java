package basic.배열_만들기_3;

import java.util.Arrays;
import java.util.Stack;

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
        int secondStart = intervals[1][0];
        int secondEnd = intervals[1][1];

        Stack<Integer> stack = new Stack<>();

        for (int i = firstStart; i <= firstEnd; i++) stack.push(arr[i]);
        for (int i = secondStart; i <= secondEnd; i++) stack.push(arr[i]);

        int[] result = new int[stack.size()];
        for (int i = stack.size() - 1; i >= 0; i--) result[i] = stack.pop();

        return result;
    }
}
