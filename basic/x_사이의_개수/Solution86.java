package basic.x_사이의_개수;

import java.util.Arrays;

public class Solution86 {
    public static void main(String[] args) {
        Solution86 solution = new Solution86();
        runTest(solution, "oxooxoxxox");
        runTest(solution, "xabcxdefxghi");
    }

    private static void runTest(Solution86 solution, String myString) {
        int[] result = solution.solution(myString);
        System.out.printf("solution(%s) = %s%n", myString, Arrays.toString(result));
    }

    public int[] solution(String myString) {
        String[] xes = myString.split("x", -1);
        int[] answer = new int[xes.length];

        for (int i = 0; i < xes.length; i++) {
            answer[i] = xes[i].length();
        }

        return answer;
    }
}