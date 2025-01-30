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
        if (a % 2 != 0 && b % 2 != 0) {
            return a * a + b * b;

        } else if (a % 2 != 0 || b % 2 != 0) {
            return 2 * (a + b);

        } else {
            return Math.abs(a - b);
        }
    }
}