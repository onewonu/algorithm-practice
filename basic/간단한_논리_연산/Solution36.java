package basic.간단한_논리_연산;

import java.util.Arrays;
import java.util.Stack;

public class Solution36 {
    public static void main(String[] args) {
        Solution36 solution = new Solution36();

        runTest(solution, false, true, true, true);
        runTest(solution, true, false, false, false);
    }

    private static void runTest(Solution36 solution, boolean x1, boolean x2, boolean x3, boolean x4) {
        boolean result = solution.solution(x1, x2, x3, x4);
        System.out.printf("solution(%s, %s, %s, %s) = %s%n", x1, x2, x3, x4, result);
    }

    public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        boolean answer = true;
        return answer;
    }
}