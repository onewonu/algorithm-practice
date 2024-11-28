package basic.배열_조각하기;

import java.util.Arrays;

public class Solution60 {
    public static void main(String[] args) {
        Solution60 solution = new Solution60();
        runTest(solution, new int[] {0, 1, 2, 3, 4, 5}, new int[] {4, 1, 2});
        //runTest(solution, new int[] {0, 1, 2, 3, 4, 5}, new int[] {4, 1, 2, 1});
    }

    private static void runTest(Solution60 solution, int[] arr, int[] query) {
        int[] result = solution.solution(arr, query);
        System.out.printf("solution(%s %s) = %s%n", Arrays.toString(arr), Arrays.toString(query), Arrays.toString(result));
    }

    public int[] solution(int[] arr, int[] query) {
        int start = 0;
        int end = arr.length;

        for (int i = 0; i < query.length; i++) {
            if (i % 2 == 0) {
                end = start + query[i];
            } else {
                start += query[i];
            }
        }

        return Arrays.copyOfRange(arr, start, end + 1);
    }
}
