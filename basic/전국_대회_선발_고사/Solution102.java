package basic.전국_대회_선발_고사;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Solution102 {
    public static void main(String[] args) {
        Solution102 solution = new Solution102();
        runTest(solution, new int[] { 3, 7, 2, 5, 4, 6, 1 }, new boolean[] { false, true, true, true, true, false, false });
        runTest(solution, new int[] { 1, 2, 3 }, new boolean[] { true, true, true });
        runTest(solution, new int[] { 6, 1, 5, 2, 3, 4 }, new boolean[] { true, false, true, false, false, true });
    }

    private static void runTest(Solution102 solution, int[] rank, boolean[] attendance) {
        int result = solution.solution(rank, attendance);
        System.out.printf("solution(%s, %s) = %s%n", Arrays.toString(rank), Arrays.toString(attendance) ,result);
    }

    public int solution(int[] rank, boolean[] attendance) {
        List<int[]> list = new ArrayList<>();
        for (int i = 0; i < rank.length; i++) {
            if (attendance[i]) {
                list.add(new int[]{rank[i], i});
            }
        }
        list.sort(Comparator.comparingInt(a -> a[0]));

        int a = list.get(0)[1];
        int b = list.get(1)[1];
        int c = list.get(2)[1];
        return 10000 * a + 100 * b + c;
    }
}