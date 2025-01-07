package basic.공백으로_구분하기_1;

import java.util.Arrays;

public class Solution84 {
    public static void main(String[] args) {
        Solution84 solution = new Solution84();
        runTest(solution, "i love you");
        runTest(solution, "programmers");
    }

    private static void runTest(Solution84 solution, String my_string) {
        String[] result = solution.solution(my_string);
        System.out.printf("solution(%s) = %s%n", my_string, Arrays.toString(result));
    }

    public String[] solution(String my_string) {
        return my_string.split(" ");
    }
}