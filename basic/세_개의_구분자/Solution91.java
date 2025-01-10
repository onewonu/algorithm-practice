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
        List<String> list = new ArrayList<>();
        StringBuilder builder = new StringBuilder();

        for (char c : myStr.toCharArray()) {
            if ("abc".indexOf(c) != -1) {
                if (builder.length() > 0) {
                    list.add(builder.toString());
                    builder.setLength(0);
                }
            } else {
                builder.append(c);
            }
        }

        if (builder.length() > 0) {
            list.add(builder.toString());
        }

        if (list.isEmpty()) {
            return new String[]{"EMPTY"};
        } else {
            return list.toArray(new String[0]);
        }
    }
}