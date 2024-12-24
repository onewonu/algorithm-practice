package basic.조건에_맞게_수열_변환하기_2;

import java.util.Arrays;

public class Solution72 {
    public static void main(String[] args) {
        Solution72 solution = new Solution72();
        runTest(solution, new int[] { 1, 2, 3, 100, 99, 98 });
    }

    private static void runTest(Solution72 solution, int[] arr) {
        int result = solution.solution(arr);
        System.out.printf("solution(%s) = %d%n", Arrays.toString(arr), result);
    }

    public int solution(int[] arr) {
        int count = 0;

        while (true) {
            int[] newArr = new int[arr.length];

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] >= 50 && arr[i] % 2 == 0) {
                    newArr[i] = arr[i] / 2;
                } else if (arr[i] < 50 && arr[i] % 2 == 1) {
                    newArr[i] = (arr[i] * 2) + 1;
                } else {
                    newArr[i] = arr[i];
                }
            }

            if (Arrays.equals(arr, newArr)) break;

            arr = newArr;

            count++;
        }

        return count;
    }
}