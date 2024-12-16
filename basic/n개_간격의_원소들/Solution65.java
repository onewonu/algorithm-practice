package basic.n개_간격의_원소들;

import java.util.Arrays;

public class Solution65 {
    public static void main(String[] args) {
        Solution65 solution = new Solution65();
        runTest(solution, new int[] {4, 2, 6, 1, 7, 6}, 2);
        runTest(solution, new int[] {4, 2, 6, 1, 7, 6}, 4);
    }

    private static void runTest(Solution65 solution, int[] num_list, int n) {
        int[] result = solution.solution(num_list, n);
        System.out.printf("solution(%s, %d) = %s%n", Arrays.toString(num_list), n, Arrays.toString(result));
    }

    public int[] solution(int[] num_list, int n) {
        int[] answer = {};
        return answer;
    }
}