package basic.이어_붙인_수;

import java.util.Arrays;

public class Solution25 {
    public static void main(String[] args) {
        Solution25 solution = new Solution25();
        runTest(solution, new int[]{3, 4, 5, 2, 1});
        runTest(solution, new int[]{5, 7, 8, 3});
    }

    private static void runTest(Solution25 solution, int[] num_list) {
        int result = solution.solution(num_list);
        System.out.printf("solution(%s) = %s%n", Arrays.toString(num_list), result);
    }

    public int solution(int[] num_list) {
        int answer = 0;
        return answer;
    }
}