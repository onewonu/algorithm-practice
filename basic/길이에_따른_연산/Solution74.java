package basic.길이에_따른_연산;

import java.util.Arrays;

public class Solution74 {
    public static void main(String[] args) {
        Solution74 solution = new Solution74();
        runTest(solution, new int[] { 3, 4, 5, 2, 5, 4, 6, 7, 3, 7, 2, 2, 1 });
        runTest(solution, new int[] { 2, 3, 4, 5 });
    }

    private static void runTest(Solution74 solution, int[] num_list) {
        int result = solution.solution(num_list);
        System.out.printf("solution(%s) = %d%n", Arrays.toString(num_list), result);
    }

    public int solution(int[] num_list) {
        final int LENGTH_THRESHOLD = 11;

        int answer;

        if (num_list.length >= LENGTH_THRESHOLD) {
            answer = 0;
            for (int num : num_list) answer += num;
        } else {
            answer = 1;
            for (int num : num_list) answer *= num;
        }

        return answer;
    }
}