package basic.배열_비교하기;

import java.util.Arrays;

public class Solution97 {
    public static void main(String[] args) {
        Solution97 solution = new Solution97();
        runTest(solution, new int[]{ 49, 13 }, new int[] { 70, 11, 2 });
        runTest(solution, new int[]{ 100, 17, 84, 1 }, new int[] { 55, 12, 65, 36 });
        runTest(solution, new int[]{ 1, 2, 3, 4, 5 }, new int[] { 3, 3, 3, 3, 3 });
    }

    private static void runTest(Solution97 solution, int[] arr1, int[] arr2) {
        int result = solution.solution(arr1, arr2);
        System.out.printf("solution(%s, %s) = %d%n", Arrays.toString(arr1), Arrays.toString(arr2), result);
    }

    public int solution(int[] arr1, int[] arr2) {
        int answer = 0;
        return answer;
    }
}