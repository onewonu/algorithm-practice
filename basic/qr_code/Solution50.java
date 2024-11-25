package basic.qr_code;


public class Solution50 {
    public static void main(String[] args) {
        Solution50 solution = new Solution50();
        runTest(solution, 3, 1, "qjnwezgrpirldywt");
        runTest(solution, 1, 0, "programmers");
    }

    private static void runTest(Solution50 solution, int q, int r, String code) {
        String result = solution.solution(q, r, code);
        System.out.printf("solution(%d %d %s) = %s%n", q, r, code, result);
    }

    public String solution(int q, int r, String code) {
        StringBuilder answer = new StringBuilder();
        for (int i = r; i < code.length(); i += q) answer.append(code.charAt(i));
        return answer.toString();
    }
}