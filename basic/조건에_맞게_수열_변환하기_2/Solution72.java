package basic.조건에_맞게_수열_변환하기_2;

import java.util.Arrays;

public class Solution72 {
    public static void main(String[] args) {
        Solution72 solution = new Solution72();
        runTest(solution, new int[] { 1, 2, 3, 100, 99, 98 });
    }

    private static void runTest(Solution72 solution, int[] arr) {
        int result = solution.solution(arr);
        System.out.printf("solution(%s) = %d%n", Arrays.toString(arr), result);
    }

    public int solution(int[] arr) {
        int answer = 0;
        return answer;
    }
}