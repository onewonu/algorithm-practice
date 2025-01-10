package basic.배열의_원소만큼_추가하기;

import java.util.Arrays;

public class Solution92 {
    public static void main(String[] args) {
        Solution92 solution = new Solution92();
        runTest(solution, new int[]{ 5, 1, 4 });
        runTest(solution, new int[]{ 6, 6 });
        runTest(solution, new int[]{ 1 });
    }

    private static void runTest(Solution92 solution, int[] arr) {
        int[] result = solution.solution(arr);
        System.out.printf("solution(%s) = %s%n", Arrays.toString(arr), Arrays.toString(result));
    }

    public int[] solution(int[] arr) {
        int[] answer = {};
        return answer;
    }
}