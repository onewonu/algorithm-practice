package basic.카운트_다운;

import java.util.Arrays;

public class Solution54 {
    public static void main(String[] args) {
        Solution54 solution = new Solution54();
        runTest(solution, 10, 3);
    }

    private static void runTest(Solution54 solution, int start_num, int end_num) {
        int[] result = solution.solution(start_num, end_num);
        System.out.printf("solution(%s %s) = %s%n", start_num, end_num, Arrays.toString(result));
    }

    public int[] solution(int start_num, int end_num) {
        int[] answer = {};
        return answer;
    }
}