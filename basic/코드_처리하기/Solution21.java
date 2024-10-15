package basic.코드_처리하기;

public class Solution21 {
    public static void main(String[] args) {
        Solution21 solution = new Solution21();
        runTest(solution, "abc1abc1abc");
    }

    private static void runTest(Solution21 solution, String code) {
        String result = solution.solution(code);
        System.out.printf("solution(%s) = %s%n", code, result);
    }

    public String solution(String code) {
        StringBuilder answer = new StringBuilder();

        int mode = 0;

        for (int i = 0; i < code.length(); i++) {
            char currentChar = code.charAt(i);

            if (currentChar == '1') {
                mode = 1 - mode;
            } else {
                if ((mode == 0 && i % 2 == 0) || (mode == 1 && i % 2 != 0)) {
                    answer.append(currentChar);
                }
            }
        }

        if (answer.length() == 0) { return "EMPTY"; }
        return answer.toString();
    }
}