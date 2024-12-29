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
            totalCount += calculateOperation(number);
        }
        return totalCount;
    }

    private int calculateOperation(int number) {
        if (number == 1) return 0;
        if (number % 2 == 0) return 1 + calculateOperation(number / 2);
        else return 1 + calculateOperation((number - 1) / 2);
    }
}