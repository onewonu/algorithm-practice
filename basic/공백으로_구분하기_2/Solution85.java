package basic.공백으로_구분하기_2;

import java.util.Arrays;

public class Solution85 {
    public static void main(String[] args) {
        Solution85 solution = new Solution85();
        runTest(solution, "i    love  you");
        runTest(solution, "    programmers  ");
    }

    private static void runTest(Solution85 solution, String my_string) {
        String[] result = solution.solution(my_string);
        System.out.printf("solution(%s) = %s%n", my_string, Arrays.toString(result));
    }

    public String[] solution(String my_string) {
        String[] answer = {};
        return answer;
    }
}