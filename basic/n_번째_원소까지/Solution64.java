package basic.n_번째_원소까지;

import java.util.Arrays;

public class Solution64 {
    public static void main(String[] args) {
        Solution64 solution = new Solution64();
        runTest(solution, new int[] {2, 1, 6}, 1);
        runTest(solution, new int[] {5, 2, 1, 7, 5}, 3);
    }

    private static void runTest(Solution64 solution, int[] num_list, int n) {
        int[] result = solution.solution(num_list, n);
        System.out.printf("solution(%s, %d) = %s%n", Arrays.toString(num_list), n, Arrays.toString(result));
    }

    public int[] solution(int[] num_list, int n) {
        return Arrays.copyOfRange(num_list, 0, n);
    }
}