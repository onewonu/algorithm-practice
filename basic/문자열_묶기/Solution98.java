package basic.문자열_묶기;

import java.util.Arrays;

public class Solution98 {
    public static void main(String[] args) {
        Solution98 solution = new Solution98();
        runTest(solution, new String[] { "a","bc","d","efg","hi" });
    }

    private static void runTest(Solution98 solution, String[] strArr) {
        int result = solution.solution(strArr);
        System.out.printf("solution(%s) = %d%n", Arrays.toString(strArr), result);
    }

    public int solution(String[] strArr) {
        int answer = 0;
        return answer;
    }
}