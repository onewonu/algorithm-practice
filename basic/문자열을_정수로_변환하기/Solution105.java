package basic.문자열을_정수로_변환하기;

public class Solution105 {
    public static void main(String[] args) {
        Solution105 solution = new Solution105();
        runTest(solution, "10");
        runTest(solution, "8542");
    }

    private static void runTest(Solution105 solution, String n_str) {
        int result = solution.solution(n_str);
        System.out.printf("solution(%s) = %s%n", n_str, result);
    }

    public int solution(String n_str) {
        int answer = 0;
        return answer;
    }
}