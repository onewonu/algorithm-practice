package basic.원소들의_곱과_합;

import java.util.Arrays;

public class Solution24 {
    public static void main(String[] args) {
        Solution24 solution = new Solution24();
        runTest(solution, new int[]{3, 4, 5, 2, 1});
        runTest(solution, new int[]{5, 7, 8, 3});
    }

    private static void runTest(Solution24 solution, int[] num_list) {
        int result = solution.solution(num_list);
        System.out.printf("solution(%s) = %s%n", Arrays.toString(num_list), result);
    }

    public int solution(int[] num_list) {
        int answer = 0;

        int mul = 1;
        int sum = 0;

        for (int i : num_list) {
            mul *= i;
            sum += i;
        }

        if ((Math.pow(sum, 2)) > mul) { answer = 1; }

        return answer;
    }
}