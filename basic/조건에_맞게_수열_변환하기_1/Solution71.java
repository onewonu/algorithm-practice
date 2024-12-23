package basic.조건에_맞게_수열_변환하기_1;

import java.util.Arrays;

public class Solution71 {
    public static void main(String[] args) {
        Solution71 solution = new Solution71();
        runTest(solution, new int[] { 1, 2, 3, 100, 99, 98 });
    }

    private static void runTest(Solution71 solution, int[] arr) {
        int[] result = solution.solution(arr);
        System.out.printf("solution(%s) = %s%n", Arrays.toString(arr), Arrays.toString(result));
    }

    public int[] solution(int[] arr) {
        int[] answer = {};
        return answer;
    }
}