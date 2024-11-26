package basic.글자_지우기;

import java.util.Arrays;

public class Solution53 {
    public static void main(String[] args) {
        Solution53 solution = new Solution53();
        runTest(solution, "apporoograpemmemprs", new int[] {1, 16, 6, 15, 0, 10, 11, 3});
    }

    private static void runTest(Solution53 solution, String my_string, int[] indices) {
        String result = solution.solution(my_string, indices);
        System.out.printf("solution(%s %s) = %s%n", my_string, Arrays.toString(indices), result);
    }

    public String solution(String my_string, int[] indices) {
        String answer = "";
        return answer;
    }
}