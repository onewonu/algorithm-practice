package basic.정수_부분;

public class Solution103 {
    public static void main(String[] args) {
        Solution103 solution = new Solution103();
        runTest(solution, 1.42);
        runTest(solution, 69.32);
    }

    private static void runTest(Solution103 solution, double flo) {
        int result = solution.solution(flo);
        System.out.printf("solution(%f) = %s%n", flo ,result);
    }

    public int solution(double flo) {
        return (int) flo;
    }
}