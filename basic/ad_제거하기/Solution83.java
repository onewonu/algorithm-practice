package basic.ad_제거하기;

import java.util.Arrays;

public class Solution83 {
    public static void main(String[] args) {
        Solution83 solution = new Solution83();
        runTest(solution, new String[]{ "and","notad","abcd" });
        runTest(solution, new String[]{ "there","are","no","a","ds" });
    }

    private static void runTest(Solution83 solution, String[] strArr) {
        String[] result = solution.solution(strArr);
        System.out.printf("solution(%s) = %s%n", Arrays.toString(strArr), Arrays.toString(result));
    }

    public String[] solution(String[] strArr) {
        String[] answer = {};
        return answer;
    }
}