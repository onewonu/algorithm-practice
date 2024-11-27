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
        int i1 = intervals[0][0];
        int i2 = intervals[0][1];
        int i3 = intervals[1][0];
        int i4 = intervals[1][1];

        Stack<Integer> stack = new Stack<>();

        for (int i = i1; i <= i2; i++) {
            stack.push(arr[i]);
        }

        for (int j = i3; j <= i4; j++) {
            stack.push(arr[j]);
        }

        int[] result = new int[stack.size()];
        for (int i = 0; i < stack.size(); i++) {
            result[i] = stack.get(i);
        }

        return result;
    }
}
