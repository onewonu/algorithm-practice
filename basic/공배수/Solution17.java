package basic.공배수;

public class Solution17 {
    public static void main(String[] args) {
        Solution17 solution17 = new Solution17();
        runTest(solution17, 60, 2, 3);
        runTest(solution17, 55, 10, 5);
    }

    private static void runTest(Solution17 solution, int number, int n, int m) {
        int result = solution.solution(number, n, m);
        System.out.printf("solution(%d, %d, %d) = %d%n", number, n, m, result);
    }

    public int solution(int number, int n, int m) {
        int answer = 0;
        if (number % n == 0 && number % m == 0) { answer = 1; }
        return answer;
    }
}