package basic.카운트_업;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution33 {
    public static void main(String[] args) {
        Solution33 solution = new Solution33();
        runTest(solution, 3, 10);
    }

    private static void runTest(Solution33 solution, int start_num, int end_num) {
        int[] result = solution.solution(start_num, end_num);
        System.out.printf("solution(%d, %d) = %s%n", start_num, end_num, Arrays.toString(result));
    }

    public int[] solution(int start_num, int end_num) {
        int[] answer = {};
        return answer;
    }
}