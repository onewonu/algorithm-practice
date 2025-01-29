package basic.주사위_게임_1;

public class Solution114 {
    public static void main(String[] args) {
        Solution114 solution = new Solution114();
        runTest(solution, 3, 5);
        runTest(solution, 6, 1);
        runTest(solution, 2, 4);
    }

    private static void runTest(Solution114 solution, int a, int b) {
        int result = solution.solution(a, b);
        System.out.printf("solution(%d, %d) = %d%n", a, b, result);
    }

    public int solution(int a, int b) {
        int answer = 0;
        return answer;
    }
}