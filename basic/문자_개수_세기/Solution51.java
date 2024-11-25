package basic.문자_개수_세기;

import java.util.Arrays;

public class Solution51 {
    public static void main(String[] args) {
        Solution51 solution = new Solution51();
        runTest(solution, "Programmers");
    }

    private static void runTest(Solution51 solution, String my_string) {
        int[] result = solution.solution(my_string);
        System.out.printf("solution(%s) = %s%n", my_string, Arrays.toString(result));
    }

    public int[] solution(String my_string) {
        final int ALPHABET_COUNT = 26;
        int[] answer = new int[ALPHABET_COUNT * 2];

        for (char ch : my_string.toCharArray()) {
            int index = 0;
            if (Character.isUpperCase(ch)) index = ch - 'A';
            else if (Character.isLowerCase(ch)) index = ch - 'a' + ALPHABET_COUNT;

            answer[index]++;
        }

        return answer;
    }
}