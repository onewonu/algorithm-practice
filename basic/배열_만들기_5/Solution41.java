package basic.배열_만들기_5;

import java.util.Arrays;
import java.util.Stack;

public class Solution41 {
    public static void main(String[] args) {
        Solution41 solution = new Solution41();
        runTest(solution, new String[] {"0123456789","9876543210","9999999999999"}, 50000, 5, 5);
    }

    private static void runTest(Solution41 solution, String[] intStrs, int k, int s, int l) {
        int[] result = solution.solution(intStrs, k, s, l);
        System.out.printf("solution(%s %d %d %d) = %s%n", Arrays.toString(intStrs), k, s, l, Arrays.toString(result));
    }

    public int[] solution(String[] intStrs, int k, int s, int l) {
        int[] answer = {};
        return answer;
    }
}