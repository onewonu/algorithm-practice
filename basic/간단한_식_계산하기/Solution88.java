package basic.간단한_식_계산하기;

public class Solution88 {
    public static void main(String[] args) {
        Solution88 solution = new Solution88();
        runTest(solution, "43 + 12");
        runTest(solution, "0 - 7777");
        runTest(solution, "40000 * 40000");
    }

    private static void runTest(Solution88 solution, String binomial) {
        int result = solution.solution(binomial);
        System.out.printf("solution(%s) = %d%n", binomial, result);
    }

    public int solution(String binomial) {
        int answer = 0;
        return answer;
    }
}