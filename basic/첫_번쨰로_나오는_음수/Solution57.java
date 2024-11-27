package basic.첫_번쨰로_나오는_음수;

import java.util.Arrays;

public class Solution57 {
    public static void main(String[] args) {
        Solution57 solution = new Solution57();
        runTest(solution, new int[] {12, 4, 15, 46, 38, -2, 15});
        runTest(solution, new int[] {13, 22, 53, 24, 15, 6});
    }

    private static void runTest(Solution57 solution, int[] num_list) {
        int result = solution.solution(num_list);
        System.out.printf("solution(%s) = %d%n", Arrays.toString(num_list), result);
    }

    public int solution(int[] num_list) {
        int answer = 0;
        return answer;
    }
}
