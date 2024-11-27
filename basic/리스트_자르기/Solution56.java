package basic.리스트_자르기;

import java.util.Arrays;

public class Solution56 {
    public static void main(String[] args) {
        Solution56 solution = new Solution56();
        runTest(solution, 3, new int[] {1, 5, 2}, new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9});
        runTest(solution, 4, new int[] {1, 5, 2}, new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9});

    }

    private static void runTest(Solution56 solution, int n, int[] slicer, int[] num_list) {
        int[] result = solution.solution(n, slicer, num_list);
        System.out.printf("solution(%d %s %s) = %s%n", n, Arrays.toString(slicer), Arrays.toString(num_list), Arrays.toString(result));
    }

    public int[] solution(int n, int[] slicer, int[] num_list) {
        int[] answer = {};
        return answer;
    }
}
