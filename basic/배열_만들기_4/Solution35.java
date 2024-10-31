package basic.배열_만들기_4;

import java.util.Arrays;

public class Solution35 {
    public static void main(String[] args) {
        Solution35 solution = new Solution35();
        runTest(solution, new int[] {1, 4, 2, 5, 3});
    }

    private static void runTest(Solution35 solution, int[] n) {
        int[] result = solution.solution(n);
        System.out.printf("solution(%s) = %s%n", Arrays.toString(n), Arrays.toString(result));
    }

    public int[] solution(int[] arr) {
        int[] stk = {};
        return stk;
    }
}