package basic.수_조작하기_2;

import java.util.Arrays;

public class Solution28 {
    public static void main(String[] args) {
        Solution28 solution = new Solution28();
        runTest(solution, new int[]{0, 1, 0, 10, 0, 1, 0, 10, 0, -1, -2, -1});
    }

    private static void runTest(Solution28 solution, int[] numLog) {
        String result = solution.solution(numLog);
        System.out.printf("solution(%s) = %s%n", Arrays.toString(numLog), result);
    }

    public String solution(int[] numLog) {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 1; i < numLog.length; i++) {

            int currentValue = numLog[i];
            int previousValue = numLog[i - 1];

            int difference = currentValue - previousValue;

            stringBuilder.append(
                    switch (difference) {
                        case 1 -> "w";
                        case -1 -> "s";
                        case 10 -> "d";
                        case -10 -> "a";
                        default -> "";
                    }
            );
        }

        return stringBuilder.toString();
    }
}