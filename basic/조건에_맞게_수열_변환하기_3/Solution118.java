package basic.조건에_맞게_수열_변환하기_3;

import java.util.Arrays;

public class Solution118 {
    public static void main(String[] args) {
        Solution118 solution = new Solution118();
        runTest(solution, new int[]{ 1, 2, 3, 100, 99, 98 }, 3);
        runTest(solution, new int[]{ 1, 2, 3, 100, 99, 98 }, 2);
    }

    private static void runTest(Solution118 solution, int[] arr, int k) {
        int[] result = solution.solution(arr, k);
        System.out.printf("solution(%s, %d) = %s%n", Arrays.toString(arr), k, Arrays.toString(result));
    }

    public int[] solution(int[] arr, int k) {
        boolean isOdd = k % 2 == 1;

        for (int i = 0; i < arr.length; i++) {
            if (isOdd) {
                arr[i] = arr[i] * k;
            } else {
                arr[i] = arr[i] + k;
            }
        }

        return arr;
    }
}