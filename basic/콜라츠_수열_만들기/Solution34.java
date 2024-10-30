package basic.콜라츠_수열_만들기;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution34 {
    public static void main(String[] args) {
        Solution34 solution = new Solution34();
        runTest(solution, 10);
    }

    private static void runTest(Solution34 solution, int n) {
        int[] result = solution.solution(n);
        System.out.printf("solution(%d) = %s%n", n, Arrays.toString(result));
    }

    public int[] solution(int n) {
        List<Integer> arrayList = new ArrayList<>();

        do {
            arrayList.add(n);

            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = 3 * n + 1;
            }
        } while (n != 1);

        arrayList.add(1);

        return arrayList.stream().mapToInt(Integer::valueOf).toArray();
    }
}