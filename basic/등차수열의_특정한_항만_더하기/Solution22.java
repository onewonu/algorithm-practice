package basic.등차수열의_특정한_항만_더하기;

import java.util.Arrays;

public class Solution22 {
    public static void main(String[] args) {
        Solution22 solution = new Solution22();
        runTest(solution, 3, 4, new boolean[]{true, false, false, true, true});
        runTest(solution, 7, 1, new boolean[]{false, false, false, true, false, false, false});
    }

    private static void runTest(Solution22 solution, int a, int d, boolean[] included) {
        int result = solution.solution(a, d, included);
        System.out.printf("solution(%d, %d, %s) = %s%n", a, d, Arrays.toString(included), result);
    }

    public int solution(int a, int d, boolean[] included) {
        int answer = 0;

        for (int i = 0; i < included.length; i++) {
            if (included[i]) { answer += a + (i * d); }
        }

        return answer;
    }
}