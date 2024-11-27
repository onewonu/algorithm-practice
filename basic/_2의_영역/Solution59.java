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
        // TODO: 처음으로 2를 만났을 때 startIndex 를 설정.
        // TODO: 2를 만날 때마다 endIndex 를 갱신.
        // TODO: 만약 startIndex 와 endIndex 가 갱신되지 않았다면, 배열에 2가 없는 것이므로 [-1]을 반환.

        int start = -1;
        int end = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 2) {
                if (start == -1) {
                    start = i;
                }
                end = i;
            }
        }

        if (start == -1) {
            return new int[]{-1};
        }

        int[] answer = new int[end - start + 1];
        for (int i = start; i <= end; i++) {
            answer[i - start] = arr[i];
        }

        return answer;
    }
}
