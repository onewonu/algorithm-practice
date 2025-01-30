package basic.정사각형으로_만들기;

import java.util.Arrays;

public class Solution123 {
    public static void main(String[] args) {
        Solution123 solution = new Solution123();
        runTest(solution, new int[][]{ {572, 22, 37}, {287, 726, 384}, {85, 137, 292}, {487, 13, 876} });
        runTest(solution, new int[][]{ {57, 192, 534, 2}, {9, 345, 192, 999} });
        runTest(solution, new int[][]{ {1, 2}, {3, 4} });
    }

    private static void runTest(Solution123 solution, int[][] arr) {
        int[][] result = solution.solution(arr);
        System.out.printf("solution(%s) = %s%n", Arrays.deepToString(arr), Arrays.deepToString(result));
    }

    public int[][] solution(int[][] arr) {
        int numRows = arr.length;
        int numCols = arr[0].length;
        int maxSize = Math.max(numRows, numCols);
        int[][] result = new int[maxSize][maxSize];

        for (int i = 0; i < numRows; i++) {
            System.arraycopy(arr[i], 0, result[i], 0, numCols);
        }

        return result;
    }
}