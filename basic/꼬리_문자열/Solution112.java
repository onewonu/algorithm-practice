package basic.꼬리_문자열;

import java.util.Arrays;

public class Solution112 {
    public static void main(String[] args) {
        Solution112 solution = new Solution112();
        runTest(solution, new String[]{ "abc", "def", "ghi" }, "ef");
        runTest(solution, new String[]{ "abc", "bbc", "cbc" }, "c");
    }

    private static void runTest(Solution112 solution, String[] str_list, String ex) {
        String result = solution.solution(str_list, ex);
        System.out.printf("solution(%s, %s) = %s%n", Arrays.toString(str_list), ex, result);
    }

    public String solution(String[] str_list, String ex) {
        String answer = "";
        return answer;
    }
}