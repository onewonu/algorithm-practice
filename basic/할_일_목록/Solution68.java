package basic.할_일_목록;

import java.util.Arrays;

public class Solution68 {
    public static void main(String[] args) {
        Solution68 solution = new Solution68();
        runTest(solution, new String[] {"problemsolving", "practiceguitar", "swim", "studygraph"}, new boolean[] {true, false, true, false});
    }

    private static void runTest(Solution68 solution, String[] todo_list, boolean[] finished) {
        String[] result = solution.solution(todo_list, finished);
        System.out.printf("solution(%s %s) = %s%n", Arrays.toString(todo_list), Arrays.toString(finished), Arrays.toString(result));
    }

    public String[] solution(String[] todo_list, boolean[] finished) {
        String[] answer = {};
        return answer;
    }
}