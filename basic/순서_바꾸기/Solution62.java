package basic.순서_바꾸기;

import java.util.Arrays;

public class Solution62 {
    public static void main(String[] args) {
        Solution62 solution = new Solution62();
        runTest(solution, new int[] {2, 1, 6}, 1);
        runTest(solution, new int[] {5, 2, 1, 7, 5}, 3);
    }

    private static void runTest(Solution62 solution, int[] num_list, int n) {
        int[] result = solution.solution(num_list, n);
        System.out.printf("solution(%s %d) = %s%n", Arrays.toString(num_list), n, Arrays.toString(result));
    }

    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length];
        int splitPoint = num_list.length - n;

        for (int i = 0; i < splitPoint; i++) {
            answer[i] = num_list[n + i];
        }

        for (int i = 0; i < n; i++) {
            answer[splitPoint + i] = num_list[i];
        }

        return answer;
    }
}
