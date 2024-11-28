package basic.n_번쨰_요소_부터;

import java.util.Arrays;

public class Solution61 {
    public static void main(String[] args) {
        Solution61 solution = new Solution61();
        runTest(solution, new int[] {2, 1, 6}, 3);
        runTest(solution, new int[] {5, 2, 1, 7, 5}, 2);
    }

    private static void runTest(Solution61 solution, int[] num_list, int n) {
        int[] result = solution.solution(num_list, n);
        System.out.printf("solution(%s %d) = %s%n", Arrays.toString(num_list), n, Arrays.toString(result));
    }

    public int[] solution(int[] num_list, int n) {
        int[] anwser = new int[num_list.length - (n - 1)];

        return null;
    }
}
