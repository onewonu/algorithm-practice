package basic.문자열_잘라서_정렬하기;

import java.util.Arrays;

public class Solution87 {
    public static void main(String[] args) {
        Solution87 solution = new Solution87();
        runTest(solution, "axbxcxdx");
        runTest(solution, "dxccxbbbxaaaa");
    }

    private static void runTest(Solution87 solution, String myString) {
        String[] result = solution.solution(myString);
        System.out.printf("solution(%s) = %s%n", myString, Arrays.toString(result));
    }

    public String[] solution(String myString) {
        String[] answer = {};
        return answer;
    }
}