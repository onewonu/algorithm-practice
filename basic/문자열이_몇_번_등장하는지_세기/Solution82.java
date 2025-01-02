package basic.문자열이_몇_번_등장하는지_세기;

import java.util.Arrays;

public class Solution82 {
    public static void main(String[] args) {
        Solution82 solution = new Solution82();
        runTest(solution, "banana", "ana");
        runTest(solution, "aaaa", "aa");
    }

    private static void runTest(Solution82 solution, String my_string, String pat) {
        int result = solution.solution(my_string, pat);
        System.out.printf("solution(%s, %s) = %d%n", my_string, pat, result);
    }

    public int solution(String myString, String pat) {
        int answer = 0;

        for (int i = 0; i < myString.length(); i++) {
            i = myString.indexOf(pat, i);
            if (i == -1) return answer;
            answer++;
        }
        return answer;
    }
}