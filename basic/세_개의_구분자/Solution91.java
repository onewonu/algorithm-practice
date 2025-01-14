package basic.세_개의_구분자;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution91 {
    public static void main(String[] args) {
        Solution91 solution = new Solution91();
        runTest(solution, "baconlettucetomato");
        runTest(solution, "abcd");
        runTest(solution, "cabab");
    }

    private static void runTest(Solution91 solution, String myStr) {
        String[] result = solution.solution(myStr);
        System.out.printf("solution(%s) = %s%n", myStr, Arrays.toString(result));
    }

    public String[] solution(String myStr) {
        String[] split = myStr.split("[abc]+");
        List<String> resultList = new ArrayList<>();

        for (String part : split) {
            if (!part.isEmpty()) {
                resultList.add(part);
            }
        }

        if (resultList.isEmpty()) {
            return new String[]{"EMPTY"};
        } else {
            return resultList.toArray(new String[0]);
        }
    }
}