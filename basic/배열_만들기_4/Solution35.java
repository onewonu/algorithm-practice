package basic.배열_만들기_4;

import java.util.Arrays;
import java.util.Stack;

public class Solution35 {
    public static void main(String[] args) {
        Solution35 solution = new Solution35();
        runTest(solution, new int[] {1, 4, 2, 5, 3});
    }

    private static void runTest(Solution35 solution, int[] n) {
        int[] result = solution.solution(n);
        System.out.printf("solution(%s) = %s%n", Arrays.toString(n), Arrays.toString(result));
    }

    public int[] solution(int[] arr) {
        Stack<Integer> stk = new Stack<>();

        int i = 0;

        while (i < arr.length) {
            if (stk.isEmpty() || stk.peek() < arr[i]) {
                stk.push(arr[i]);
                i++;
            } else {
                stk.pop();
            }
        }

        return stk.stream().mapToInt(Integer::valueOf).toArray();
    }
}