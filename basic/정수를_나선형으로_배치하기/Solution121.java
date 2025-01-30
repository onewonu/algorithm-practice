package basic.정수를_나선형으로_배치하기;

import java.util.Arrays;

public class Solution121 {
    public static void main(String[] args) {
        Solution121 solution = new Solution121();
        runTest(solution, 4);
        runTest(solution, 5);
    }

    private static void runTest(Solution121 solution, int n) {
        int[][] result = solution.solution(n);
        System.out.printf("solution(%s) = %s%n", n, Arrays.deepToString(result));
    }

    public int[][] solution(int n) {
        int[][] answer = {};
        return answer;
    }
}