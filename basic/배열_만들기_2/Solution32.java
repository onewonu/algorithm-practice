package basic.배열_만들기_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution32 {
    public static void main(String[] args) {
        Solution32 solution = new Solution32();
        runTest(solution, 5, 555);
        runTest(solution, 10, 20);
    }

    private static void runTest(Solution32 solution, int l, int r) {
        int[] result = solution.solution(l, r);
        System.out.printf("solution(%d, %d) = %s%n", l, r, Arrays.toString(result));
    }

    public int[] solution(int l, int r) {
        List<Integer> resultList = new ArrayList<>();

        for (int i = l; i <= r; i++) {
            if (isZeroAndFive(i)) resultList.add(i);
        }

        if (resultList.isEmpty()) return new int[]{-1};

        int[] resultArray = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            resultArray[i] = resultList.get(i);
        }

        return resultArray;
    }

    private boolean isZeroAndFive(int number) {
        if (number == 0) return false;

        while (number > 0) {
            int digit = number % 10;
            if (digit != 0 && digit != 5) return false;
            number /= 10;
        }

        return true;
    }
}