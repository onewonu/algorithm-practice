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
        String answer = "";

        int mode = 0;

        // TODO: 조건의 간소화 필요.
        for (int i = 0; i < code.length(); i++) {
            if (mode == 0) {
                if (code.charAt(i) != '1') {
                    if (i % 2 == 0) {
                        answer += code.charAt(i);
                    }
                } else {
                    mode = 1;
                }
            } else {
                if (code.charAt(i) != '1') {
                    if (i % 2 != 0) {
                        answer += code.charAt(i);
                    }
                } else {
                    mode = 0;
                }
            }
        }

        if (answer.isEmpty()) { answer = "EMPTY"; }

        return answer;
    }
}