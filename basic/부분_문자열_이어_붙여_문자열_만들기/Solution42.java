package basic.부분_문자열_이어_붙여_문자열_만들기;

import java.util.Arrays;

public class Solution42 {
    public static void main(String[] args) {
        Solution42 solution = new Solution42();
        runTest(solution, new String[] { "progressive", "hamburger", "hammer", "ahocorasick" }, new int[][]{ {0, 4}, {1, 2}, {3, 5}, {7, 7} });
    }

    private static void runTest(Solution42 solution, String[] my_strings, int[][] parts) {
        String result = solution.solution(my_strings, parts);
        System.out.printf("solution(%s %s) = %s%n", Arrays.toString(my_strings), Arrays.deepToString(parts), result);
    }

    public String solution(String[] my_strings, int[][] parts) {
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < my_strings.length; i++) {
            String currentString = my_strings[i];
            String substring = currentString.substring(parts[i][0], parts[i][1] + 1);
            builder.append(substring);
        }

        return builder.toString();
    }
}