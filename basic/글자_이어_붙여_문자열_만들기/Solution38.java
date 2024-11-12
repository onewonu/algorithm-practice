package basic.글자_이어_붙여_문자열_만들기;

import java.util.Arrays;
import java.util.HashMap;

public class Solution38 {
    public static void main(String[] args) {
        Solution38 solution = new Solution38();
        runTest(solution, "cvsgiorszzzmrpaqpe", new int[] { 16, 6, 5, 3, 12, 14, 11, 11, 17, 12, 7 });
        runTest(solution, "zpiaz", new int[] { 1, 2, 0, 0, 3 });
    }

    private static void runTest(Solution38 solution, String my_string, int[] index_list) {
        String result = solution.solution(my_string, index_list);
        System.out.printf("solution(%s, %s) = %s%n", my_string, Arrays.toString(index_list), result);
    }

    public String solution(String my_string, int[] index_list) {
        String answer = "";
        return answer;
    }
}