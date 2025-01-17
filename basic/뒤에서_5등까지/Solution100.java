package basic.뒤에서_5등까지;

import java.util.Arrays;

public class Solution100 {
    public static void main(String[] args) {
        Solution100 solution = new Solution100();
        runTest(solution, new int[] { 12, 4, 15, 46, 38, 1, 14 });
    }

    private static void runTest(Solution100 solution, int[] num_list) {
        int[] result = solution.solution(num_list);
        System.out.printf("solution(%s) = %s%n", Arrays.toString(num_list), Arrays.toString(result));
    }

    public int[] solution(int[] num_list) {
        int[] answer = {};
        return answer;
    }
}