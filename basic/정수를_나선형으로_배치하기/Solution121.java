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
        int[][] answer = new int[n][n];
        int num = 1;

        int top = 0;
        int bottom = n - 1;
        int left = 0;
        int right = n - 1;

        while (num <= n * n) {
            for (int column = left; column <= right; column++) {
                answer[top][column] = num++;
            }
            top++;

            for (int row = top; row <= bottom; row++) {
                answer[row][right] = num++;
            }
            right--;

            for (int column = right; column >= left; column--) {
                answer[bottom][column] = num++;
            }
            bottom--;

            for (int row = bottom; row >= top; row--) {
                answer[row][left] = num++;
            }
            left++;
        }

        return answer;
    }
}