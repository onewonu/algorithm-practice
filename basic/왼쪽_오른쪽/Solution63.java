package basic.왼쪽_오른쪽;

import java.util.Arrays;

public class Solution63 {
    public static void main(String[] args) {
        Solution63 solution = new Solution63();
        runTest(solution, new String[] {"u", "u", "l", "r"});
        runTest(solution, new String[] {"u", "u", "r", "n", "n"});
        runTest(solution, new String[] {"l"});
    }

    private static void runTest(Solution63 solution, String[] str_list) {
        String[] result = solution.solution(str_list);
        System.out.printf("solution(%s) = %s%n", Arrays.toString(str_list), Arrays.toString(result));
    }

    public String[] solution(String[] str_list) {
        for (int i = 0; i < str_list.length; i++) {
            if (str_list[i].equals("l")) {
                return Arrays.copyOfRange(str_list, 0, i);
            } else if (str_list[i].equals("r")) {
                return Arrays.copyOfRange(str_list, i + 1, str_list.length);
            }
        }
        return new String[] {};
    }
}