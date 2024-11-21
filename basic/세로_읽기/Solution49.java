package basic.세로_읽기;

import java.util.Arrays;

public class Solution49 {
    public static void main(String[] args) {
        Solution49 solution = new Solution49();
        runTest(solution, "ihrhbakrfpndopljhygc", 4, 2);
        runTest(solution, "programmers", 1, 1);
    }

    private static void runTest(Solution49 solution, String my_string, int m, int c) {
        String result = solution.solution(my_string, m, c);
        System.out.printf("solution(%s %d %d) = %s%n", my_string, m, c, result);
    }

    public String solution(String my_string, int m, int c) {
        String answer = "";

        for (int i = 0; i < my_string.length(); i += 4) {
            String substring = my_string.substring(i, i + m);
            System.out.println("substring = " + substring);
        }

        return answer;
    }
}