package basic.배열_만들기_2;

import java.util.Arrays;

public class Solution32 {
    public static void main(String[] args) {
        Solution32 solution = new Solution32();
        runTest(solution, 5, 555);
        runTest(solution, 10, 20);
    }

    private static void runTest(Solution32 solution, int l, int r) {
        int[] result = solution.solution(l, r);
        System.out.printf("solution(%d, %d) = %s%n", l, r, Arrays.toString(result));
    }

    public int[] solution(int l, int r) {
        int[] answer = {};
        return answer;
    }
}