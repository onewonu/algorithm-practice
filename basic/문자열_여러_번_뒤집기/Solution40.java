package basic.문자열_여러_번_뒤집기;

import java.util.Arrays;

public class Solution40 {
    public static void main(String[] args) {
        Solution40 solution = new Solution40();
        runTest(solution, "rermgorpsam", new int[][] { {2, 3}, {0, 7}, {5, 9}, {6, 10} });
    }

    private static void runTest(Solution40 solution, String my_string, int[][] queries) {
        String result = solution.solution(my_string, queries);
        System.out.printf("solution(%s, %s) = %s%n", my_string, Arrays.deepToString(queries), result);
    }

    public String solution(String my_string, int[][] queries) {
        char[] charArray = my_string.toCharArray();

        for (int[] query : queries) {
            int start = query[0];
            int end = query[1];

            while (start < end) {
                char temp = charArray[start];
                charArray[start] = charArray[end];
                charArray[end] = temp;

                start++;
                end--;
            }
        }

        return new String(charArray);
    }
}