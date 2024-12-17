package basic._5명씩;

import java.util.Arrays;

public class Solution67 {
    public static void main(String[] args) {
        Solution67 solution = new Solution67();
        runTest(solution, new String[] {"nami", "ahri", "jayce", "garen", "ivern", "vex", "jinx"});
    }

    private static void runTest(Solution67 solution, String[] names) {
        String[] result = solution.solution(names);
        System.out.printf("solution(%s) = %s%n", Arrays.toString(names), Arrays.toString(result));
    }

    private static final int GROUP_SIZE = 5;

    public String[] solution(String[] names) {
        int size = (names.length + GROUP_SIZE - 1) / GROUP_SIZE;
        String[] answer = new String[size];
        for (int i = 0; i < size; i++) answer[i] = names[i * GROUP_SIZE];
        return answer;
    }
}