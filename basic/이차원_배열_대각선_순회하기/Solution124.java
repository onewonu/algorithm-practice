package basic.이차원_배열_대각선_순회하기;

import java.util.Arrays;

public class Solution124 {
    public static void main(String[] args) {
        Solution124 solution = new Solution124();
        runTest(solution, new int[][]{ {0, 1, 2}, {1, 2, 3}, {2, 3, 4}, {3, 4, 5} }, 2);

        runTest(solution, new int[][]{
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        }, 4);

        runTest(solution, new int[][]{
                {5, 10},
                {15, 20}
        }, 1);

        runTest(solution, new int[][]{
                {0, 0, 0},
                {0, 0, 0},
                {0, 0, 0}
        }, 5);

        runTest(solution, new int[][]{
                {1, 1, 1},
                {1, 1, 1},
                {1, 1, 1}
        }, 0);
    }

    private static void runTest(Solution124 solution, int[][] board, int k) {
        int result = solution.solution(board, k);
        System.out.printf("solution(%s, %d) = %d%n", Arrays.deepToString(board), k, result);
    }

    public int solution(int[][] board, int k) {
        int sum = 0;

        for (int i = 0; i < board.length; i++) {
            int maxJ = Math.min(
                    k - i
                    , board[i].length - 1
            );

            for (int j = 0; j <= maxJ; j++) {
                sum += board[i][j];
            }
        }

        return sum;
    }
}