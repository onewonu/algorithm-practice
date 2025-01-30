package basic.이차원_배열_대각선_순회하기;

import java.util.Arrays;

public class Solution124 {
    public static void main(String[] args) {
        Solution124 solution = new Solution124();
        runTest(solution, new int[][]{ {0, 1, 2}, {1, 2, 3}, {2, 3, 4}, {3, 4, 5} }, 2);
    }

    private static void runTest(Solution124 solution, int[][] board, int k) {
        int result = solution.solution(board, k);
        System.out.printf("solution(%s, %d) = %d%n", Arrays.deepToString(board), k, result);
    }

    public int solution(int[][] board, int k) {
        int answer = 0;
        return answer;
    }
}