package basic.가까운_1_찾기;

import java.util.Arrays;

public class Solution55 {
    public static void main(String[] args) {
        Solution55 solution = new Solution55();
        runTest(solution, new int[] {0, 0, 0, 1}, 1);
        runTest(solution, new int[] {1, 0, 0, 1, 0, 0}, 4);
        runTest(solution, new int[] {1, 1, 1, 1, 0}, 3);
    }

    private static void runTest(Solution55 solution, int[] arr, int idx) {
        int result = solution.solution(arr, idx);
        System.out.printf("solution(%s %s) = %s%n", Arrays.toString(arr), idx, result);
    }

    public int solution(int[] arr, int idx) {
        int answer = 0;
        return answer;
    }
}
