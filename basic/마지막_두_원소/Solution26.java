package basic.마지막_두_원소;

import java.util.Arrays;

public class Solution26 {
    public static void main(String[] args) {
        Solution26 solution = new Solution26();
        runTest(solution, new int[]{2, 1, 6});
        runTest(solution, new int[]{5, 2, 1, 7, 5});
    }

    private static void runTest(Solution26 solution, int[] num_list) {
        int[] result = solution.solution(num_list);
        System.out.printf("solution(%s) = %s%n", Arrays.toString(num_list), Arrays.toString(result));
    }

    public int[] solution(int[] num_list) {
        int[] answer = {};
        return answer;
    }
}