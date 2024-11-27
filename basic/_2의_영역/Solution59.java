package basic._2의_영역;

import java.util.Arrays;

public class Solution59 {
    public static void main(String[] args) {
        Solution59 solution = new Solution59();
        runTest(solution, new int[] {1, 2, 1, 4, 5, 2, 9});
        runTest(solution, new int[] {1, 2, 1});
        runTest(solution, new int[] {1, 1, 1});
        runTest(solution, new int[] {1, 2, 1, 2, 1, 10, 2, 1});
    }

    private static void runTest(Solution59 solution, int[] arr) {
        int[] result = solution.solution(arr);
        System.out.printf("solution(%s) = %s%n", Arrays.toString(arr), Arrays.toString(result));
    }

    public int[] solution(int[] arr) {
        int[] answer = {};
        return answer;
    }
}
