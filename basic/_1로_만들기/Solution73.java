package basic._1로_만들기;

import java.util.Arrays;

public class Solution73 {
    public static void main(String[] args) {
        Solution73 solution = new Solution73();
        runTest(solution, new int[] { 12, 4, 15, 1, 14 });
    }

    private static void runTest(Solution73 solution, int[] num_list) {
        int result = solution.solution(num_list);
        System.out.printf("solution(%s) = %d%n", Arrays.toString(num_list), result);
    }

    public int solution(int[] num_list) {
        int totalCount = 0;

        for (int number : num_list) {
            int count = 0;

            while (number > 1) {
                if (number % 2 == 0) number /= 2;
                else number = (number - 1) / 2;
                count++;
            }

            totalCount += count;
        }

        return totalCount;
    }
}