package basic.flog에_따라_다른_값_반환하기;

public class Solution20 {
    public static void main(String[] args) {
        Solution20 solution = new Solution20();
        runTest(solution, -4,7, true);
        runTest(solution, -4,7, false);
    }

    private static void runTest(Solution20 solution, int a, int b, boolean flag) {
        int result = solution.solution(a, b, flag);
        System.out.printf("solution(%d%d%s) = %d%n", a, b, flag, result);
    }

    public int solution(int a, int b, boolean flag) {
        int answer = 0;
        return answer;
    }
}