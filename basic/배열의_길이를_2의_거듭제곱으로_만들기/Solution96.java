package basic.배열의_길이를_2의_거듭제곱으로_만들기;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class Solution96 {
    public static void main(String[] args) {
        Solution96 solution = new Solution96();
        runTest(solution, new int[]{ 1, 2, 3, 4, 5, 6 });
        runTest(solution, new int[]{ 58, 172, 746, 89 });
    }

    private static void runTest(Solution96 solution, int[] arr) {
        int[] result = solution.solution(arr);
        System.out.printf("solution(%s, %d) = %s%n", Arrays.toString(arr), Arrays.toString(result));
    }

    public int[] solution(int[] arr) {
        int[] answer = {};
        return answer;
    }
}