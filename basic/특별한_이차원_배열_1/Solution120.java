package basic.특별한_이차원_배열_1;

import java.util.Arrays;

public class Solution120 {
    public static void main(String[] args) {
        Solution120 solution = new Solution120();
        runTest(solution, 3);
        runTest(solution, 6);
        runTest(solution, 1);
    }

    private static void runTest(Solution120 solution, int n) {
        int[][] result = solution.solution(n);
        System.out.printf("solution(%s) = %s%n", n, Arrays.deepToString(result));
    }

    public int[][] solution(int n) {
        int[][] answer = {};
        return answer;
    }
}