package basic.왼쪽_오른쪽;

import java.util.Arrays;

public class Solution63 {
    public static void main(String[] args) {
        Solution63 solution = new Solution63();
        runTest(solution, new String[] {"u", "u", "l", "r"});
        runTest(solution, new String[] {"l"});
    }

    private static void runTest(Solution63 solution, String[] str_list) {
        String[] result = solution.solution(str_list);
        System.out.printf("solution(%s) = %s%n", Arrays.toString(str_list), Arrays.toString(result));
    }

    public String[] solution(String[] str_list) {
        String[] answer = {};
        return answer;
    }
}