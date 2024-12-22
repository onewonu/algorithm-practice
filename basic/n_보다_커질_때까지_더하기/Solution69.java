package basic.n_보다_커질_때까지_더하기;

import java.util.Arrays;

public class Solution69 {
    public static void main(String[] args) {
        Solution69 solution = new Solution69();
        runTest(solution, new int[] {34, 5, 71, 29, 100, 34}, 123);
        runTest(solution, new int[] {58, 44, 27, 10, 100}, 139);
    }

    private static void runTest(Solution69 solution, int[] numbers, int n) {
        int result = solution.solution(numbers, n);
        System.out.printf("solution(%s %d) = %d%n", Arrays.toString(numbers), n, result);
    }

    public int solution(int[] numbers, int n) {
        int answer = 0;
        for (int number : numbers) {
            answer += number;
            if (answer > n) return answer;
        }

        return answer;
    }
}