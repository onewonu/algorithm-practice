package basic.배열의_길이에_따라_다른_연산하기;

import java.util.Arrays;

public class Solution99 {
    public static void main(String[] args) {
        Solution99 solution = new Solution99();
        runTest(solution, new int[] { 49, 12, 100, 276, 33 }, 27);
        runTest(solution, new int[] { 444, 555, 666, 777 }, 100);
    }

    private static void runTest(Solution99 solution, int[] arr, int n) {
        int[] result = solution.solution(arr, n);
        System.out.printf("solution(%s, %d) = %s%n", Arrays.toString(arr), n, Arrays.toString(result));
    }

    public int[] solution(int[] arr, int n) {
        if (arr.length % 2 == 0) {
            for (int i = 1; i < arr.length; i += 2) {
                System.out.println("i = " + i);
                arr[i] += n;
            }
        } else {
            for (int i = 0; i < arr.length; i += 2) {
                System.out.println("i = " + i);
                arr[i] += n;
            }
        }

        return arr;
    }
}