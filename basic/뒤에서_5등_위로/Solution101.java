package basic.뒤에서_5등_위로;


import java.util.Arrays;

public class Solution101 {
    public static void main(String[] args) {
        Solution101 solution = new Solution101();
        runTest(solution, new int[] { 12, 4, 15, 46, 38, 1, 14, 56, 32, 10 });
    }

    private static void runTest(Solution101 solution, int[] num_list) {
        int[] result = solution.solution(num_list);
        System.out.printf("solution(%s) = %s%n", Arrays.toString(num_list), Arrays.toString(result));
    }

    public int[] solution(int[] num_list) {
        int[] answer = {};
        return answer;
    }
}