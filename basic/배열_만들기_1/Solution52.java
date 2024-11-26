package basic.배열_만들기_1;

import java.util.Arrays;

public class Solution52 {
    public static void main(String[] args) {
        Solution52 solution = new Solution52();
        runTest(solution, 10, 3);
        runTest(solution, 15, 5);
    }

    private static void runTest(Solution52 solution, int n, int k) {
        int[] result = solution.solution(n, k);
        System.out.printf("solution(%d %d) = %s%n", n, k, Arrays.toString(result));
    }

    public int[] solution(int n, int k) {
        int[] answer = {};
        return answer;
    }
}