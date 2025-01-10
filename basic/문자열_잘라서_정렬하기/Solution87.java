package basic.문자열_잘라서_정렬하기;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution87 {
    public static void main(String[] args) {
        Solution87 solution = new Solution87();
        runTest(solution, "axbxcxdx");
        runTest(solution, "dxccxbbbxaaaa");
    }

    private static void runTest(Solution87 solution, String myString) {
        String[] result = solution.solution(myString);
        System.out.printf("solution(%s) = %s%n", myString, Arrays.toString(result));
    }

    public String[] solution(String myString) {
        String[] xes = myString.split("x");
        List<String> filtered = new ArrayList<>();

        for (String s : xes) {
            if (!s.isEmpty()) {
                filtered.add(s);
            }
        }

        String[] answer = filtered.toArray(new String[0]);
        Arrays.sort(answer);
        return answer;
    }
}