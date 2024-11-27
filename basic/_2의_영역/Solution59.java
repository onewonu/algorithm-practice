package basic._2의_영역;

import java.util.Arrays;

public class Solution59 {
    public static void main(String[] args) {
        Solution59 solution = new Solution59();
        runTest(solution, new int[] {1, 2, 1, 4, 5, 2, 9});
        runTest(solution, new int[] {1, 2, 1});
        runTest(solution, new int[] {1, 1, 1});
        runTest(solution, new int[] {1, 2, 1, 2, 1, 10, 2, 1});
    }

    private static void runTest(Solution59 solution, int[] arr) {
        int[] result = solution.solution(arr);
        System.out.printf("solution(%s) = %s%n", Arrays.toString(arr), Arrays.toString(result));
    }

    public int[] solution(int[] arr) {
        final int NOT_FOUND = -1;

        int start = NOT_FOUND;
        int end = NOT_FOUND;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 2) {
                if (start == NOT_FOUND) start = i;
                end = i;
            }
        }

        if (start == -1) return new int[]{NOT_FOUND};

        int size = end - start + 1;
        int[] answer = new int[size];
        System.arraycopy(arr, start, answer, 0, size);

        return answer;
    }
}
