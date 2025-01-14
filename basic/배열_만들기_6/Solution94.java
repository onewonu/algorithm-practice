package basic.배열_만들기_6;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Stack;

public class Solution94 {
    public static void main(String[] args) {
        Solution94 solution = new Solution94();
        runTest(solution, new int[]{ 0, 1, 1, 1, 0 });
        runTest(solution, new int[]{ 0, 1, 0, 1, 0 });
        runTest(solution, new int[]{ 0, 1, 1, 0 });
    }

    private static void runTest(Solution94 solution, int[] arr) {
        int[] result = solution.solution(arr);
        System.out.printf("solution(%s) = %s%n", Arrays.toString(arr), Arrays.toString(result));
    }

    public int[] solution(int[] arr) {
        Deque<Integer> stk = new ArrayDeque<>();

        for (int num : arr) {
            if (stk.isEmpty() || num != stk.peekLast()) {
                stk.addLast(num);
            } else {
                stk.removeLast();
            }
        }

        if (stk.isEmpty()) {
            return new int[]{-1};
        }

        return stk.stream().mapToInt(Integer::valueOf).toArray();
    }
}