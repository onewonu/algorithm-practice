package basic.배열의_길이를_2의_거듭제곱으로_만들기;

import java.util.Arrays;

public class Solution96 {
    public static void main(String[] args) {
        Solution96 solution = new Solution96();
        runTest(solution, new int[]{ 1, 2, 3, 4, 5, 6 });
        runTest(solution, new int[]{ 58, 172, 746, 89 });
    }

    private static void runTest(Solution96 solution, int[] arr) {
        int[] result = solution.solution(arr);
        System.out.printf("solution(%s) = %s%n", Arrays.toString(arr), Arrays.toString(result));
    }

    public int[] solution(int[] arr) {
        int arrLength = arr.length;
        if ((arrLength & (arrLength - 1)) == 0) {
            return arr;
        }

        int nearestPowerOfTwo = 1;
        while (nearestPowerOfTwo < arrLength) {
            nearestPowerOfTwo <<= 1;
        }

        int[] answer = new int[nearestPowerOfTwo];
        System.arraycopy(arr, 0, answer, 0, arrLength);
        return answer;
    }
}