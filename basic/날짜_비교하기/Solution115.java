package basic.날짜_비교하기;

import java.util.Arrays;

public class Solution115 {
    public static void main(String[] args) {
        Solution115 solution = new Solution115();
        runTest(solution, new int[] { 2021, 12, 28 }, new int[] { 2021, 12, 29 });
        runTest(solution, new int[] { 1024, 10, 24 }, new int[] { 1024, 10, 24 });
    }

    private static void runTest(Solution115 solution, int[] date1, int[] date2) {
        int result = solution.solution(date1, date2);
        System.out.printf("solution(%s, %s) = %d%n", Arrays.toString(date1), Arrays.toString(date2), result);
    }

    public int solution(int[] date1, int[] date2) {
        for (int i = 0; i < 3; i++) {
            if (date1[i] < date2[i]) {
                return 1;
            }

            if (date1[i] > date2[i]) {
                return 0;
            }
        }

        return 0;
    }
}