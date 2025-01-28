package basic.정수_찾기;

import java.util.Arrays;

public class Solution113 {
    public static void main(String[] args) {
        Solution113 solution = new Solution113();
        runTest(solution, new int[] { 1, 2, 3, 4, 5 }, 3);
        runTest(solution, new int[] { 15, 98, 23, 2, 15 }, 20);
    }

    private static void runTest(Solution113 solution, int[] num_list, int n) {
        int result = solution.solution(num_list, n);
        System.out.printf("solution(%s, %d) = %d%n", Arrays.toString(num_list), n, result);
    }

    public int solution(int[] num_list, int n) {
        int answer = 0;
        return answer;
    }
}