package basic.배열_만들기_6;

import java.util.Arrays;
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
        Stack<Integer> stk = new Stack<>();

        for (int element : arr) {
            if (stk.empty() || element != stk.peek()) {
                stk.push(element);
            } else {
                stk.pop();
            }
        }

        if (stk.empty()) {
            return new int[] {-1};
        }

        return stk.stream().mapToInt(Integer::valueOf).toArray();
    }
}