package basic.특별한_이차원_배열_2;

import java.util.Arrays;

public class Solution122 {
    public static void main(String[] args) {
        Solution122 solution = new Solution122();
        runTest(solution, new int[][]{ {5, 192, 33}, {192, 72, 95}, {33, 95, 999} });
        runTest(solution, new int[][]{ {19, 498, 258, 587}, {63, 93, 7, 754}, {258, 7, 1000, 723}, {587, 754, 723, 81} });
    }

    private static void runTest(Solution122 solution, int[][] arr) {
        int result = solution.solution(arr);
        System.out.printf("solution(%s) = %d%n", Arrays.deepToString(arr), result);
    }

    public int solution(int[][] arr) {
        int answer = 0;
        return answer;
    }
}