package basic.빈_배열_추가_삭제하기;

import java.util.Arrays;

public class Solution93 {
    public static void main(String[] args) {
        Solution93 solution = new Solution93();
        runTest(solution, new int[]{ 3, 2, 4, 1, 3 }, new boolean[]{ true, false, true, false, false });
    }

    private static void runTest(Solution93 solution, int[] arr, boolean[] flag) {
        int[] result = solution.solution(arr, flag);
        System.out.printf("solution(%s, %s) = %s%n", Arrays.toString(arr), Arrays.toString(flag), Arrays.toString(result));
    }

    public int[] solution(int[] arr, boolean[] flag) {
        int[] answer = {};
        return answer;
    }
}