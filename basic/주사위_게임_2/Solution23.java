package basic.주사위_게임_2;

import java.util.Arrays;

public class Solution23 {
    public static void main(String[] args) {
        Solution23 solution = new Solution23();
        runTest(solution, 2, 6, 2);
        runTest(solution, 5, 3, 3);
        runTest(solution, 4, 4, 4);
    }

    private static void runTest(Solution23 solution, int a, int b, int c) {
        int result = solution.solution(a, b, c);
        System.out.printf("solution(%d, %d, %d) = %s%n", a, b, c, result);
    }

    public int solution(int a, int b, int c) {
        int answer = 0;
        return answer;
    }
}