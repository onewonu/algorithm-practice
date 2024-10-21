package basic.수_조작하기_2;

import java.util.Arrays;

public class Solution28 {
    public static void main(String[] args) {
        Solution28 solution = new Solution28();
        runTest(solution, new int[]{0, 1, 0, 10, 0, 1, 0, 10, 0, -1, -2, -1});
    }

    private static void runTest(Solution28 solution, int[] numLog) {
        String result = solution.solution(numLog);
        System.out.printf("solution(%s) = %s%n", Arrays.toString(numLog) ,result);
    }

    public String solution(int[] numLog) {
        String answer = "";
        return answer;
    }
}